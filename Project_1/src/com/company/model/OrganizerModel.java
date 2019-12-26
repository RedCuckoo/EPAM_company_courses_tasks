package com.company.model;

import com.company.model.entity.Event;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;

public class OrganizerModel {
    private ArrayList<Event> events = new ArrayList<Event>();

    public void addEvent(Event event){
        events.add(event);
    }

    public ArrayList<Event> getByDate(Date date){
        ArrayList<Event> ans = new ArrayList<Event>();

        for(Event i : events){
            if(i.getTime().equals(date)){
                ans.add(i);
            }
        }

        return ans;
    }

    public ArrayList<Event> getByDateRange(Date fromDate, Date toDate, boolean sortByPriority){
        ArrayList<Event> ans = new ArrayList<Event>();

        for(Event i : events){
            if(i.getTime().compareTo(toDate) <= 0 && i.getTime().compareTo(fromDate) >= 0){
                ans.add(i);
            }
        }

        if(sortByPriority){
            Collections.sort(ans, new ComparatorPriority());
        }
        else{
            Collections.sort(ans, new ComparatorDate());
        }

        return ans;
    }

    public void update() {
        for (Event i : events) {
            i.update();
        }
    }
}
