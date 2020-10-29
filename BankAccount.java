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
public void setPassword(String newPass){
  password = newPass;
}
public boolean deposit(double amount){
  if(amount < 0){
    return false;
  }
  else {
    balance = balance + amount;
    return true;
  }
}
public boolean withdraw(double amount){
  if(amount < 0 || amount > balance){
    return false;
  }
  else {
    balance = balance - amount;
    return true;
  }
}
public String toString(){
  return ("#"+accountID +"\t$"+balance);
}
public boolean authenticate(String password){
  if(this.password.equals(password)){
    return true;
  }
  else return false;
}
}
// : )
