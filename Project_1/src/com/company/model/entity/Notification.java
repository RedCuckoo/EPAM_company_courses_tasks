package com.company.model.entity;

import java.util.Date;

public class Notification {
    private Date time;

    public Notification(Date time){
        this.time = time;
    }

    public Date getTime() {
        return time;
    }
}
