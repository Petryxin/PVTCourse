package by.home.homework10.zadanie27;

import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

/**
 * Delete same marks
 */
public class Main {

    public static void main(String[] args) {
        List<Integer> list = new Random().ints(10, 2, 11)
                .boxed()
                .collect(Collectors.toList());
        System.out.println(list.toString());

        List<Integer> newList = list.stream()
                .distinct()
                .collect(Collectors.toList());
        System.out.println(newList.toString());

/*
        //second variant with "for"
        for(int i = 0; i < list.size(); i++) {
            for (int j = i + 1; j < list.size(); j++){
                if (list.get(i) == list.get(j)) {
                    list.remove(j);
                }
            }
        }
        System.out.println(list.toString());
 */
    }
}
