package by.home.homework16;

import java.util.ArrayList;

public class Kassa {

    public void getListOfThings (ArrayList<Products> arrayList) {

        int sum = 0;
        for (Products i : arrayList) {

            sum += i.getCostOfProduct();
            System.out.println("List of products: " + i.getNameOfProduct() + "  " + i.getCostOfProduct());
        }
        System.out.println("Sum of products " + sum + "\n");

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.getMessage();
        }
    }
}

