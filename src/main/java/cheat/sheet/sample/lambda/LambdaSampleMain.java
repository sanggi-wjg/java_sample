package cheat.sheet.sample.lambda;


public class LambdaSampleMain {

    public static void one() {
        // 여러개의 파라미터의 경우
        MyLambdaInterface myLambda = (String s1, String s2, String s3) -> {
            System.out.println(s1 + " " + s2 + " " + s3);
        };
        myLambda.something("a", "b", "c");
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

    public static void main(String[] args) {


    }

}
