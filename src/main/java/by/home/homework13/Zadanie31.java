package by.home.homework13;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Zadanie31 {
    public static void main(String[] args){
        String fileText = "Погода за окном шикарная 29 градусов, нету снега 30, нету дождя 30 да ну. " +
                "Никто не проверяет орфаграфию в блакноте. But I do not have time!!! You have to work more!!";

        File file = new File("C:\\Users\\Артем\\Desktop\\fileText.txt");

        List<String> array = convertToArray(readFile(file));
        getSum(array);
        List<String> newArray = getArrayWithoutSimpleNumber(array);
        System.out.println("New Array  " + newArray);

    }
    private static String readFile (File file){
        String text = null;
        try(BufferedReader bufferedReader = new BufferedReader(new FileReader(file))){
            text  = bufferedReader.readLine();
        }catch (IOException e){
            System.out.println("we have problem with file");
        }
        return text;
    }

    private static List<String> convertToArray (String text){
        text = text.replaceAll("[^0-9 ]", "");
        List<String> string = new ArrayList<>(Arrays.asList(text.split("[ ]+")));
        string.remove(0);
        System.out.println("Array without words  " + string);
        return string;
    }

    private static void getSum (List<String> string){
        Optional<Integer> sum = string.stream()
                .map(Integer::parseInt)
                .reduce(Integer::sum);
        System.out.println("Sum of number in text - " + sum.get());
    }

    private static List<String> getArrayWithoutSimpleNumber (List<String> string){
        return string.stream().distinct().collect(Collectors.toList());
    }
}
