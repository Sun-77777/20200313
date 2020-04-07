package com.bit.operation;

import com.bit.book.BookList;

import java.util.Scanner;

public class FindOperation implements IOperation {
    @Override
    public void work(BookList bookList) {
        System.out.println("查找图书");
        System.out.println("请输入要查图书的名称：");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        for (int i = 0; i < bookList.getUsedSize(); i++) {
            if(bookList.getBooks(i).getName().equals(name)) {
                System.out.println("图书找到了!");
                System.out.println(bookList.getBooks(i));
                return;
            }
        }
        System.out.println("没有找到图书!");
    }
}
