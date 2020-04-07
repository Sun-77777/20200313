package com.bit.operation;

import com.bit.book.BookList;

import java.util.Scanner;

public class DelOperation implements IOperation {

    @Override
    public void work(BookList bookList) {
        System.out.println("删除图书");
        System.out.println("请输入你要删除图书的名称：");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        for (int i = 0; i < bookList.getUsedSize(); i++) {
            if (bookList.getBooks(i).getName().equals(name)) {
                while(i < bookList.getUsedSize()-1) {
                    bookList.setBooks(i, bookList.getBooks(i+1));
                    i++;
                }
                System.out.println("删除成功！");
                bookList.setUsedSize(bookList.getUsedSize()-1);
                return;
            }
        }
        System.out.println("未找到要删除的图书");
    }
}
