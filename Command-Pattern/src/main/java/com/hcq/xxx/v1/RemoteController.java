package com.hcq.xxx.v1;

/**
 * 遥控器
 *
 * @author 黄昌其
 * @date 2022/02/11
 */
public class RemoteController {

    //开 按钮的命令数组
    Command[] onCommand;
    Command[] offCommand;

    //执行撤销的命令
    Command undoCommand;

    //构造器初始化
    public RemoteController() {
        onCommand=new Command[5];
        offCommand=new Command[5];
        for (int i = 0; i <5 ; i++) {
            onCommand[i]=new NoCommand();
            offCommand[i]=new NoCommand();
        }
    }

    //选择你要执行的家具
    public  void  setCommand(int no,Command onCommands,Command offCommands) {
      onCommand[no]=onCommands;
      offCommand[no]=offCommands;
    }

    public  void onButtonWasPushed(int no){
        onCommand[no].execute();
        undoCommand=onCommand[no];
    }
    public  void offButtonWasPushed(int no){
        offCommand[no].execute();
        undoCommand=offCommand[no];
    }
    public  void  undoButtonWasPushed(){
        undoCommand.undo();
    }
}
