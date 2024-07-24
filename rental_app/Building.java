package rental_app;

public abstract class Building {
 protected String address;
 protected String name;
 protected double size; 


 public Building(String address, String name, double size) {
     this.address = address;
     this.name = name;
     this.size = size;
 }


 public String getAddress() {
     return address;
 }

 public String getName() {
     return name;
 }

 public double getSize() {
     return size;
 }


 public abstract String getBuildingType();
}

 interface Payment {
 void pay(double amount);
}

 class PayPalPayment implements Payment {
 private String email;

 public PayPalPayment(String email) {
     this.email = email;
 }

 @Override
 public void pay(double amount) {
     
     System.out.println("Payment of $" + amount + " made via PayPal to " + email);
 }
}

 class CardPayment implements Payment {
 private String cardNumber;
 private String cardHolder;

 public CardPayment(String cardNumber, String cardHolder) {
     this.cardNumber = cardNumber;
     this.cardHolder = cardHolder;
 }

 @Override
 public void pay(double amount) {

     System.out.println("Payment of $" + amount + " made via Card ending in " + cardNumber.substring(cardNumber.length() - 4));
 }
}

