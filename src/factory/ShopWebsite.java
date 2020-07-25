package factory;

public class ShopWebsite extends Website{
    @Override
    protected void createWebsite() {
        pages.add(new ShopPage());
    }
}
