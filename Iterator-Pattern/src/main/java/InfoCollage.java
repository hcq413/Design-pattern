import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class InfoCollage implements Collage {

    List<Department> departments;


    public InfoCollage() {
        departments = new LinkedList<Department>();
        addDepartment("信息安全","信息安全专业");
        addDepartment("网络安全","网络安全专业");
        addDepartment("服务器安全","服务器安全专业");
    }

    @Override
    public String getName() {
        return "计算机学院";
    }

    @Override
    public void addDepartment(String name, String desc) {
        Department department = new Department(name, desc);
        departments.add(department);
    }

    @Override
    public Iterator createIterator() {
        return new InfoCollegelteratir(departments);
    }
}
