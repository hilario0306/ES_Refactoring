public abstract class Statement {
  public String value(Customer aCustomer) {
      String result = announce(aCustomer); //1
      result = rentalListing(aCustomer, result); //2
      result = footerLines(aCustomer, result); //3
      return result;
  }

  abstract public String announce(Customer aCustomer);
  abstract public String rentalListing(Customer aCustomer, String result);
  abstract public String footerLines(Customer aCustomer, String result);
}
