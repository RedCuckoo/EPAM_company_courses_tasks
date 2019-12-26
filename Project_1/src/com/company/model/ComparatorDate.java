package com.company.model;

import com.company.model.entity.Event;

import java.util.Comparator;

public class ComparatorDate implements Comparator<Event> {
    @Override
    public int compare(Event event1, Event event2){
        return (event1.getTime().compareTo(event2.getTime()));
    }
}
