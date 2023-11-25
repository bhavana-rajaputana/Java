package com.bhavana;

public class ArrayList {


    private String first;
    private String last;
    private int id;


    public ArrayList(String first, String last, int id) {
        this.first = first;
        this.last = last;
        this.id = id;
    }

    public String getFirst() {
        return first;
    }

    public void setFirst(String first) {
        this.first = first;
    }

    public String getLast() {
        return last;
    }

    public void setLast(String last) {
        this.last = last;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "com.bhavana.selection.ArrayList{" +
                "first='" + first + '\'' +
                ", last='" + last + '\'' +
                ", id=" + id +
                '}';
    }
}

