package com.company;

public class Multiply {
    /*
    * 1 -2 -90 100  70 2 -80
    * */
    public static Integer multiply(int[] numbers){
        Integer countNegative = 0;

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == 0) {
                return 0;
            }
            if (numbers[i] < 0) {
                countNegative += 1;
            }
        }

        if (countNegative % 2 != 0) {
            return -1;
        }

        return 1;
    }

    public static void main(String args[]) {
        int[] numbers = new int[] {1, -2, -90, 100, 70, 2, -80};
        System.out.println(Multiply.multiply(numbers));
    }
}
