package by.home.homework10.zadanie26;

import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class ClassMark {

        //Create array with name
        final List<String> studentName = Arrays.asList("Anna", "Zhanna", "Olia","Petia","Kolia","Naza", "Grey");

        //Create random array with marks (2-10)
        final List <Integer> marks = new Random().ints(7,2,11)
                .boxed()
                .collect(Collectors.toList());

        //Array with bad mark
        final List<Integer> badMarks = Arrays.asList(2, 3, 4, 5);


    public List<Integer> getBadMarks() {
        return badMarks;
    }

    public List<String> getStudentName() {
        return studentName;
    }

    public List<Integer> getMarks() {
        return marks;
    }
}
