public class BankAccount{
  private double balance;
  private int accountID;
  private String password;
public BankAccount(int a, String p){
  balance = 0;
  accountID = a;
  password = p;
}
public double getBalance(){
  return balance;
}
public int getAccountID(){
  return accountID;
}
public String setPassword(String newPass){
  password = newPass;
  return password; //this will just be to test if the password changed
}
}
