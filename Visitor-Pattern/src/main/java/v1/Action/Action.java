package v1.Action;

import v1.Person.Children;
import v1.Person.Man;
import v1.Person.Woman;

/**
 * 动作
 *
 * @author 黄昌其
 * @date 2022/02/13
 */
public abstract class Action {

    /**
     * 获取MAN结果
     *
     * @param man 男人
     */
    public abstract void getManResult(Man man);

    /**
     * 获得女性结果
     *
     * @param woman 女人
     */
    public abstract void getWomanResult(Woman woman);


    /**
     * 获取孩子结果
     *
     * @param children 儿童
     */
    public abstract void getChildrenResult(Children children);
}
