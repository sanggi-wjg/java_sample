package cheat.sheet.sample.array;

import java.util.Arrays;


public class ArraySample {

    /*
     * 배열의 길이는 고정
     *
     * */

    public void basic_1() {
        int[] arr = new int[3];
        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 3;

        System.out.println(Arrays.toString(arr));
    }

    public void basic_2() {
        int[] arr = {1, 2, 3};

        System.out.println(Arrays.toString(arr));
        System.out.println(arr.length);
    }

    public void basic_3() {
        String[] week = {"월", "화", "수", "목", "금", "토", "일"};

        for (String day : week) {
            System.out.println(day);
        }
    }

}