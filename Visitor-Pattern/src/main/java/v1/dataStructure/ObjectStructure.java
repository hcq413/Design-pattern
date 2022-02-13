package v1.dataStructure;

import v1.Action.Action;
import v1.Person.Person;

import java.util.LinkedList;
import java.util.List;

/**
 * 数据结构
 *
 * @author 黄昌其
 * @date 2022/02/13
 */
public class ObjectStructure {
    private List<Person> list = new LinkedList<>();

    public void add(Person action) {
        list.add(action);
    }

    public void delete(Person action) {
        list.remove(action);
    }

    public void display(Action action) {
        for (Person person : list) {
            person.accept(action);
        }
    }
}
