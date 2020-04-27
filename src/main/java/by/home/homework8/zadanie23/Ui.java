package by.home.homework8.zadanie23;

import java.io.IOException;
import java.util.Scanner;

public class Ui {

    public static void interfaceOfAtm() throws IOException {
        ServiceForUser service = new ServiceForUser();
        Scanner scanner = new Scanner(System.in);

        String menu = "\n Выберете операцию: \n 1 - Баланс \n 2 - Пополнить карту \n 3 - Снять деньги \n 4 - выход";
        System.out.println(menu);
        int t; // вспомогательная переменная для выхода из цикла while

        while (true) {
            switch (t = scanner.nextInt()) {
                case 1:
                    service.balance();
                    break;
                case 2:
                    System.out.print("Введите сумму: ");
                    service.addMoney(scanner.nextInt());
                    break;
                case 3:
                    System.out.print("Введите сумму: ");
                    service.withdrawMoney(scanner.nextInt());
                    break;
                case 4:
                    break;
                case 5:
                   service.balanceatm();

                    break;
            }
            if (t == 4)
                break;
        }
    }
}
