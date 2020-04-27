package by.home.homework16AnotherTask;

import java.util.ArrayDeque;
import java.util.ArrayList;

import static by.home.homework16AnotherTask.Products.addProducts;

public class Customer {

    private ArrayList<Products> listThings;
    private String name;

    public Customer(ArrayList<Products> list, String name) {
        this.listThings = list;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "listThings=" + listThings +
                ", name='" + name + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public static ArrayDeque<Customer> listOfCustomer (){

        ArrayList<Products> newList1 = new ArrayList<>();
        ArrayList<Products> newList2 = new ArrayList<>();
        ArrayList<Products> newList3 = new ArrayList<>();
        ArrayList<Products> newList4 = new ArrayList<>();
        ArrayList<Products> newList5 = new ArrayList<>();
        ArrayList<Products> newList6 = new ArrayList<>();

        Customer cust1 = new Customer(addProducts(newList1), "Customer 1");
        Customer cust2 = new Customer(addProducts(newList2), "Customer 2");
        Customer cust3 = new Customer(addProducts(newList3), "Customer 3");
        Customer cust4 = new Customer(addProducts(newList4), "Customer 4");
        Customer cust5 = new Customer(addProducts(newList5), "Customer 5");
        Customer cust6 = new Customer(addProducts(newList6), "Customer 6");

        ArrayDeque<Customer> listCustomer = new ArrayDeque<>();
        listCustomer.add(cust1);
        listCustomer.add(cust2);
        listCustomer.add(cust3);
        listCustomer.add(cust4);
        listCustomer.add(cust5);
        listCustomer.add(cust6);
        return listCustomer;
    }

    public ArrayList<Products> getListThings() {
        return listThings;
    }

    /*newList1.add(new Products("Milk",1));
        newList2.add(new Products("Coffee ",2));
        newList3.add(new Products("Apple  ",3));
        newList4.add(new Products("Pizza  ",4));
        newList5.add(new Products("Tea    ",5));
        newList6.add(new Products("Indian grass",6));*/
}
