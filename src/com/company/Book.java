package com.company;

import java.util.Objects;

public class Book {
    private String nameBook;
    private int publicationYear;
    private Author author;

    public Book(String nameBook, int publicationYear, Author author) {
        this.nameBook = nameBook;
        this.publicationYear = publicationYear;
        this.author = author;    }

    public String getNameBook() {
        return this.nameBook;
    }

    public int getPublicationYear() {
        return this.publicationYear;
    }

    public void setPublicationYear(int publicationYear) {
        this.publicationYear = publicationYear;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return Objects.equals(nameBook, book.nameBook) && Objects.equals(author, book.author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nameBook, author);
    }

    @Override
    public String toString() {
        return "Название книги " + this.nameBook + " год публикации " + this.publicationYear + " автор - " + this.author;
    }
}