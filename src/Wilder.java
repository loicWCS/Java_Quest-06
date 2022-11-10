public class Wilder {
  private String firstname;
  private boolean aware;

  public Wilder(String firstname, boolean aware) {
    this.firstname = firstname;
    this.aware = aware;
  }

  public Wilder(String firstname2, Object aware2) {}

  // Getters
  public String getFirstname() {
    return this.firstname;
  }

  public boolean isAware() {
    return this.aware;

  }

  // Setters
  public void setFirstname(String newfirstname) {
    this.firstname = newfirstname;
  }

  public void setAware(boolean newAware) {
    this.aware = newAware;
  }

  public String whoAmI() {
    return String.format("Je m'appelle %1$s et %2$s", this.getFirstname(),
        this.isAware() ? "je suis aware" : "je ne suis pas aware");
  }

}
