package v1.Person;

import v1.Action.Action;

public class Children  extends Person {
    @Override
    public void accept(Action action) {
        action.getChildrenResult(this);
    }
}
