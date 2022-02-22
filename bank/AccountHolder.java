/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package marl.bank;

/**
 *
 * @author dmute
 */
public class AccountHolder {
    
    public String fullName;
    public int accountNumber;
    public int age;
    public int nationalIDnumber;
    public double balance;
    
    @Override
    public boolean equals(Object o) {
        return this.fullName.equals(((AccountHolder)o).fullName);
    }
    
    public String getfullName() {
        return fullName;
    }
    
    public int getaccountNumber() {
        return accountNumber;
    }
    
    public int age(){
        return age;
    }
    
    public int nationalIDnumber(){
        return nationalIDnumber;
    }
    
    public double balance(){
       return balance;
    }
    
    public void fullName(String s) {
        this.fullName = s;
    }
    
    public void accountNumber() {
        this.accountNumber = accountNumber;
        balance = 0;
    }
    
     public void age(int s) {
        this.age= s;
    }
     
      public void nationalIDnumber(int s) {
        this.nationalIDnumber = s;
    }
    
    public void double balance(){
        return this.balance;
    }
      
       public void setfullName(String s) {
        this.fullName = s;
    }
    
    public void setaccountNumber(int s) {
        this.accountNumber = s;
    }
    
     public void setage(int s) {
        this.age= s;
    }
     
      public void setnationalIDnumber(int s) {
        this.nationalIDnumber = s;
    }
}
