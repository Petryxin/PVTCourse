package by.home.homework16;

import java.util.ArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {

    /**
     * С помощью ExecutorService создается фиксированный пул из двух потоков исполнения executor и четыре потока.
     *  Сервис executor стартует все 4 потока на исполнение.
     *  Таким образом, четыре потока должны совместно использовать пул из двух потоков.
     *   Первые попавшие в пул потоки приступают к исполнению.
     *   Оставшие переходят в режим ожидания и вступают в работу по мере освобождения пула.
     *
     *   Ограничем числа касс и соответственно количеством одновременно обслуживаемых покупателей,
     *   является newFixedThreadPool().
     */
    public static void main(String[] args) {

        ArrayList<Products> newList1 = new ArrayList<>();
        ArrayList<Products> newList2 = new ArrayList<>();
        ArrayList<Products> newList3 = new ArrayList<>();
        ArrayList<Products> newList4 = new ArrayList<>();
        ArrayList<Products> newList5 = new ArrayList<>();
        ArrayList<Products> newList6 = new ArrayList<>();

        newList1.add(new Products("Milk",1   ));
        newList2.add(new Products("Coffee ",2));
        newList3.add(new Products("Apple  ",3));
        newList4.add(new Products("Pizza  ",4));
        newList5.add(new Products("Tea    ",5));
        newList6.add(new Products("Indian grass",6));

        Customer cust1 = new Customer(newList1, "Customer 1");
        Customer cust2 = new Customer(newList2, "Customer 2" );
        Customer cust3 = new Customer(newList3, "Customer 3" );
        Customer cust4 = new Customer(newList4, "Customer 4" );
        Customer cust5 = new Customer(newList5, "Customer 5" );
        Customer cust6 = new Customer(newList6, "Customer 6" );

        int numberOfKass = 2;
        ExecutorService executor = Executors.newFixedThreadPool(numberOfKass);

        executor.execute(cust1);
        executor.execute(cust2);
        executor.execute(cust3);
        executor.execute(cust4);
        executor.execute(cust5);
        executor.execute(cust6);

        executor.shutdown();
    }

}

