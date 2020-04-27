package by.home.homework11;


import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class Zadanie28 {
    public static void main(String[] args) {
        final List<Integer> marks = new Random().ints(7,0,11)
                .boxed()
                .collect(Collectors.toList());
        System.out.println(marks.toString());

        Iterator<Integer> iterator = marks.iterator();
        int i = 0;
        while (iterator.hasNext()){
            int h = iterator.next();
            if (i < h){
                i = h;
            }
        }
        System.out.println("Max mark is - " + i);
    }
}
