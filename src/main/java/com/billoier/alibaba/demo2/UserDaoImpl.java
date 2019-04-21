package com.billoier.alibaba.demo2;

public class UserDaoImpl implements UserDao {
    @Override
    public void findAll() {
        System.out.println("findALl");
    }

    @Override
    public void save() {
        System.out.println("save");
    }

    @Override
    public void edit() {
        System.out.println("edit");
    }
}
