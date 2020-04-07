package com.bit.book;

public class BookList {
    private Book[] books;
    private int usedSize;

    public BookList() {
        this.books = new Book[10];
        books[0] = new Book("java","aaa",13,"小说");
        books[1] = new Book("c","bbb",22,"小说");
        books[2] = new Book("c++","ccc",21,"小说");
        this.usedSize = 3;
    }

    public Book getBooks(int pos) {
        return books[pos];
    }

    public void setBooks(int pos,Book book) {

        books[pos] = book;
    }

    public int getUsedSize() {
        return usedSize;
    }

    public void setUsedSize(int usedSize) {
        this.usedSize = usedSize;
    }
}
