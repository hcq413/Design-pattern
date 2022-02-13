package com.hcq.xxx.v1;

public class Client {
    public static void main(String[] args) {
        LightReceiver receiver = new LightReceiver();
        LightOnCommand onCommand = new LightOnCommand(receiver);
        LightOffCommand offCommand = new LightOffCommand(receiver);

        RemoteController controller = new RemoteController();
        controller.setCommand(0, onCommand, offCommand);
        System.out.println("按下电灯关的按钮");
        controller.onButtonWasPushed(0);
        System.out.println("按下电灯开的按钮");
        controller.offButtonWasPushed(0);
        System.out.println("按下撤销按钮");
        controller.undoButtonWasPushed();

    }
}
