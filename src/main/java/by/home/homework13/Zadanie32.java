package by.home.homework13;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class Zadanie32 {
    public static void main(String[] args){
        File file = new File("Number.txt");

        writeFile(file);
        IntStream stream = integerToInt(readFile(file));
        double average = averageOfNumbers(stream);
        System.out.println("Average of numbers - " + average);
    }

    private static double averageOfNumbers(IntStream stream) { //можно было сразу Integer in mapToDouble
        double result = stream
                .average()
                .getAsDouble();
        return result;
    }

    private static IntStream integerToInt(List<Integer> list) {
        return list.stream().mapToInt(Integer::valueOf);
    }

    private static void writeFile(File file){
        try(DataOutputStream dataOutputStream = new DataOutputStream(new BufferedOutputStream(new
                FileOutputStream(file)))) {
            for (int i = 0; i < 20; i++) {
                int j = (int) (Math.random() * 20 + 1);
                dataOutputStream.writeInt(j);
            }
        }catch (IOException e) {
            System.out.println("File not found");
        }
    }

    private static List<Integer> readFile(File file) {
        List<Integer> integerList = new ArrayList<>();
        try (DataInputStream dataInputStream = new DataInputStream(new BufferedInputStream(new FileInputStream(file)))) {
            int res = dataInputStream.readInt();
            while (dataInputStream.available() > 0) {
                    integerList.add(res);
                    res = dataInputStream.readInt();
                }
            } catch(IOException e){
                System.out.println("problem with file");
            }
            System.out.println(integerList);
            return integerList;
        }
    }