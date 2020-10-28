public class Tester{
  public static void main(String[] args){
    BankAccount Ba1 = new BankAccount(11122233, "secureconnection");
    System.out.println(Ba1.getBalance());
    Ba1.setPassword("newthinghaha");
    System.out.println(Ba1.deposit(500.01));
    if( Ba1.deposit(500.01) ){
           System.out.println("Deposit success!");
      }else{
           System.out.println("Deposit failure");
      }
    System.out.println(Ba1.getBalance());
  }
}
