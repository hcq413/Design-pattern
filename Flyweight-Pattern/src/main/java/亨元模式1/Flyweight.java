package 亨元模式1;

public abstract class Flyweight {
    //内部状态
    /**
     * 指对象共享出来的信息，存储在享元对象内部并且不会随环境的改变而改变；
     */
    public String intrinsic;
    /**
     * 指对象得以依赖的一个标记，是随环境改变而改变的、不可共享的状态。
     */
    //外部状态
    protected final String extrinsic;

    //要求享元角色必须接受外部状态
    public Flyweight(String extrinsic) {
        this.extrinsic = extrinsic;
    }

    /**
     * 操作
     * 定义操作
     * @param extrinsic 非本征
     */
    public abstract void operate(int extrinsic);
}
