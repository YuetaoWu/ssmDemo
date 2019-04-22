package com.billoier.alibaba.demo3;

public class User {
    private String name;
    private Integer age;
    private Cat myCat;

    @Override
    public String toString() {
        return "User{" +
            "name='" + name + '\'' +
            ", age=" + age +
            ", myCat=" + myCat +
            '}';
    }

    public void setMyCat(Cat myCat) {
        this.myCat = myCat;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

}

