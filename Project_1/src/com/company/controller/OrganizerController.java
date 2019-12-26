package com.company.controller;

import com.company.model.OrganizerModel;
import com.company.model.entity.Event;
import com.company.view.OrganizerView;

import java.lang.reflect.Array;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class OrganizerController {
    OrganizerView view = new OrganizerView();
    OrganizerModel model = new OrganizerModel();
    SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy HH:mm");

    public void run(){
        Scanner input = new Scanner(System.in);
        int command;
        while(true){
            view.printAllCommands();
            command = input.nextInt();
            if(command == 5){
                return;
            }

            try{
                doCommand(command);
            }
            catch(ParseException e){

            }
        }

    }

    private void doCommand(int command) throws ParseException {
        ArrayList<Event> temp;
        Scanner input = new Scanner(System.in);
        switch (command){
            case 1:
                //add event/reminder
                view.print("What is the name of the event/reminder?");
                String name = input.nextLine();
                view.print("Which day and time will it occur?");
                view.print("Please, input information according to the following format:");
                view.print("\"dd-MM-yyyy hh:mm\" - all are numbers");
                Date time = dateFormat.parse(input.nextLine());
                Event event = new Event(name,time);
                view.print("Would you like to repeat this event? (y/n)");
                if(input.nextLine().equals("y")){
                    view.printRepeatOptions();
                    event.setRepeatMode(input.nextInt());
                }
                view.print("Last step, what's the priority? (1 - 10)");
                event.setPriority(input.nextInt());
                model.addEvent(event);
                break;
            case 2:
                //TODO: fix cases and dates to one - Calendar
                //get by date
                view.print("Enter the date");
                temp = model.getByDate(dateFormat.parse(input.nextLine()));
                checkOrPrint(temp);
                break;
            case 3:
                //get by range
                view.print("Enter the first date");
                Date date1 = dateFormat.parse(input.nextLine());
                view.print("Enter the second date");
                Date date2 = dateFormat.parse(input.nextLine());
                view.printSortOptions();
                temp = model.getByDateRange(date1, date2, (input.nextInt() == 2) ? true : false);
                checkOrPrint(temp);
                break;
            case 4:
                //check schedule
                model.update();
                Calendar tomorrow = Calendar.getInstance();
                tomorrow.add(Calendar.DATE, 1);
                temp = model.getByDateRange(Calendar.getInstance().getTime(),tomorrow.getTime(),false);
                if(temp.size() == 0){
                    view.printNoUpcoming();
                }
                else{
                    view.print("Upcoming events are");
                    view.printList(temp);
                }
                break;
        }
    }

    private void checkOrPrint(ArrayList<Event> to_check){
        if(to_check.size() == 0){
            view.printNotFound();
        }
        else{
            view.printList(to_check);
        }
    }
}
