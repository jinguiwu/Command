package com.jinguwu.designpattern.command;

/**
 * Created by jinguwu on 2015/1/17.
 */
public class NoCommand implements Command {
    @Override
    public void execute() {
        System.out.println("do nothing...");
    }

    @Override
    public void undo() {

        System.out.println("nothing to undo...");
    }
}
