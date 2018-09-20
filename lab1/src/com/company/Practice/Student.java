package com.company.Practice;

import java.util.Arrays;

public class Student {
    private String name;
    private int age;
    private Book[] books;

    public Student(String name, int age, Book[] books) {
        this.name = name;
        this.age = age;
        this.books = books;
    }

    public Student(){

    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public Book[] getBooks() {
        return books;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", books=" + Arrays.toString(books) +
                '}';
    }
}
