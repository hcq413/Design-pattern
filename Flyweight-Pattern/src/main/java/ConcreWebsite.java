
/**
 * Conre网站
 *
 * @author 黄昌其
 * @date 2022/02/07
 */

public class ConcreWebsite extends WebSite {
    private String name = "";

    public ConcreWebsite(String name) {
        this.name = name;
    }

    public void use(User user) {
        System.out.println("当前网站正在以 " + name + "使用中");
        System.out.println("当前用户为:"+user.getName());
    }
}
