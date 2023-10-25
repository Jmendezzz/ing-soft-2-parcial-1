package poo.models;

import poo.enums.ReservationStatus;

import java.time.LocalDate;

public class Reservation {
  private Customer customer;
  private Room room;
  private LocalDate startDate;
  private LocalDate endDate;
  private Integer numberOfGuests;
  private ReservationStatus status;
}
