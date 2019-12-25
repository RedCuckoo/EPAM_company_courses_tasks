package com.company.controller;

import com.company.model.BookModel;
import com.company.view.BookView;

import java.util.Scanner;

public class BookController {
    private BookModel model;
    private BookView view;

    public BookController(){
        model = new BookModel();
        view = new BookView();
    }

    public void run(){
        view.printContainer(model.getContainer());
        Scanner input = new Scanner(System.in);
        int command;
        while (true){
            view.printCommands();
            command = input.nextInt();
            if(command == 5) {
                return;
            }
            else if (command == 4){
                view.printContainer(model.sortByTypography());
            }
            else {
                doCommand(command);
            }
        }
    }

    public void doCommand(int command){
        Scanner input = new Scanner(System.in);
        view.askForValue();
        String info = input.nextLine();
        switch (command){
            case 1:
                view.printContainer(model.getByAuthor(info));
                break;
            case 2:
                view.printContainer(model.getByTypography(info));
                break;
            case 3:
                view.printContainer(model.getPublishedAfter(Integer.parseInt(info)));
                break;
        }
    }
}
