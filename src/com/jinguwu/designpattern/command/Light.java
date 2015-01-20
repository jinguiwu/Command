package com.jinguwu.designpattern.command;

/**
 * Created by jinguwu on 2015/1/17.
 */
public class Light {
    private String name;

    public Light(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void on(){
        System.out.println("turn on the light...");
    }

    public void off(){
        System.out.println("turn off the light...");
    }
}
