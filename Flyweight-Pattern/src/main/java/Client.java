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
        hcq.use();
        hcq1.use();
        hcq2.use();
        System.out.println("factory = " + factory.websitecount());
    }
}
