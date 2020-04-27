package by.home.homework13;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

public class Zadanie30 {
    public static void main(String[] args){
        String fileText = "Погода за окном шикарная, нету снега, нету дождя. Никто не проверяет орфаграфию в блакноте." +
                " But I do not have time!!! You have to work more!";

        File file = new File("C:\\Users\\Артем\\Desktop\\fileText.txt");

        String text = readFile(file);
        sumOfWords(text);
        sumOfSymbols(text);
    }

   private static String readFile (File f){
       String fileWithText = null;
       try (BufferedReader bufferedReader = new BufferedReader(new FileReader(f))) {
           fileWithText = bufferedReader.readLine();
       }catch (IOException e){
           System.out.println("not file");
       }
       return fileWithText;

   }
   private static void sumOfWords (String text){
        text = text.replaceAll("[^A-Za-zА-Яа-яё -]", "");
        ArrayList <String> string = new ArrayList<>(Arrays.asList(text.split("[ ]+")));
        System.out.println("Sum of words - "  + string.size());
    }

    private static void sumOfSymbols (String text){
        text = text.replaceAll("[A-Za-zА-Яа-яё0-9 -]", "");
        ArrayList <String> string = new ArrayList<>(Arrays.asList(text.split("")));
        string.remove(0);
        System.out.println("Sum of sumbol - " + string.size());
    }
}
