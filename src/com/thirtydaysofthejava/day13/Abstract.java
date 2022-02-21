package com.thirtydaysofthejava.day13;

public class Abstract {
    public static void main(String[] args) {
        Book book = new MyBook("S5Gvp", "CRcz", 413);
        book.display();
    }
}

abstract class Book {
    protected String title;
    protected String author;

    protected Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    abstract void display();
}

class MyBook  extends Book {
    private final int price;

    public MyBook(String title, String author, int price) {
        super(title, author);
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    @Override
    void display() {
        System.out.printf("Title: %s %nAuthor: %s %nPrice: %d",
                title, author, this.getPrice());
    }
}
