import java.util.Date;
import java.util.ArrayList;
import java.util.Scanner;

public class newAccount {

	String name;//name of customer
	
	//in 8.7
	private int id = 0;
	private double balance = 0;
	private double annualInterestRate = 0;
	private Date dateCreated;
	//arraylist
	ArrayList transactions;
	
    public newAccount(String name,int id, double balance){
		this.name = name;
		this.id = id;
		this.balance = balance;
	}
    
    
	
	
}
