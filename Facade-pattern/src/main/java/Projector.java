/**
 * 投影仪
 *
 * @author 黄昌其
 * @date 2022/02/07
 */
public class Projector {
    private static final Projector projecror = new Projector();

    /**
     * 获取实例
     *
     * @return {@link Projector}
     */
    public static Projector getInstance() {
        return projecror;
    }


    /**
     * 在……上面
     */
    public void on() {
        System.out.println("Projector.on");
    }

    /**
     * 关闭
     */
    public void off() {
        System.out.println("Projector.off");
    }

    /**
     * 焦点
     */
    public  void  focus(){
        System.out.println("Projector is Projector");
    }
}