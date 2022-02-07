/**
 * 投影仪
 *
 * @author 黄昌其
 * @date 2022/02/07
 */
public class Screen {
    private static final Screen projecror = new Screen();

    /**
     * 获取实例
     *
     * @return {@link Screen}
     */
    public static Screen getInstance() {
        return projecror;
    }


    /**
     * 打开
     */
    public void up() {
        System.out.println("Projector.up");
    }


    /**
     * 向下
     */
    public void down() {
        System.out.println("Projector.down");
    }


}