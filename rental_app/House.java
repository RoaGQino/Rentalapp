package rental_app;

public class House extends Building {
    private int numoffloor;

    public House(String address, String name, double size, int numberOfFloors) {
        super(address, name, size);
        this.numoffloor = numberOfFloors;
    }

    @Override
    public String getBuildingType() {
        return "House";
    }
}
