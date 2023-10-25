package poo.models;

public class User {
  private String fullName;
  private String email;
  private String cellphone;

  public User(String fullName, String email, String cellphone) {
    this.fullName = fullName;
    this.email = email;
    this.cellphone = cellphone;
  }

  public String getFullName() {
    return fullName;
  }

  public void setFullName(String fullName) {
    this.fullName = fullName;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public String getCellphone() {
    return cellphone;
  }

  public void setCellphone(String cellphone) {
    this.cellphone = cellphone;
  }
}
