package cheat.sheet.sample;

public class PrintFormatSample {

    public void basic() {
        System.out.printf("10진수 : %d\n", 10);
        System.out.printf("16진수 : %x\n\n", 10);

        System.out.printf("문자 : %c\n", 'a');
        System.out.printf("문자열 : %s\n\n", "ABC");

        System.out.printf("실수 : %f\n", 10.123);
        System.out.printf("실수 : %.0f\n", 10.123);
        System.out.printf("실수 : %.1f\n", 10.123);
        System.out.printf("실수 : %.2f\n", 10.123);
        System.out.printf("실수 : %.3f\n", 10.123);
        System.out.printf("실수 : %.4f\n", 10.123);

    }

}
