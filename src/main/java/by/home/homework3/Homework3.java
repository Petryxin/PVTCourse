package by.home.homework3;

import java.util.Arrays;

public class Homework3 {
    public static void main(String[] args) {
        // Zadanie 14

        int[] marks = {12, 2, 3, 5, 1 };
       int maxMarkIndex = marks[0];
       int indexM = 0;//зачем надо ее определать т.е. присваивать значение

        for (int a = 0; a < marks.length; a++) {
            if (maxMarkIndex < marks[a]) {
                maxMarkIndex = marks[a];
                indexM = a;
            }
        }
        System.out.println("index of max mark is " + indexM);

        // Zadan 15

        int sum = 0;
        int indexMin = 0;
        int indexMax = 0;
        int maxValue = marks[0];
        int minValue = marks[0];

        for (int a = 0; a < marks.length; a++) {
            if (maxValue < marks[a]) {
                maxValue = marks[a];
                indexMax = a;
            }
        }
        for (int a = 0; a < marks.length; a++) {
            if (minValue > marks[a]) {
                minValue = marks[a];
                indexMin = a;
            }
        }
        int x = Math.min(indexMax, indexMin);
        int y = Math.max(indexMax, indexMin);

        for (int i = x+1; i < y; i++) {
                sum += marks[i];
            }
        System.out.println("The amount of elements array is " + sum);

        // Zadanie 16

        int temp;
        int n = marks.length;
        for (int s = 0; s < n/2; s++) {
            temp = marks[n - s - 1];
            marks[n - s - 1] = marks[s];
            marks[s] = temp;
        }
        System.out.println(Arrays.toString(marks));

        //Zadanie 17
        int[][] m = new int[10][10];
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                if ((i > j) && (j < (m[i].length - i - 1))) {
                    m[i][j] = 0;
                } else if ((i < j) && (j > m[i].length - i - 1)) {
                    m[i][j] = 0;
                } else m[i][j] = 1;
                System.out.print(m[i][j] + " ");
            }
            System.out.println();
        }

        }
    }






