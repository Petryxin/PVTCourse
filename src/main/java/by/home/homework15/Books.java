package by.home.homework15;

import java.io.Serializable;

public class Books implements Serializable {
    private String author;
    private String nameOfBook;

    protected Books (String nameOfBook, String author){
        this.author = author;
        this.nameOfBook = nameOfBook;
    }

    public String getAuthor() {
        return author;
    }

    public String getNameOfBook() {
        return nameOfBook;
    }

    @Override
    public String toString() {
        return "Books{" +
                "author='" + author + '\'' +
                ", nameOfBook='" + nameOfBook + '\'' +
                '}';
    }
}
