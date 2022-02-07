/**
 * 立体声
 *
 * @author 黄昌其
 * @date 2022/02/07
 */
public class Stereo {
    /**
     * 立体声
     */
    private static final Stereo stereo = new Stereo();

    /**
     * 获取实例
     *
     * @return {@link Stereo}
     */
    public static Stereo getInstance() {
        return stereo;
    }

    /**
     * 在……上面
     */
    public void on() {
        System.out.println("Stereo.on");
    }


    /**
     * 关闭
     */
    public void off() {
        System.out.println("Stereo.off");
    }


    /**
     * 打开
     */
    public void up() {
        System.out.println("Stereo.up");}
}
