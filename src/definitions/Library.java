/*  Created by IntelliJ IDEA.
 *  User: Divyansh Bhardwaj (dbc2201)
 *  Date: 21/08/20
 *  Time: 3:50 PM
 *  File Name : Library.java
 * */
package definitions;

public class Library {
    private Book[] availableBooks;
    private int numberOfAvailableBooks;
    private final String[] availableBooksList = {"Let us Python", "Let us C", "Pointer in C", "Database Management System", "SOftware Engineering"};
    private final String[] authorsCorrespondingToAvailableBooks = {"Yashwant kanetkar", "Yashwant kanetkar", "Yashwant kanetkar", "f.Korth and Navathe", "Somervielle"};
    private final String[] isbnNumberCorrespondingToAvailableBooks = {"9897400406763", "9557620104453", "6788586790345", "8195175385245", "9518524567535"};

    //Constructor
    public Library() {
        numberOfAvailableBooks = 5;
        availableBooks = new Book[numberOfAvailableBooks];
        for (int index = 0; index < availableBooks.length; index++) {
            availableBooks[index] = new Book(availableBooksList[index], authorsCorrespondingToAvailableBooks[index], isbnNumberCorrespondingToAvailableBooks[index]);
        }
    }

    //getter
    public Book[] getAvailableBooks() {
        return availableBooks.clone();
    }
}
