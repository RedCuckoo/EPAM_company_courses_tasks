package com.company.view;

import com.company.model.entity.Book;

import java.util.ArrayList;

public class BookView {
    public void printContainer(ArrayList<Book> to_print){
        boolean printed = false;
        for(Book i : to_print) {
            printed = true;
            System.out.println(i.toString());
        }
        if(!printed){
            System.out.println("Not found");
        }
        System.out.println("");
    }

    public void printCommands(){
        System.out.println("Choose one of the following:" +
                "\n1. Get books by the author\n" +
                "2. Get books by the typography\n" +
                "3. Get after provided year\n" +
                "4. Sort by the typography\n" +
                "5. Exit\n");
    }

    public void askForValue(){
        System.out.println("Enter relevant criteria");
    }
}
