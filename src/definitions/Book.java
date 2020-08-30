/*  Created by IntelliJ IDEA.
 *  User: Divyansh Bhardwaj (dbc2201)
 *  Date: 21/08/20
 *  Time: 3:49 PM
 *  File Name : Book.java
 * */
package definitions;

import java.util.Objects;

public class Book {
    private String nameOfTheBook;
    private String nameOfTheAuthor;
    private String isbnNumberOfBook;

    //constructor
    public Book() {
        nameOfTheBook = "The Secrets";
        nameOfTheAuthor = "Rhonda Byrne";
        isbnNumberOfBook = "6986756348656";
    }

    public Book(String isbnNumberOfBook) {
        nameOfTheBook = "Database Management System";
        nameOfTheAuthor = "f.Korth";
        this.isbnNumberOfBook = isbnNumberOfBook;
    }

    public Book(String nameOfTheBook, String nameOfTheAuthor) {
        this.nameOfTheBook = nameOfTheBook;
        this.nameOfTheAuthor = nameOfTheAuthor;
        isbnNumberOfBook = "9097864325861";
    }

    public Book(String nameOfTheBook, String nameOfTheAuthor, String isbnNumberOfBook) {
        this.nameOfTheBook = nameOfTheBook;
        this.nameOfTheAuthor = nameOfTheAuthor;
        this.isbnNumberOfBook = isbnNumberOfBook;
    }

    //getter methods
    public String getNameOfTheBook() {
        return nameOfTheBook;
    }

    public String getNameOfTheAuthor() {
        return nameOfTheAuthor;
    }

    public String getIsbnNumberOfBook() {
        return isbnNumberOfBook;
    }

    //setter methods
    public void setNameOfTheBook(String nameOfTheBook) {
        this.nameOfTheBook = nameOfTheBook;
    }

    public void setNameOfTheAuthor(String nameOfTheAuthor) {
        this.nameOfTheAuthor = nameOfTheAuthor;
    }

    public void setIsbnNumberOfBook(String isbnNumberOfBook) {
        this.isbnNumberOfBook = isbnNumberOfBook;
    }

    @Override
    public String toString() {
        return ("Name of the book is \"" + getNameOfTheBook() + "\". Its is written by \"" + getNameOfTheAuthor() + "\".Its ISBN number is \"" + getIsbnNumberOfBook() + "\".");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Book book = (Book) o;
        return Objects.equals(getIsbnNumberOfBook(), book.getIsbnNumberOfBook()) && Objects.equals(getNameOfTheAuthor(), book.getNameOfTheAuthor()) && Objects.equals(getIsbnNumberOfBook(), book.getIsbnNumberOfBook());
    }

    //@Override
    public int hashcode() {
        return Objects.hash(getIsbnNumberOfBook(), getNameOfTheAuthor(), getIsbnNumberOfBook());
    }
}
