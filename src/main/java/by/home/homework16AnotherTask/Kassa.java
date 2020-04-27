package by.home.homework16AnotherTask;

import java.util.ArrayDeque;
import java.util.ArrayList;

import static by.home.homework16AnotherTask.Customer.listOfCustomer;

public class Kassa extends Thread {

    public static void getSumOfThings (){
        ArrayDeque<Customer> arrayList = listOfCustomer();
        arrayList.forEach(System.out::println);

        for(Customer a : arrayList){                                                  //array customer
            System.out.println(a.getName());

            int sum = 0;
            ArrayList<String> listOfProducts = new ArrayList<>();
            for(Products products : a.getListThings()){
                listOfProducts.add(products.getNameOfProduct());
                sum += products.getCostOfProduct();
            }
            
            System.out.println("List of products" + listOfProducts);
            System.out.println("Cost of products - " + sum + "\n");
        }
    }

    @Override
    public void run() {
       Kassa.getSumOfThings();
    }
}
