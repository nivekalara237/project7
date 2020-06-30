package com.oc.clientUI.beans;

public class Search {
    private String name;

    public Search() {
        init();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void init() {
        this.name = "";
    }
}
