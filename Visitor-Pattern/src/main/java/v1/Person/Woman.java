package v1.Person;

import v1.Action.Action;
import v1.Person.Person;

public class Woman extends Person {
    @Override
    public void accept(Action action) {
        action.getWomanResult(this);
    }
}
