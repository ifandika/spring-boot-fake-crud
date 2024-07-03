package com.ifandika.data;

import java.util.ArrayList;

public class Response {
    private String message;
    private int code;
    private ArrayList<Person> personArrayList;

    public Response() {
    }

    public Response(String message, int code, ArrayList<Person> personArrayList) {
        this.message = message;
        this.code = code;
        this.personArrayList = personArrayList;
    }

    public String getMessage() {
        return this.message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public int getCode() {
        return this.code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public ArrayList<Person> getPersonArrayList() {
        return this.personArrayList;
    }

    public void setPersonArrayList(ArrayList<Person> personArrayList) {
        this.personArrayList = personArrayList;
    }
}
