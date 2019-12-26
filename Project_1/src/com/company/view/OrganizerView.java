package com.company.view;

import com.company.model.entity.Event;

import java.util.ArrayList;

public class OrganizerView {
    public void printAllCommands(){
        System.out.println("Choose one of the following:" +
                "\n1. Add event/reminder\n" +
                "2. Get events/reminders by date\n" +
                "3. Get events/reminders by the range of dates\n" +
                "4. Check the schedule\n" +
                "5. Exit\n");
    }

    public void printRepeatOptions(){
        System.out.println(
                "1. Every 30 minutes\n" +
                "2. Every 1 hour\n" +
                "3. Every 2 hours\n" +
                "4. Every 4 hours\n" +
                "5. Everyday\n" +
                "6. Every week\n");
    }

    public void printSortOptions(){
        System.out.println("How would you like to sort the list?\n" +
                "1. By date\n" +
                "2. By priority\n");
    }

    public void printNotFound(){
        System.out.println("Not found");
    }

    public void printNoUpcoming(){
        System.out.println("No upcoming events in the next 24 hours");
    }

    public void printList(ArrayList<Event> to_print){
        for(Event i : to_print){
            System.out.printf(i.toString());
        }
    }

    public void print(String to_print){
        System.out.println(to_print);
    }
}
