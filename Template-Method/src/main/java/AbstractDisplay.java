/**
 * 摘要显示
 *
 * @author 黄昌其
 * @date 2022/02/08
 */
public abstract class AbstractDisplay {

    /**
     * 打开
     */
    public abstract void  open();

    /**
     * 打印
     */
    public  abstract  void  print();

    /**
     * 关
     */
    public  abstract  void  close();

    /**
     * 显示
     */
    public  final void  display(){
        open();
        for (int i = 0; i < 5; i++) {
            print();
        }
        close();
    }
}
