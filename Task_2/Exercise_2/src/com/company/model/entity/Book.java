package com.company.model.entity;

public class Book {
    private String name;
    private String author;
    private String typography;
    private int year;
    private int pages_amount;
    private double price;

    public Book(String name, String author, String typography, int year, int pages_amount, double price){
        this.name = name;
        this.author = author;
        this.typography = typography;
        this.year = year;
        this.pages_amount = pages_amount;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getTypography() {
        return typography;
    }

    public void setTypography(String typography) {
        this.typography = typography;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getPages_amount() {
        return pages_amount;
    }

    public void setPages_amount(int pages_amount) {
        this.pages_amount = pages_amount;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString(){
        return ("\"" + name + "\" by " + author + ", " + typography + ", " + year + ", " + pages_amount + " pages, " + price + "$");
    }
}
