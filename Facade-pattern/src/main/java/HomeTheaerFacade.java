/**
 * 家居店面
 *
 * @author 黄昌其
 * @date 2022/02/07
 */
public class HomeTheaerFacade {
    DVDplayer dvDplayer;
    Popcorn popcorn;
    Projector projector;
    Screen screen;
    Stereo stereo;
    TheatherLight theatherLight;

    /**
     * 家居店面
     */
    public HomeTheaerFacade() {
        dvDplayer = DVDplayer.getInstance();
        popcorn = Popcorn.getInstance();
        projector = Projector.getInstance();
        screen = Screen.getInstance();
        stereo = Stereo.getInstance();
        theatherLight = TheatherLight.getInstance();
    }

    public void ready() {
        popcorn.on();
        popcorn.play();
        screen.down();
        projector.on();
        stereo.on();
        dvDplayer.on();
        theatherLight.dim();
    }

    public void play() {
        dvDplayer.play();
    }

    public void pause() {
        dvDplayer.off();
    }

    public void end() {
        popcorn.on();
    }
}
