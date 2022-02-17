import java.util.ArrayList;

public class Client {
    public static void main(String[] args) {
        //创建学院
        ArrayList<Collage> list = new ArrayList<>();
        ComputerCollage collage = new ComputerCollage();
        InfoCollage infoCollage = new InfoCollage();
        list.add(collage);
        list.add(infoCollage);

        OutPutimpl outPutimpl = new OutPutimpl(list);
        outPutimpl.pirntpollage();
    }
}
