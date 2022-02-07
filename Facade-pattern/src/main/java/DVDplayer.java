/**
 * DVD播放器
 *
 * @author 黄昌其
 * @date 2022/02/07
 */
@SuppressWarnings("all")
public class DVDplayer {
    private static final DVDplayer dvd = new DVDplayer();

    /**
     * 获取实例
     *
     * @return {@link DVDplayer}
     */// todo 返回dvd对象实例
    public static DVDplayer getInstance() {
        return dvd;
    }

    /**
     * 在……上面
     */
    public void on() {
        System.out.println("DVDplayer.on");
    }

    /**
     * 关闭
     */
    public void off() {
        System.out.println("DVDplayer.off");
    }

    /**
     * 玩
     */
    public  void  play() {
        System.out.println("DVDplayer.play");
    }
}
