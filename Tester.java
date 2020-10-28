public class Tester{
//  public static void main(String[] args){
  //  BankAccount Ba1 = new BankAccount(11122233, "secureconnection");
    //System.out.println(Ba1.getBalance());
  // Ba1.setPassword("newthinghaha");
  //  if( Ba1.deposit(555.05) ){
      //    System.out.println("Deposit Success!");
    //  }else{
      //     System.out.println("Deposit Failure");
      //}
    //  if( Ba1.withdraw(7777) ){
    //         System.out.println("Withdrawal Success!");
    //    }else{
    //         System.out.println("Withdrawal Failure");
  //      }
//    System.out.println(Ba1.getBalance());
   //System.out.println(Ba1.toString());
//}
//}
public static void main (String[] args) {
    BankAccount testAcct = new BankAccount(95, "somepassword");


    // tests for toString()
    System.out.println(testAcct.deposit(3.5));      // true
    System.out.println(testAcct.getBalance());      // return 3.5
    System.out.println(testAcct.toString());        // return 95    3.5 (the space is a tab)
    //
  }}
