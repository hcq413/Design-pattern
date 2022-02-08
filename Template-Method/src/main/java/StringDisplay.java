/**
 * 字符串显示
 *
 * @author 黄昌其
 * @date 2022/02/08
 */
public class StringDisplay extends AbstractDisplay {
    /**
     * 字符串
     */
    private String string;
    /**
     * 宽度
     */
    private int width;

    /**
     * 字符串显示
     *
     * @param string 字符串
     */
    public StringDisplay(String string) {
        this.string = string;
        this.width = string.getBytes().length;
    }

    /**
     * 打印行
     */
    private void printLine() {
        System.out.print("+");
        for (int i = 0; i < width; i++) {
            System.out.print("-");
        }
        System.out.println("+");
    }

    /**
     * 打开
     */
    @Override
    public void open() {
        printLine();
    }

    /**
     * 打印
     */
    @Override
    public void print() {
        System.out.println("|" + string + "|");
    }

    /**
     * 关
     */
    @Override
    public void close() {
        printLine();
    }
}
