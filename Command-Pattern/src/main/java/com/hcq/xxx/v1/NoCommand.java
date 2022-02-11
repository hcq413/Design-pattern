package com.hcq.xxx.v1;


import lombok.AllArgsConstructor;

@AllArgsConstructor
public class NoCommand  implements Command{
    /**
     * 执行
     */
    @Override
    public void execute() {

    }

    /**
     * 撤消
     */
    @Override
    public void undo() {

    }
}
