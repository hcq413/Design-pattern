import java.util.Iterator;
import java.util.List;

public class OutPutimpl {

    List<Collage> collages;

    public OutPutimpl(List<Collage> collages) {
        this.collages = collages;
    }

    public  void  pirntpollage(){
        Iterator<Collage> iterator = collages.iterator();
        while (iterator.hasNext()) {
            Collage next =  iterator.next();
            System.out.println("================"+next.getName()+"====================");
            printlnDepartment(next.createIterator());
        }
    }


    //输出学校输出系
    public void printlnDepartment(Iterator iterator) {
        while (iterator.hasNext()){
            Department department= (Department) iterator.next();
            System.out.println(department.getName());
        }
    }
}
