package cheat.sheet.sample.operator;

public class OperatorSample {

    public void basic() {
        int x = 10, y = 20;
        boolean b_result = true;
        b_result = x == y;
        System.out.println(b_result);

        int i_result = 0;
        i_result = x == y ? 100 : 200;
        System.out.println(i_result);
    }
}
