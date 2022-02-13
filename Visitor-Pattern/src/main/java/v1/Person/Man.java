package v1.Person;

import v1.Action.Action;
import v1.Person.Person;

public class Man extends Person {
    @Override
    public void accept(Action action) {
        action.getManResult(this);
    }
}
