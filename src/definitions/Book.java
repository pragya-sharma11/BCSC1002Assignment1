/*  Created by IntelliJ IDEA.
 *  User: Divyansh Bhardwaj (dbc2201)
 *  Date: 21/08/20
 *  Time: 3:49 PM
 *  File Name : Book.java
 * */
package definitions;

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
}
