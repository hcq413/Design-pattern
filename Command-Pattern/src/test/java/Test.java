
import java.time.LocalDateTime;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class Test {
    public static void println(Supplier<?>... suppliers) {
        for (Supplier<?> supplier : suppliers) {
            System.out.println((supplier.get()));
        }
    }
    public void print(Consumer<Test> consumer){
        consumer.accept(this);
    }

    public static void main(String[] args) {
        println(LocalDateTime::now);
    }
}
