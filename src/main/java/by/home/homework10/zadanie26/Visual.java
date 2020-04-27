package by.home.homework10.zadanie26;

import java.util.Scanner;

public class Visual {
    public static void operation() {
        Service service = new Service();
        Scanner scanner = new Scanner(System.in);

        String menu = "\n Chose: \n 1 - Mark of pupils \n 2 - exit \n 3 - del bad mark";
        System.out.println(menu);
        int t; // вспомогательная переменная для выхода из цикла while

        while (true) {
            switch (t = scanner.nextInt()) {
                case 1:
                    service.getInfo();
                    break;
                case 2:
                    break;
                case 3:
                    service.getBadPupils();
            }
            if (t == 2)
                break;
        }
    }
}
