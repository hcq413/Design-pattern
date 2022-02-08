package 亨元模式1;

import java.util.HashMap;

public class FlyweightFactory {

    //池容器
    private static HashMap<String, Flyweight> pool = new HashMap<>();

    public static Flyweight getflyweight(String extrinsic) {
        Flyweight flyweight = null;
        if (pool.containsKey(extrinsic)) {
            flyweight = pool.get(extrinsic);
            System.out.print("已有 " + extrinsic + " 直接从池中取---->");
        } else {
            flyweight = new ConcreteFlyweight(extrinsic);
            //放入池中
            pool.put(extrinsic, flyweight);
            System.out.print("创建 " + extrinsic + " 并从池中取出---->");
        }
        return  flyweight;
    }

}
