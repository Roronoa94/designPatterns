package factory;

public class BlogWebsite extends Website{
    @Override
    protected void createWebsite() {
        pages.add(new BlogPage());
    }
}
