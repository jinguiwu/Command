package com.jinguwu.designpattern.command;

/**
 * Created by jinguwu on 2015/1/17.
 */
public class RemoteController {
    private Command[] onCommands;
    private Command[] offCommands;

    private Command currentCmd;

    public RemoteController(Command[] onCommands, Command[] offCommands) {
        this.onCommands = onCommands;
        this.offCommands = offCommands;
        currentCmd = new NoCommand();
    }

    public void onButtonClicked(int position){
        onCommands[position].execute();
        currentCmd = onCommands[position];
    }

    public void offButtonClicked(int position){
        offCommands[position].execute();
        currentCmd = offCommands[position];
    }

    public void undo(){
        currentCmd.undo();
    }
}
