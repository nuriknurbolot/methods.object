package com.company;

import java.util.Objects;

public class Author {
    private final String authorName;
    private final String authorSurname;
    String Author;
    public Author(String authorName, String authorSurname) {
        this.authorName = authorName;
        this.authorSurname = authorSurname;
    }
    public String getAuthorName() {
        return this.authorName;
    }
    public String getAuthorSurname() {
        return this.authorSurname;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Author author = (Author) o;
        return Objects.equals(authorName, author.authorName) && Objects.equals(authorSurname, author.authorSurname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(authorName, authorSurname);
    }

    @Override
    public String toString() {
        return authorSurname + " " + authorName;
    }
}
