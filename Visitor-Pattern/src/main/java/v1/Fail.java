package v1;

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
}
