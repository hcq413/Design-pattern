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
}
