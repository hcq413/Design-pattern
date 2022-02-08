import java.util.HashMap;
import java.util.stream.Stream;

public class Map {
    public static void main(String[] args) {
        HashMap<String, Object> map = new HashMap<>();
        Stream<String> stream = map.keySet().stream();
        Stream<Object> stream2 = map.values().stream();
        Stream<java.util.Map.Entry<String, Object>> stream1 = map.entrySet().stream();

    }
}
