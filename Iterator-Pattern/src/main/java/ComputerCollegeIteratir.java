import java.util.Iterator;
import java.util.NoSuchElementException;

public class ComputerCollegeIteratir implements Iterator {

    Department[] departments;
    int index = 0;

    public ComputerCollegeIteratir(Department[] departments) {
        this.departments = departments;
    }

    @Override
    public boolean hasNext() {
        if (index >= departments.length || departments[index] == null) {
            return false;
        }
        return true;
    }

    /**
     * Returns the next element in the iteration.
     *
     * @return the next element in the iteration
     * @throws NoSuchElementException if the iteration has no more elements
     */
    @Override
    public Object next() {
        Department department = departments[index];
        index+=1;
        return department;
    }

    @Override
    public void remove() {

    }
}
