/*  Created by IntelliJ IDEA.
 *  User: Divyansh Bhardwaj (dbc2201)
 *  Date: 21/08/20
 *  Time: 3:50 PM
 *  File Name : FrontDesk.java
 * */
package execution;

import definitions.Library;
import definitions.Student;

import java.util.Scanner;

public class FrontDesk {
    private static final int NEW_BOOK = 1;
    private static final int PREVIOUS_BOOK_RETURN = 2;
    private static final int ALL_BOOKS_LIST = 3;
    private static final int EXIT = 4;

    public static void main(String[] args) {
        Student student = new Student();
        Library library = new Library();
        Scanner scanner = new Scanner(System.in);
        int choiceNumber;
        System.out.println("-=-=--=-=-\"Welcome To The Front Desk\"-=-=--=-=-");
        do {
            System.out.println("1.Issue a new book for me.");
            System.out.println("2.Return a previously issues book for me.");
            System.out.println("3.Show me all my issues books.");
            System.out.println("4.Exit");
            System.out.println("Enter your choice 1..4");
            choiceNumber = scanner.nextInt();
            switch (choiceNumber) {
                case NEW_BOOK:
                    System.out.println("List Of available Books:-");
                    library.displayListOfAvailableBooks();
                    System.out.println("Enter book name you want to issue.");
                    scanner.nextLine();
                    String book = scanner.nextLine();
                    student.doIssueABook(book);
                    break;
            }
        } while (choiceNumber != EXIT);

    }
}
