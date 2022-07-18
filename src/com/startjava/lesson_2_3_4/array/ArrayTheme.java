package com.startjava.lesson_2_3_4.array;

import java.util.Random;
import java.util.Arrays;

public class ArrayTheme {

    public static void main(String[] args) {
        System.out.println("Реверс значений массива");
        int[] intArr = {1, 2, 3, 4, 5, 6, 7};
        for (int num : intArr) {
            System.out.printf("% d", num);
        }
        for (int i = 0; i < intArr.length / 2; i++) {
            int buffer = intArr[i];
            intArr[i] = intArr[intArr.length - 1 - i];
            intArr[intArr.length - 1 - i] = buffer;
        }
        System.out.println();
        ;
        for (int num : intArr) {
            System.out.printf("% d", num);
        }

        System.out.println("\n\nВывод произведения элементов массива");
        int[] numArr = new int[10];
        for (int i = 0; i < numArr.length; i++) {
            numArr[i] = i;
        }
        int result = 1;
        for (int i = 1; i < numArr.length - 1; i++) {
            result *= numArr[i];
            String symbol = (numArr[i] < numArr.length - 2) ? " * " : " = ";
            System.out.printf("%d%s", i, symbol);
        }
        System.out.print(result);
        System.out.printf("\nnumArr[0] = %d, numArr[9] = %d", numArr[0], numArr[9]);

        System.out.println("\n\nУдаление элементов массива");
        double[] doubleArr = new double[15];
        for (int i = 0; i < doubleArr.length; i++) {
            doubleArr[i] = Math.random();
        }
        System.out.println("Исходный массив");
        for (double fractional : doubleArr) {
            System.out.printf("%.2f  ", fractional);
        }
        int midpoint = doubleArr.length / 2;
        System.out.println("\nИзмененный массив");
        int counter = 0;
        for (int j = 0; j < doubleArr.length; j++) {
            if (doubleArr[j] > doubleArr[midpoint]) {
                doubleArr[j] = 0;
                counter++;
            }
            String format = doubleArr[j] == 0 ? "%.0f   " : "%.2f   ";
            System.out.printf(format, doubleArr[j]);
        }
        System.out.print("\nКоличество обнуленных ячеек = " + counter);

        System.out.println("\n\nВывод элементов массива лесенкой в обратном порядке");
        char[] alphabetArr = new char[26];
        for (int i = 0; i < alphabetArr.length; i++) {
            alphabetArr[i] = (char) (i + 65);
        }
        for (int i = 0; i <= alphabetArr.length; i++) {
            int k = alphabetArr.length;
            for (int j = 0; j < i; j++) {
                k--;
                System.out.print(alphabetArr[k]);
            }
            System.out.println();
        }

        System.out.println("\n\nГенерация уникальных чисел");
        Random random = new Random();
        int[] uniqueArr = new int[30];
        for (int i = 0; i < uniqueArr.length; i++) {
            while (true) {
                boolean label = false;
                int number = random.nextInt(41) + 60;
                for (int j = 0; j < i; j++) {
                    if (number == uniqueArr[j]) {
                        label = true;
                        break;
                    }
                }
                if (!label) {
                    uniqueArr[i] = number;
                    break;
                }
            }
        }
        int meter = 0;
        for (int j = 0; j < uniqueArr.length; j++) {
            meter++;
            if (meter == 11) {
                System.out.println();
                meter = 1;
            }
            Arrays.sort(uniqueArr);
            System.out.printf("%4s", uniqueArr[j]);
        }

        System.out.println("\n\nСдвиг элементов массива");
        String[] shiftsArr = {" ", "AA", " ", " ", "BBB", "C", " ", "DDDD"};
        int indexLength = shiftsArr.length;
        int[] indexPosition = new int[9];
        int i = -1;
        for (String shift:shiftsArr) {
            i ++;
            if (shift.isBlank()) {
                indexLength--;
            } else if (!shift.isBlank()) {
                indexPosition[i] = i;
            }
            System.out.print(shift);
        }
//        int[] indexPosition = {1, 4, 5, 7};
        System.out.println();
        for (int num : indexPosition) {
            System.out.printf("% d", num);
        }
        String[] shiftsArrCopy = new String[indexLength];
        for(int k = 0; k < indexLength; k++){
            System.arraycopy(shiftsArr, indexPosition[k], shiftsArrCopy, k, 1);
        }
        System.out.println();
        for (String shiftCopy:shiftsArrCopy) {
            System.out.print(shiftCopy);
        }

    }
}


