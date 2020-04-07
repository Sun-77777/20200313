package com.bit.user;

import com.bit.book.BookList;
import com.bit.operation.IOperation;

abstract public class User {
    public String name;

    //存放的元素就是实现该接口的类
    public IOperation[] operations;

    public User (String name) {
        this.name = name;
    }

    public abstract int menu();
    public void doOperation(int choice, BookList bookList) {
        operations[choice].work(bookList);
    }


}
