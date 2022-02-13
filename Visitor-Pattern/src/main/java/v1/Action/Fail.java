package v1.Action;

import v1.Person.Children;
import v1.Person.Man;
import v1.Person.Woman;

public class Fail extends Action {
    /**
     * 获取MAN结果
     *
     * @param man 男人
     */
    @Override
    public void getManResult(Man man) {
        System.out.println("男人给的评价该歌手失败");
    }

    /**
     * 获得女性结果
     *
     * @param woman 女人
     */
    @Override
    public void getWomanResult(Woman woman) {
        System.out.println("女人给的评价该歌手失败");
    }

    /**
     * 获取孩子结果
     *
     * @param children 儿童
     */
    @Override
    public void getChildrenResult(Children children) {
        System.out.println("孩子给的评价该歌手失败");
    }
}
