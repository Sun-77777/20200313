package com.bit.operation;

import com.bit.book.BookList;

import java.util.Scanner;

public class ReturnOperation implements IOperation {
    @Override
    public void work(BookList bookList) {
        System.out.println("归还图书");
        System.out.println("请输入你要归还图书的名称：");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        for (int i = 0; i < bookList.getUsedSize(); i++) {
            if (bookList.getBooks(i).getName().equals(name)) {
                bookList.getBooks(i).setBorrowed(false);
                System.out.println("归还成功！");
                System.out.println(bookList.getBooks(i));
            }
        }
    }
}
