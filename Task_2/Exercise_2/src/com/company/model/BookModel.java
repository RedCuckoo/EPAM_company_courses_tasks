package com.company.model;

import com.company.model.entity.Book;

import java.util.ArrayList;
import java.util.Collections;

public class BookModel {
    private ArrayList<Book> container = new ArrayList<Book>();

    public BookModel(){
        container.add(new Book("Harry Potter and the Philosopher's Stone", "J. K. Rowling",
                "Ababagalamaga",1997, 230, 10.67));
        container.add(new Book("Harry Potter and the Prisoner of Azkaban", "J. K. Rowling",
                "Ababagalamaga", 1999, 316, 10.99));
        container.add(new Book("Harry Potter and the Chamber of Secrets", "J. K. Rowling",
                "Ababagalamaga", 1998, 350, 7.99));
        container.add(new Book("Harry Potter and the Goblet of Fire", "J. K. Rowling",
                "Ababagalamaga", 2000, 630, 13.99));
        container.add(new Book("Harry Potter and the Order of the Phoenix", "J. K. Rowling",
                "Ababagalamaga",2003, 729, 8.99));
        container.add(new Book("Harry Potter and the Half-Blood Prince", "J. K. Rowling",
                "Crown Publishing Group",2005, 448, 11.89));
        container.add(new Book("Harry Potter and the Deathly Hollows", "J. K. Rowling",
                "Random House",2007, 352, 13.99));
        container.add(new Book("Binging with Babish: 100 Recipes", "Andrew Rea",
                "Houghton Mifflin Harcourt", 2019, 336, 17.99));
        container.add(new Book("Nothing Fancy: Unfussy Food for Having People Over", "Alison Roman",
                "Clarkson Potter", 2019, 320, 29.25));
        container.add(new Book("The Body: A Guide for Occupants", "Bill Bryson", "Doubleday",
                2019, 464, 13.39));
        container.add(new Book("How To: Absurd Scientific Advice for Common Real-World Problems", "Randall Munroe",
                "Riverhead Books",2019, 320, 16.69));
    }

    public ArrayList<Book> getContainer(){
        return container;
    }

    public ArrayList<Book> getByAuthor(String author) {
        ArrayList<Book> ans = new ArrayList<Book>();
        author = author.toLowerCase();
        for (Book i : container){
            if(i.getAuthor().toLowerCase().equals(author)){
                ans.add(i);
            }
        }
        return ans;
    }

    public ArrayList<Book> getByTypography(String typography) {
        ArrayList<Book> ans = new ArrayList<Book>();
        typography = typography.toLowerCase();
        for (Book i : container){
            if(i.getTypography().toLowerCase().equals(typography)){
                ans.add(i);
            }
        }
        return ans;
    }
    public ArrayList<Book> getPublishedAfter(int year) {
        ArrayList<Book> ans = new ArrayList<Book>();
        for (Book i : container){
            if(i.getYear() > year){
                ans.add(i);
            }
        }
        return ans;
    }

    public ArrayList<Book> sortByTypography(){
        ArrayList<Book> newContainer = container;
        Collections.sort(newContainer, new ComparatorTypography());
        return newContainer;
    }
}
