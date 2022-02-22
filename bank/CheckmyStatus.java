/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package marl.bank;

import java.util.Date;
/**
 *
 * @author dmute
 */
public class CheckmyStatus extends AccountHolder{
    
    private static double fee = 4.2;
    
    public CheckingAccount(){
    }
    
    
    private int bankIDnumber;
    public String fullName;
    public int age;
    public int nationalIDnumber;
    public int moneydeposited;
    public int moneywithdrawn;
    
     public String getfullName() {
        return fullName;
    }
    
    public int age(){
        return age;
    }
    
    public int nationalIDnumber(){
        return nationalIDnumber;
    }
    
    public int getmoneydeposited () {
        return moneydeposited;
    }
    
    public int getmoneywithdrawn (){
     return moneywithdrawn;   
    }    
    
    public void setfullName(String s) {
        this.fullName = s;
    }
    
     public void setage(int s) {
        this.age= s;
    }
     
      public void setnationalIDnumber(int s) {
        this.nationalIDnumber = s;
    }
      
     public void setmoneydeposited(int s) {
        this.moneydeposited = s;
    }
    
     public void setmoneywithdrawn(int s) {
        this.age= s;
    }
     
   private Date date;
   
   public void setDate(Date date) {
       this.date = date;
   }
    public void deposit(double amount) {
    }
    
    public void withdraw(double amount) {
    }
}


