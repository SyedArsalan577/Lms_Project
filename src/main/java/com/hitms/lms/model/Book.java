package com.hitms.lms.model;

/** Represents a book in the library catalogue. */
public class Book {
    private final String id;
    private final String title;
    private boolean issued;

    public Book(String id, String title) {
        if (id == null || id.trim().isEmpty()) {
            throw new IllegalArgumentException("Book ID is required.");
        }
        if (title == null || title.trim().isEmpty()) {
            throw new IllegalArgumentException("Book title is required.");
        }
        this.id = id;
        this.title = title;
    }

    public String getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public boolean isIssued() {
        return issued;
    }

    public void issue() {
        if (issued) {
            throw new IllegalStateException("Book is already issued: " + id);
        }
        issued = true;
    }

    public void returnBook() {
        if (!issued) {
            throw new IllegalStateException("Book is not currently issued: " + id);
        }
        issued = false;
    }
}
