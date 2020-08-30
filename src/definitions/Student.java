/*  Created by IntelliJ IDEA.
 *  User: Divyansh Bhardwaj (dbc2201)
 *  Date: 21/08/20
 *  Time: 3:49 PM
 *  File Name : Student.java
 * */
package definitions;

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
}
