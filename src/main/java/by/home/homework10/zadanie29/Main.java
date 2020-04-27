package by.home.homework10.zadanie29;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        String txt = "Вася, купы. сыру; сыру, сыру; Жонка дзе? вася hello .boy, Boy";
        txt = txt.replaceAll("[^A-Za-zА-Яа-яёЁ -]", "");
        System.out.println(txt);
        String[] array = txt.split(" ");

        List<String> arrayList1 = new ArrayList<String>(Arrays.asList(array));
        List<String> arrayList2 = new ArrayList<>();

        for(String con : arrayList1){
            long count = arrayList1.stream().filter(con::equalsIgnoreCase).count();
            String all = con + " " + count;
            arrayList2.add(all);
        }
        System.out.println(arrayList2);

        List<String> arrayList3 =  arrayList2
                .stream()
                .map(String::toLowerCase)
                .distinct()
                .sorted()
                .collect(Collectors.toList());
        arrayList3.forEach(System.out::println);
    }
}
