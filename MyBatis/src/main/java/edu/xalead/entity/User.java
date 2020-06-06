package edu.xalead.entity;

import lombok.Data;

import java.util.List;

@Data
public class User {
    private int id;
    private String username;
    private String password;
    private IDCard idCard;
    private List<Goods> goods;
}
