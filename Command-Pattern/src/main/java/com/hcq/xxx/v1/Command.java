package com.hcq.xxx.v1;

/**
 * 命令
 *
 * @author 黄昌其
 * @date 2022/02/11
 */
public interface Command {

    /**
     * 执行
     */
    void  execute();

    /**
     * 撤消
     */
    void  undo();
}
