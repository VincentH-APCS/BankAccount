public class BankAccount{
  private double balance;
  private int accountID;
  private String password;
public BankAccount(int accountID, String password){
  balance = 0;
  accountID = accountID;
  password = password;
}
public double getBalance(){
  return balance;
}
public int getAccountID(){
  return accountID;
}

}
