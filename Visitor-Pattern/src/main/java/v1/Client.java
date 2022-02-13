package v1;

import v1.Action.Fail;
import v1.Action.Success;
import v1.Person.Man;
import v1.Person.Woman;
import v1.dataStructure.ObjectStructure;

public class Client {
    public static void main(String[] args) {
        ObjectStructure structure = new ObjectStructure();
        structure.add(new Woman());
        structure.add(new Man());
        structure.add(new Woman());
        structure.add(new Woman());
        structure.display(new Success());
        structure.display(new Fail());
        System.out.println("切换版本1.0");
        System.out.println("切换版本2.0");
    }
}
