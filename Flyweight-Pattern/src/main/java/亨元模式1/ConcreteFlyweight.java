package 亨元模式1;

/**
 * 混凝土轻量级
 *
 * @author 黄昌其
 * @date 2022/02/08
 */
public class ConcreteFlyweight extends Flyweight {
    public ConcreteFlyweight(String extrinsic) {
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
        System.out.println("具体Flyweight:" + extrinsic);
    }

}
