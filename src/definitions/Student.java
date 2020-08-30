/*  Created by IntelliJ IDEA.
 *  User: Divyansh Bhardwaj (dbc2201)
 *  Date: 21/08/20
 *  Time: 3:49 PM
 *  File Name : Student.java
 * */
package definitions;

import java.util.Objects;

public class Student {
    private String nameOfStudent;
    private long universityRollNumber;
    private int numberOfBooksIssued;
    private Book[] issuedBooks;
    private String returnedBook;

    //constructor
    public Student() {
        nameOfStudent = "Neeraj Kumar Verma";
        universityRollNumber = 191600489L;
        numberOfBooksIssued = 4;
        this.issuedBooks = new Book[numberOfBooksIssued];
        issuedBooks[0] = new Book();
        issuedBooks[1] = new Book("9897569453201");
        issuedBooks[2] = new Book("Software Engineering", "K.K.Agarwal");
        issuedBooks[3] = new Book("Computer Science with Java", "Sumita Arora", "9695949392996");
    }

    //getter methods
    public String getNameOfStudent() {
        return nameOfStudent;
    }

    public long getUniversityRollNumber() {
        return universityRollNumber;
    }

    public int getNumberOfBooksIssued() {
        return numberOfBooksIssued;
    }

    public Book[] getIssuedBooks() {
        return issuedBooks.clone();
    }

    //setter methods
    public void setNameOfStudent(String nameOfStudent) {
        this.nameOfStudent = nameOfStudent;
    }

    public void setUniversityRollNumber(long universityRollNumber) {
        this.universityRollNumber = universityRollNumber;
    }

    public void setNumberOfBooksIssued(int numberOfBooksIssued) {
        this.numberOfBooksIssued = numberOfBooksIssued;
    }

    public void setIssuedBooks(Book[] issuedBooks) {
        this.issuedBooks = issuedBooks;
    }

    @Override
    public String toString() {
        return ("Name of the Student is \"" + getNameOfStudent() + "\" whose university rollnumber is \"" + getUniversityRollNumber() + "\".Number of books issued by student is \"" + getNumberOfBooksIssued() + "\".");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Student student = (Student) o;
        return Objects.equals(getNameOfStudent(), student.getNameOfStudent()) && getUniversityRollNumber() == student.getUniversityRollNumber() && getNumberOfBooksIssued() == student.getNumberOfBooksIssued();
    }

    //@Override
    public int hashcode() {
        return Objects.hash(getNameOfStudent(), getUniversityRollNumber(), getNumberOfBooksIssued());
    }

    /**
     * this method is used to display all issued books.
     */
    public void showAllIssuesBooks() {
        System.out.println("List of issued books:--");
        for (Book books : this.issuedBooks) {
            if (((books.getNameOfTheBook()).equalsIgnoreCase(returnedBook)) == false) {
                System.out.println(books);
            }
        }
    }

    /**
     * this method is used to issue a book.
     *
     * @param issueBook hold the issued book.
     */
    public void doIssueABook(String issueBook) {
        System.out.println("Thanks for issuing \"" + issueBook + "\" book!!");
    }

    /**
     * this method is used to return a book.
     *
     * @param returnedBook hold the returned book.
     */
    public void doReturnIssuedBook(String returnedBook) {
        this.returnedBook = returnedBook;
        System.out.println("Thanks for returning \"" + returnedBook + "\" book");
    }
}
