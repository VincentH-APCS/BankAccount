public class Tester{
  public static void main(String[] args){
    BankAccount Ba1 = new BankAccount(11122233, "secureconnection");
    BankAccount Ba2 = new BankAccount(55555555, "otherpw4");
    System.out.println(Ba1.getBalance());
   Ba1.setPassword("newthinghaha");
    if( Ba1.deposit(555.05) ){
         System.out.println("Deposit Success!");
      }else{
           System.out.println("Deposit Failure");
      }
    System.out.println(Ba1.getBalance());
   System.out.println(Ba1.toString());
//  System.out.println(Ba1.authenticate("newthinghaha"));
  System.out.println(Ba1.transferTo(Ba2,1100,"newthinghaha"));
}
}
