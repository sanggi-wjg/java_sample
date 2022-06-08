package cheat.sheet.sample.lambda;


import java.util.function.Consumer;
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
        Supplier<String> supplier = () -> "Hi Hello";
        System.out.println(supplier.get());

        /*
        * Consumer
        * 객체 T를 매개변수로 받아서 사용하고 No Return 함수형 인터페이스
        *
        * void accept(T t) 추상 메소드가 있다. 이 함수를 이용하면 하나의 함수가 끝났을때 다음 Consumer 를 계속해서 사용할수 있다.
        * */
        Consumer<String> consumer1 = s -> System.out.println("Hi " + s);
        Consumer<String> consumer2 = s -> System.out.println("World");
        consumer1.andThen(consumer2).accept("Snow");
    }



    public static void main(String[] args) {
        funcInterface();
    }

}
