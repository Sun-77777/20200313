package com.bit;


import com.bit.book.BookList;
import com.bit.user.AdminUser;
import com.bit.user.NormalUser;
import com.bit.user.User;

import java.util.Scanner;

public class Main {

    public static User login() {
        System.out.println("请输入你的姓名：");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.next();
        System.out.println("请输入你的身份：1-》管理员 2-》普通用户");
        int choice  = scanner.nextInt();
        if(choice == 1) {
            return new AdminUser(name);
        }
        return new NormalUser(name);
    }

    public static void main(String[] args) {
        BookList bookList = new BookList();

        //1.登录
        User user = login();
        while(true) {
            int choice = user.menu();
            //根据你的选择 确定调用哪个操作方法
            user.doOperation(choice, bookList);
        }

    }
}

