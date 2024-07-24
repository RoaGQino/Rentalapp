package rental_app;

public class Shop extends Building {
    private String shopType;

    public Shop(String address, String name, double size, String shopType) {
        super(address, name, size);
        this.shopType = shopType;
    }

    @Override
    public String getBuildingType() {
        return "Shop";
    }
}