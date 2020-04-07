package com.bit.operation;

import com.bit.book.Book;
import com.bit.book.BookList;

import java.util.Scanner;

public class AddOperation implements IOperation{
    @Override
    public void work(BookList bookList) {
        System.out.println("增加图书");
        System.out.println("请输入要增加的图书名称：");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        System.out.println("请输入要增加的图书的作者：");
        String author = scanner.next();
        System.out.println("请输入要增加的图书的价格：");
        int price = scanner.nextInt();
        System.out.println("请输入要增加的图书的类型：");
        String type = scanner.next();
        Book book = new Book(name,author,price,type);
        bookList.setBooks(bookList.getUsedSize(),book);
        bookList.setUsedSize(bookList.getUsedSize()+1);
        System.out.println("添加成功！");
    }
}
