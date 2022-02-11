package com.hcq.xxx.v1;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class LightOffCommand implements Command {

    LightReceiver lightReceiver;

    /**
     * 执行
     */
    @Override
    public void execute() {
        lightReceiver.off();
    }

    /**
     * 撤消
     */
    @Override
    public void undo() {
    lightReceiver.on();
    }
}
