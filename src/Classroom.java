public class Classroom {
  public static void main(String[] args) {
    Wilder firstWilder = new Wilder("Jean-claude", true);
    Wilder secondWilder = new Wilder("Henri", false);

    System.out.println(firstWilder.whoAmI());
    System.out.println(secondWilder.whoAmI());

  }

}
