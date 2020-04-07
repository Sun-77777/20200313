package com.bit.operation;

import com.bit.book.BookList;

import java.util.Arrays;

public class DisplayOperation implements IOperation{
    @Override
    public void work(BookList bookList) {
        System.out.println("显示图书列表");
        for (int i = 0; i < bookList.getUsedSize(); i++) {
            System.out.println(bookList.getBooks(i));
        }
    }
}
