import java.util.Enumeration;

public class TextStatement extends Statement {

  public String announce(Customer aCustomer) {
    return "Rental Record for " + aCustomer.getName() + "\n";
  }

  public String rentalListing(Customer aCustomer, String result) {
    Enumeration rentals = aCustomer.getRentals();
    while (rentals.hasMoreElements()) {
         Rental each = (Rental) rentals.nextElement();
         result += "\t" + each.getMovie().getTitle()+ "\t" +
         String.valueOf(each.getCharge()) + "\n";
      }
    return result;
  }

  public String footerLines(Customer aCustomer, String result) {
    result += "Amount owed is " + String.valueOf(aCustomer.getTotalCharge()) + "\n";
    result += "You earned " + String.valueOf(aCustomer.getTotalFrequentRenterPoints()) +" frequent renter points";
    return result;
  }
}
