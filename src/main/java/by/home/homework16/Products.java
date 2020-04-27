package by.home.homework16;

import java.util.ArrayList;
import java.util.Scanner;

public class Products {
    private String nameOfProduct;
    private int costOfProduct;

    public Products(String name, int sum) {
        this.nameOfProduct = name;
        this.costOfProduct = sum;
    }

    public static void addProducts(ArrayList<Products> products){   //don't use because to long check code

        Scanner scanner = new Scanner(System.in);
        String menu = "\n Введите номер продукта для добавления в корзину: \n 1 - Milk \n 2 - Coffee \n 3 - Apple \n 4 - Orange \n 5 - Exit";
        System.out.println(menu);
        int t; // вспомогательная переменная для выхода из цикла while

        while (true) {
            switch (t = scanner.nextInt()) {
                case 1:
                    products.add(new Products("Milk",2));
                    System.out.println("Operation has been successful");
                    break;
                case 2:
                    products.add(new Products("Coffee",16));
                    System.out.println("Operation has been successful");
                    break;
                case 3:
                    products.add(new Products("Apple",3));
                    System.out.println("Operation has been successful");
                    break;
                case 4:
                    products.add(new Products("Orange",4));
                    System.out.println("Operation has been successful");
                    break;
                case 5:
                    break;
            }
            if (t == 5)
                break;
        }
        System.out.println("after while");
        System.out.println();
    }

    public String getNameOfProduct() {
        return nameOfProduct;
    }

    public int getCostOfProduct() {
        return costOfProduct;
    }
}
