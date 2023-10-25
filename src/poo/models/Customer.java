package poo.models;

import java.util.List;

public class Customer extends User{
  private List<Reservation> reservations;
  public Customer(String fullName, String email, String cellphone) {
    super(fullName, email, cellphone);
  }

  public List<Reservation> getReservations() {
    return reservations;
  }

  public void setReservations(List<Reservation> reservations) {
    this.reservations = reservations;
  }
}
