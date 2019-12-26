package com.company.model.entity;

import javafx.scene.transform.Scale;

import java.util.Calendar;
import java.util.Date;

public class Event {
    private String name;
    private Date time;
    private boolean passed;
    private int repeatMode;
    private int priority;

    public Event(String name, Date time){
        this.name = name;
        this.time = time;
        passed = (new Date().compareTo(time) > 0);
        priority = 0;
        repeatMode = 0;
    }

    public void setRepeatMode(int mode){
        this.repeatMode = mode;
    }

    public void setPriority(int priority){
        this.priority = priority;
    }

    public Date getTime(){
        return time;
    }

    public int getPriority(){
        return priority;
    }

    public boolean isPassed(){
        return passed;
    }

    //return true if it is the date
    public boolean update(){
        Calendar now = Calendar.getInstance();
        Calendar time = Calendar.getInstance();
        time.setTime(this.time);
        if(passed){
            return false;
        }

        if(now.compareTo(time) > 0){
            passed = false;
        }
        else if(passed){
            switch(repeatMode){
                default:
                    passed = false;
                    break;
                case 1:
                    //every 30 minutes
                    time.add(Calendar.MINUTE, 30);
                    this.time = time.getTime();
                    break;
                case 2:
                    //every hour
                    time.add(Calendar.HOUR_OF_DAY, 1);
                    this.time = time.getTime();
                    break;
                case 3:
                    //every two hours
                    time.add(Calendar.HOUR_OF_DAY, 2);
                    this.time = time.getTime();
                    break;
                case 4:
                    //every 4 hours
                    time.add(Calendar.HOUR_OF_DAY, 4);
                    this.time = time.getTime();
                    break;
                case 5:
                    //everyday
                    time.add(Calendar.DAY_OF_MONTH, 1);
                    this.time = time.getTime();
                    break;
                case 6:
                    //everyweek
                    time.add(Calendar.DAY_OF_MONTH, 7);
                    this.time = time.getTime();
                    break;
            }
            return true;
        }
        return false;
    }

    @Override
    public String toString(){
        return ("\"" + name  + "\", at " + time);
    }
}
