package com.hitms.lms.service;

import com.hitms.lms.model.Book;
import com.hitms.lms.model.Member;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

/** Handles catalogue and member operations. */
public class LibraryService {
    private final Map<String, Book> catalogue = new LinkedHashMap<>();
    private final Map<String, Member> members = new LinkedHashMap<>();

    /** Adds a book to the catalogue. */
    public void addBook(Book book) {
        if (book == null) {
            throw new IllegalArgumentException("Book must not be null.");
        }
        if (catalogue.containsKey(book.getId())) {
            throw new IllegalArgumentException("Duplicate book ID: " + book.getId());
        }
        catalogue.put(book.getId(), book);
    }

    /** Issues a book identified by its ID. */
    public void issueBook(String bookId) {
        findBook(bookId).issue();
    }

    /** Returns a previously issued book identified by its ID. */
    public void returnBook(String bookId) {
        findBook(bookId).returnBook();
    }

    /** Finds a book by ID or reports that it is missing. */
    public Book findBook(String bookId) {
        Book book = catalogue.get(bookId);
        if (book == null) {
            throw new IllegalArgumentException("Book not found: " + bookId);
        }
        return book;
    }

    /** Returns a read-only view of the current catalogue values. */
    public Collection<Book> getAllBooks() {
        return Collections.unmodifiableCollection(catalogue.values());
    }

    /** Adds a member to the library. */
    public void addMember(Member member) {
        if (member == null) {
            throw new IllegalArgumentException("Member must not be null.");
        }
        if (members.containsKey(member.getId())) {
            throw new IllegalArgumentException("Duplicate member ID: " + member.getId());
        }
        members.put(member.getId(), member);
    }

    /** Finds a member by ID or reports that the member is missing. */
    public Member findMemberById(String memberId) {
        Member member = members.get(memberId);
        if (member == null) {
            throw new IllegalArgumentException("Member not found: " + memberId);
        }
        return member;
    }
}
// Member lookup will be added here