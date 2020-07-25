package factory;

public class WebsiteFactory {

    public static Website getWebsite(WebsiteType websiteType) {
        switch (websiteType) {
            case BLOG: {
                return new BlogWebsite();
            }
            case SHOP: {
                return new ShopWebsite();
            }
            default:{
                return null;
            }
        }
    }
}
