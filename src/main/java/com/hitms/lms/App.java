package com.hitms.lms;

import com.hitms.lms.model.Book;
import com.hitms.lms.model.Member;
import com.hitms.lms.service.LibraryService;

/** Small runnable demonstration of the library service. */
public class App {
    public static void main(String[] args) {
        LibraryService library = new LibraryService();
        library.addBook(new Book("B101", "Java Fundamentals"));
        library.addMember(new Member("M101", "Ali"));

        System.out.println("Book found: " + library.findBook("B101").getTitle());
        System.out.println("Member found: " + library.findMemberById("M101").getName());

        library.issueBook("B101");
        System.out.println("Book issued: " + library.findBook("B101").isIssued());
        library.returnBook("B101");
        System.out.println("Book returned successfully.");
    }
}
