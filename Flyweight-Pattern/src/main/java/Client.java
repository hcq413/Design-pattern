/**
 * 客户端
 *
 * @author 黄昌其
 * @date 2022/02/07
 */
public class Client {

    private static User user;

    public static void main(String[] args) {
        user = new User();
        WebSiteFactory factory = new WebSiteFactory();
        WebSite hcq = factory.getWebsite("网站");
        WebSite hcq1 = factory.getWebsite("博客");
        WebSite hcq2 = factory.getWebsite("cdn");
        user.setName("hcq1");
        hcq.use(user);
        user.setName("hcq2");
        hcq1.use(user);
        user.setName("hcq3");
        hcq2.use(user);
        System.out.println("factory = " + factory.websitecount());
    }
}
