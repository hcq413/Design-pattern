import java.util.HashMap;

/**
 * 网站工厂
 *
 * @author 黄昌其
 * @date 2022/02/07
 *GitLa'b
 */
public class WebSiteFactory {
    //集合,充当池的使用
    protected HashMap<String, ConcreWebsite> pool = new HashMap();

    public WebSite getWebsite(String type) {
        if (!pool.containsKey(type)) {
            pool.put(type, new ConcreWebsite(type));
        }
        return (WebSite) pool.get(type);
    }

    public Integer websitecount() {
        return pool.size();
    }
}
