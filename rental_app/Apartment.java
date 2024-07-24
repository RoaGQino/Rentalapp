package rental_app;

public class Apartment extends Building {
    private int numofroom;

    public Apartment(String address, String name, double size, int numberOfRooms) {
        super(address, name, size);
        this.numofroom = numberOfRooms;
    }

    @Override
    public String getBuildingType() {
        return "Apartment";
    }
}
