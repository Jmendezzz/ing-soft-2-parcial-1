package poo.models;

import poo.enums.RoomStatus;

public class Room {
  private String roomNumber;
  private Integer capacity;
  private RoomStatus status;

  public Room(String roomNumber, Integer capacity, RoomStatus status) {
    this.roomNumber = roomNumber;
    this.capacity = capacity;
    this.status = status;
  }

  public String getRoomNumber() {
    return roomNumber;
  }

  public void setRoomNumber(String roomNumber) {
    this.roomNumber = roomNumber;
  }

  public Integer getCapacity() {
    return capacity;
  }

  public void setCapacity(Integer capacity) {
    this.capacity = capacity;
  }

  public RoomStatus getStatus() {
    return status;
  }

  public void setStatus(RoomStatus status) {
    this.status = status;
  }
}
