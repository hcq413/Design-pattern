public class Popcorn {
    private static final Popcorn popcorn = new Popcorn();

    /**
     * 获取实例
     *
     * @return {@link Popcorn}
     */
    public static Popcorn getInstance() {
        return popcorn;
    }

    /**
     * 在……上面
     */
    public void on() {
        System.out.println("Popcorn.on");
    }

    /**
     * 关闭
     */
    public void off() {
        System.out.println("Popcorn.off");
    }

    /**
     * 玩
     */
    public  void  play() {
        System.out.println("Popcorn.play");
    }
}
