import java.util.Iterator;

public class ComputerCollage implements Collage {

    Department[] departments;
    int index;

    public ComputerCollage() {
        departments=new Department[5];
        addDepartment("java","java专业");
        addDepartment("php","php专业");
        addDepartment("大数据","大数据");
    }

    @Override
    public String getName() {
        return "计算机学院";
    }

    @Override
    public void addDepartment(String name, String desc) {
        Department department = new Department(name, desc);
        departments[index]=department;
        index+=1;
    }

    @Override
    public Iterator createIterator() {
        return new ComputerCollegeIteratir(departments);
    }
}
