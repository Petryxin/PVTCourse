package by.home.homework15;

import java.io.*;
import java.util.ArrayList;
import java.util.stream.Collectors;

public class Service {
    final static String path = ".\\books\\books.txt";

    protected static void writeClassOfBooks(ArrayList<Object> books){
        File file = new File(path);
        File directory = file.getParentFile();
        directory.isDirectory();
        directory.mkdir();

        try {
            file.createNewFile();
        } catch (IOException e) {
            e.getMessage();
        }

        try(ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(path))){
            for(Object object : books){
                objectOutputStream.writeObject(object);
            }
        }catch(IOException e){
            e.getMessage();
        }
    }

    protected static ArrayList<Books> readListOfBooks(){
        ArrayList<Books> listBooks = new ArrayList();
        try (ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(path))){
            while (new FileInputStream(path).available() != -1){
                Books book = (Books) objectInputStream.readObject();
                listBooks.add(book);
            }
        }catch (IOException e){
            e.getMessage();
            e.getCause();
        }catch (ClassNotFoundException e){
            e.getMessage();
            e.getCause();
        }
        return listBooks;
    }

    public static void printGroupOfAuthor (ArrayList<Books> listBooks){
        listBooks.stream()
                .collect(Collectors.groupingBy(Books::getAuthor))
                .entrySet().forEach(System.out::println);
    }
}
