import java.util.Date;
import java.util.ArrayList;
import java.util.Scanner;

public class newAccount {

	String name;//name of customer
	private int id = 0;//in 8.7
	private double balance = 0;//in 8.7
	private double annualInterestRate = 0;//in 8.7
	private Date dateCreated;//in 8.7
	ArrayList transactions;//arraylist
	
	
    public newAccount(String name,int id, double balance){
		this.name = name;
		this.id = id;
		this.balance = balance;
	}
    
    //setter and getter
    public void setid(int id){
		this.id = id;
	}
	
	public int getid(){
		return id;
	}

	public void setBalance(double balance ){
		this.balance = balance;
	}
	
	public double getBalance(){
		return balance;
	}
	
	public void setAnnualInterestRate(double annualInterestRate ){
		this.annualInterestRate = annualInterestRate;
	}
	
	public double getannualInterestRate(){
		return annualInterestRate;
	}
	
	public Date getDateCreated(){
		return dateCreated;
	}
	
	public double getMonthlyInterestRate(){
		return (annualInterestRate/12);
	}
	
	public double getMonthlyInterest(){
		return (balance*annualInterestRate/1200);
	}
	
	
    //method
    public void withdraw(double money){
		balance = balance - money;
	} 
			
	public void deposit(double money){
		balance =  balance + money;
	}
    
	
	
}

