package com.company.model;

import com.company.model.entity.Event;

import java.util.Comparator;

public class ComparatorPriority implements Comparator<Event> {
    @Override
    public int compare(Event event1, Event event2){
        return (int)(event1.getPriority() - event2.getPriority());
    }
}
