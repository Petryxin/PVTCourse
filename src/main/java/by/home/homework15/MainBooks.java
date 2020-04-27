package by.home.homework15;

import java.util.ArrayList;

public class MainBooks {
    public static void main(String[] args) {
        ArrayList<Object> listOfBook = new ArrayList<>();
        listOfBook.add(new Books("Хан", "Як"));
        listOfBook.add(new Books("Сок", "Ясь"));
        listOfBook.add(new Books("Сок без воды", "Ясь"));
        listOfBook.add(new Books("Носки", "Мужик"));
        listOfBook.add(new Books("Ппиво + вобла", "Мужик"));
        listOfBook.add(new Books("Гараж", "Мужик"));
        listOfBook.add(new Books("На рыбалке", "Мужик"));

        Service.writeClassOfBooks(listOfBook);

        ArrayList<Books> newListOfBooks = Service.readListOfBooks();
        System.out.println(newListOfBooks);

        Service.printGroupOfAuthor(newListOfBooks);
    }
}
