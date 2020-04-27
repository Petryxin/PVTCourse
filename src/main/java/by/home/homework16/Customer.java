package by.home.homework16;

import java.util.ArrayList;

public class Customer implements Runnable{
    private ArrayList<Products> listThings;
    protected static String name;
    Kassa kassa = new Kassa();

    public Customer(ArrayList<Products> listOfThings, String name) {
        this.name = name;
        this.listThings = listOfThings;

    }

    @Override
    public void run() {
        kassa.getListOfThings(listThings);

    }

    public ArrayList<Products> getListThings() {
        return listThings;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "listThings=" + listThings +
                ", kassa=" + kassa +
                '}';
    }
}
