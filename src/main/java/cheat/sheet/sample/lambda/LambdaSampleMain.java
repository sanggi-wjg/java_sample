package cheat.sheet.sample.lambda;


import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class LambdaSampleMain {

    public static void one() {
        /// 람다식
        // 여러개의 파라미터의 경우
        MyLambdaInterface myLambda = (String s1, String s2, String s3) -> {
            System.out.println(s1 + " " + s2 + " " + s3);
        };
        myLambda.something("a", "b", "c");

        // 함수형 인터페이스
        MyLambdaInterface myLambdaInterface = new MyLambdaInterface() {
            @Override
            public void something(String s1, String s2, String s3) {
                System.out.println(s1 + " " + s2 + " " + s3);
            }
        };
        myLambdaInterface.something("d", "e", "f");
    }


    public static void two() {
        // 단일 파리미터의 경우
        MyLambdaInterface2 lambda_1 = (s1) -> {
            System.out.println(s1);
        };
        lambda_1.something("1");

        MyLambdaInterface2 lambda_2 = s1 -> {
            System.out.println(s1);
        };
        lambda_2.something("2");

        MyLambdaInterface2 lambda_3 = System.out::println;
        lambda_3.something("3");
    }

    public static void three() {
        MyLambdaInterface3 sample = (s1) -> {
            return "@" + s1 + "@";
        };

        String res = sample.something("Snow");
        System.out.println(res);
    }

    public static void funcInterface() {
        /*
         * https://devkingdom.tistory.com/292?category=941391
         * */

        /*
         * Supplier
         * 매개변수는 따로 없고 반환값만 존재하는 함수형 인터페이스
         *
         * T get() 추상 메소드가 있다
         * */
        Supplier<String> supplier = () -> "This is Supplier";
        System.out.println(supplier.get());
        System.out.println("====================================================================");

        /*
         * Consumer
         * 객체 T를 매개변수로 받아서 사용하고 No Return 함수형 인터페이스
         *
         * void accept(T t) : 하나의 함수가 끝났을때 다음 Consumer 를 계속해서 사용할수 있다.
         * */
        Consumer<String> consumer1 = s -> System.out.print("[" + s);
        Consumer<String> consumer2 = s -> System.out.println("]");
        consumer1.andThen(consumer2).accept("Consumer");
        System.out.println("====================================================================");

        /*
         * Function
         * 객체 T를 매개변수로 받아서 로직을 처리하고 R을 Return 하는 함수형 인터페이스
         *
         * R apply(T t)
         *
         * andThen 관련
         * https://seeminglyjs.tistory.com/250
         * */
        Function<String, Boolean> isContainFunction = s -> s.contains("a");
        Function<String, Boolean> isEqualFunction = s -> s.equals("abc");

        Boolean isContainFunctionResult = isContainFunction.apply("abc");
        System.out.println("Function: " + isContainFunctionResult);

        Function<String, Function<String, Boolean>> function = isContainFunction.andThen(t -> isEqualFunction);
        Boolean functionResult = function.apply("abc").apply("a");
        System.out.println("functionResult = " + functionResult);
        System.out.println("====================================================================");

        /*
         *
         * */
        String testString = "abc";

        Predicate<String> predicateContain = s -> s.contains("a");
        Predicate<String> predicateEqual = s -> s.equals("abc");

        boolean predicateResult = predicateContain.test(testString);
        System.out.println("Predicate: " + predicateResult);

        boolean predicateAndResult = predicateContain.and(predicateEqual).test(testString);
        System.out.println("Predicate And: " + predicateAndResult);

        boolean predicateOrResult = predicateContain.or(predicateEqual).test(testString);
        System.out.println("Predicate Or: " + predicateOrResult);
    }


    public static void main(String[] args) {
        funcInterface();
    }

}
