public class TheatherLight {
    private static final TheatherLight theatherLight = new TheatherLight();

    public static TheatherLight getInstance() {
        return theatherLight;
    }

    public void on() {
        System.out.println("TheatherLight.on");
    }


    public void off() {
        System.out.println("TheatherLight.off");
    }


    public void dim() {
        System.out.println("TheatherLight.dim");
    }

    public void bright() {
        System.out.println("TheatherLight.bright");
    }
}
