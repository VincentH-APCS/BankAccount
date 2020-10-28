public class Tester{
  public static void main(String[] args){
    BankAccount Ba1 = new BankAccount(11122233, "secureconnection");
    System.out.println(Ba1.getBalance());
    Ba1.setPassword("newthinghaha");
    //System.out.println(Ba1.deposit(500.01));
    if( Ba1.deposit(555.05) ){
           System.out.println("Deposit Success!");
      }else{
           System.out.println("Deposit Failure");
      }
      if( Ba1.withdraw(0) ){
             System.out.println("Withdrawal Success!");
        }else{
             System.out.println("Withdrawal Failure");
        }
    System.out.println(Ba1.getBalance());
  }
}
