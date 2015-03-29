package com.kite.joco.entites;

import com.orm.SugarRecord;

import java.util.Date;

/**
 * Created by Joco on 2015.03.22..
 */
public class Todo extends SugarRecord<Todo> {

    String title;
    String desc;
    Date dueDate;

    public Todo() {
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;

    }

    public Date getDueDate() {
        return dueDate;
    }

    public void setDueDate(Date dueDate) {
        this.dueDate = dueDate;
    }
}
