package rental_app;

public class Contract {
 private Building building;
 private String customerName;
 private int rentalPeriodMonths;
 private double price;

 public Contract(Building building, String customerName, int rentalPeriodMonths, double price) {
     this.building = building;
     this.customerName = customerName;
     this.rentalPeriodMonths = rentalPeriodMonths;
     this.price = price;
 }

 public Building getBuilding() {
     return building;
 }

 public String getCustomerName() {
     return customerName;
 }

 public int getRentalPeriodMonths() {
     return rentalPeriodMonths;
 }

 public double getPrice() {
     return price;
 }
}
