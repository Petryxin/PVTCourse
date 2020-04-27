package by.home.homework10.zadanie26;

import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class MainMark {

    public static void main(String[] args) {

/**
 * It's first variant when we have 4 class. Output name of pupils + their marks
 */
        //Visual.operation();
/**
 * It's second variant
 */

        //Create array with name
        final List<String> studentName = Arrays.asList("Anna", "Zhanna", "Olia","Petia","Kolia","Naza", "Grey");

        //Create random array with marks (2-10)
        final List <Integer> marks = new Random().ints(7,2,11)
                .boxed()
                .collect(Collectors.toList());

        System.out.println(marks);
        final List<Integer>  goodMarks = marks.stream().filter(x -> x > 5).collect(Collectors.toList());
        System.out.println(goodMarks);
    }
}
