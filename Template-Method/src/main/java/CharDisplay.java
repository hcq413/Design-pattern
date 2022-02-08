public class CharDisplay extends AbstractDisplay {
    private char ch;

    public CharDisplay(char ch) {
        this.ch = ch;
    }

    /**
     * 打开
     */
    @Override
    public void open() {
        System.out.println("<<");
    }

    /**
     * 打印
     */
    @Override
    public void print() {
        System.out.println(ch);
    }

    /**
     * 关
     */
    @Override
    public void close() {
        System.out.println(">>");
    }
    /**
     * 钩子方法，声明并实现（空实现或者定义相关内容皆可），继承此抽象类的子类可扩展实现或者不实现
     */
}
