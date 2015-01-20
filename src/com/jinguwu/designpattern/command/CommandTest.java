package com.jinguwu.designpattern.command;

/**
 * Created by jinguwu on 2015/1/17.
 */
public class CommandTest {
    public static void main(String[] args){
        Light light = new Light("living room");
        Command onCommand = new LightOnCommand(light);
        Command offCommand = new LightOffCommand(light);


        RemoteController controller = new RemoteController(new Command[]{onCommand}, new Command[]{offCommand});
        controller.undo();
        controller.onButtonClicked(0);
        controller.undo();

        controller.offButtonClicked(0);
        controller.undo();
        controller.undo();
    }
}
