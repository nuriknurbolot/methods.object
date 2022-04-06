package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Author georgeMartin = new Author("Джордж", "Мартин");
        Book iceAndFire = new Book("Песнь льда и пламени", 1996, georgeMartin);

        Author zamyatin = new Author("Евгений", "Замятин");
        Book we = new Book("Мы", 1924, zamyatin);
        System.out.println("iceAndFire = "+ iceAndFire.getNameBook()+" "+ iceAndFire.getPublicationYear()+" "+ georgeMartin.getAuthorName()+" "+georgeMartin.getAuthorSurname());
        we.setPublicationYear(2022);
        System.out.println("we = " + we.getPublicationYear());
        System.out.println(we);
    }
}
