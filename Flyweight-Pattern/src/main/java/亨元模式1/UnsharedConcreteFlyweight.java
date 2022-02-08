package 亨元模式1;

public class UnsharedConcreteFlyweight extends Flyweight{
    public UnsharedConcreteFlyweight(String extrinsic) {
        super(extrinsic);
    }

    /**
     * 操作
     * 定义操作
     *
     * @param extrinsic 非本征
     */
    @Override
    public void operate(int extrinsic) {
        System.out.println("不共享的具体Flyweight:" + extrinsic);
    }
}
