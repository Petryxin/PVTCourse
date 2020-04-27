package by.home.homework1;

import java.util.Scanner;

public class Zadanie5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x, y, n;
        System.out.println("введите число");
        x = scanner.nextInt();
        if(x<0)
            System.out.println("Не верный формат ввода - отрицательное значение" + x);

        n = x % 100;
        y = x % 10;

        if (n == 11 || n == 12 || n == 13 || n == 14 || n == 0 && x > 0)//дублирование, х и так больше 0
            System.out.println(x + " рублей");
        else if (y >= 2 && y <= 4)
            System.out.println(x + " рубля");
        else if (y == 1)
            System.out.println(x + " рубль");
        else {
            System.out.println(x + " рублей");
        }

    }
}
