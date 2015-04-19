import java.util.Date;
import java.util.ArrayList;
import java.util.Scanner;



public class Transaction {		
	private Date date;
	private char type;
	private double amount,balance;
	private String description;
	
	//default constructor
	public Transaction(){
		
	}
	
	//constructor
	public Transaction(char type, double amount, double balance,String description){
			this.type = type;
			this.amount = amount;
			this.balance = balance;
			this.description = description;
			this.date = new Date();
	}
	
	//setter & getter
	public void setType(char type){
		this.type = type;
	}
	public char getType(){
		return type;
	}
	public void setAmount(double amount){
		this.amount = amount;
	}
	public double getAmount(){
		return amount;
	}
	public void setBalance(double balance){
		this.balance = balance;
	}
	public double getBalance(){
		return balance;
	}
	public void setDescription(String description){
		this.description = description;
	}
	public String getDescription(){
		return description;
	}
	public Date getDate(){
		return date;
	}
	
	
	
	
	
	
		
}

