public class Tester{
  public static void main(String[] args){
    BankAccount Ba1 = new BankAccount(11122233, "secureconnection");
    System.out.println(Ba1.getBalance());
    System.out.println(Ba1.getAccountID());
  }
}
