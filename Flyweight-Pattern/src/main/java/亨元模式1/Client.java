package 亨元模式1;

public class Client {
    public static void main(String[] args) {
        int extrinsic = 22;

         Flyweight flyweightX = FlyweightFactory.getflyweight("X");
         flyweightX.operate(++ extrinsic);

         Flyweight flyweightY = FlyweightFactory.getflyweight("Y");
         flyweightY.operate(++ extrinsic);

         Flyweight flyweightZ = FlyweightFactory.getflyweight("Z");
         flyweightZ.operate(++ extrinsic);

         Flyweight flyweightReX = FlyweightFactory.getflyweight("X");
         flyweightReX.operate(++ extrinsic);

         Flyweight unsharedFlyweight = new UnsharedConcreteFlyweight("X");
         unsharedFlyweight.operate(++ extrinsic);
    }
}
