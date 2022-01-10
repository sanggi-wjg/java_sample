package cheat.sheet;

import java.util.Arrays;

public class ArraySample {

    public void basic_1() {
        int[] arr = new int[3];
        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 3;

        System.out.println(Arrays.toString(arr));

        int[] i_arr = {1, 2, 3};
        System.out.println(Arrays.toString(i_arr));
        System.out.println(i_arr.length);
    }

}
