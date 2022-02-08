import java.util.HashMap;
import java.util.Optional;
import java.util.stream.Stream;

public class Happy {
    public static void main(String[] args) {
        Optional<Object> optional = Optional.ofNullable(null);
//        Object o = optional.get();
        /**
         *  get(): 如果Optional有值则返回，否则抛出NoSuchElementException异常
         * * get()通常和isPresent方法一块使用
         * * isPresent():判断是否包含值，包含值返回true，不包含值返回false
         * * orElse(T t):如果调用对象包含值，就返回该值，否则返回t
         * * orElseGet(Supplier s):如果调用对象包含值，就返回该值，否则返回 Lambda表达式的
         */
        boolean present = optional.isPresent();
        System.out.println("present = " + present);
        Object o = optional.orElse("出现异常了");
        HashMap<String, Object> pool = new HashMap<>();
        Stream<HashMap<String, Object>> parallel = Stream.of(pool).parallel();

        pool.keySet().parallelStream();
        System.out.println(pool.keySet().stream().count());
        System.out.println(   pool.values().stream().count());
        System.out.println(pool.entrySet().stream().count());
    }
}
