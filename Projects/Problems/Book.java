/*
Write a Java program to create a class called "Book"
with attributes for title, author, and ISBN, and methods
to add and remove books from a collection.
*/

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Book {
    String title;
    String author;
    String ISBN;

    Book() {
    }

    void removeBook(){
        this.author=null;
        this.ISBN = null;
        this.title = null;
    }
    void addBook(String title,String author, String ISBN) {
        this.author=author;
        this.ISBN =ISBN;
        this.title = title;
    }
    
    // 🔑 save book data to text file
    void saveToFile() {
        try {
            BufferedWriter bw = new BufferedWriter(
                new FileWriter("books.txt", true) // true = append mode
            );

            bw.write(title + " | " + author + " | " + ISBN);
            bw.newLine();
            bw.close();

        } catch (IOException e) {
            System.out.println("File error: " + e.getMessage());
        }
    }


    
}
