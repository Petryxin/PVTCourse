package by.home.homework1;

import java.util.Scanner;

public class Zadanie6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x, y, z;
        System.out.println("введите день");
        System.out.println("введите месяц");
        System.out.println("введите год");
        x = scanner.nextInt();
        y = scanner.nextInt();
        z = scanner.nextInt();

        if ( x<32 && y<13) {                                        //ограничение по кол-ву дней

        if (x == 30) {                                      //условия при котороых меняется месяц или год
                if (y == 4 || y == 6 || y == 9 || y == 11 ) {
                    System.out.println("Next day " + 1 + "." + (y + 1) + "." + z);
                }
            }
        if (x == 31) {
                if (y == 1 || y == 3 || y == 5 || y == 7 || y == 8 || y == 10) {
                    System.out.println("Next day " + 1 + "." + (y + 1) + "." + z);
                } else if (y == 12) {
                    System.out.println("Next day " + 1 + "." + 1 + "." + (z + 1));
                }
            }

        if (z % 4 == 0 && y==2 && x == 28){
            System.out.println("Next day " + (x + 1) + "." + y + "." + z);
        }else if (z % 4 == 0 && y==2 && x == 29){
            System.out.println("Next day " + 1 + "." + (y + 1) + "." + z);
        }else if (z % 4 != 0 && y==2 && x == 28){
                System.out.println("Next day " + 1 + "." + (y + 1) + "." + z);
            }else if (y==2 && x>28) {
                System.out.println("no data");
            } else{
                System.out.println("Next day " + (x + 1) + "." + y + "." + z);
            }
            } else {
            System.out.println("no data");
        }
        }
    }




