package com.jinguwu.designpattern.command;

/**
 * Created by jinguwu on 2015/1/17.
 */
public class LightOffCommand implements Command {
    private Light light;

    public LightOffCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.off();
    }

    @Override
    public void undo() {
        System.out.println("undo light off..: on now!");

        light.on();
    }
}
