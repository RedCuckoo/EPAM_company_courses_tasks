package com.company.model;

import com.company.model.entity.Book;

import java.util.Comparator;

public class ComparatorTypography implements Comparator<Book> {
    @Override
    public int compare(Book a, Book b){
        String s1 = a.getTypography();
        String s2 = b.getTypography();
        return s1.compareTo(s2);
    }
}
