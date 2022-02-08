/**
 * 客户端
 *
 * @author 黄昌其
 * @date 2022/02/07
 */
public class Client {

    public static void main(String[] args) {
        WebSiteFactory factory = new WebSiteFactory();
        WebSite hcq = factory.getWebsite("网站");
        WebSite hcq1 = factory.getWebsite("博客");
        WebSite hcq2 = factory.getWebsite("cdn");
        hcq.use(new User("张三"));
        hcq1.use(new User("李四"));
        hcq2.use(new User("王五"));
        System.out.println("factory = " + factory.websitecount());
    }
}
