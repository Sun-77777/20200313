package com.bit.operation;

import com.bit.book.BookList;

import java.util.Scanner;

public class BorrowOperation implements IOperation {
    @Override
    public void work(BookList bookList) {
        System.out.println("借阅图书");
        System.out.println("请输入你要借的图书的名称：");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        for (int i = 0; i < bookList.getUsedSize(); i++) {
            if (bookList.getBooks(i).getName().equals(name)) {
                if (!bookList.getBooks(i).getIsBorrowed()) {
                    bookList.getBooks(i).setBorrowed(true);
                    System.out.println("借阅成功！");
                    System.out.println(bookList.getBooks(i));
                    return;
                }
                System.out.println("已被借出！");
                return;
            }
        }
        System.out.println("未找到你要借的图书！");
    }
}
