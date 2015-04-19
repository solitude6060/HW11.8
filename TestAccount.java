import java.util.Date;
import java.util.ArrayList;
import java.util.Scanner;


public class TestAccount {

	public static void main(String[] args) {
		int id = 1122;
		double balance = 1000;
		double annualInterestRate = 0.015;
		String name = "George";
		Date dateCreated ;
		double money;
		int distinguish = 0;
		
		//scanner
		Scanner input = new Scanner(System.in);
		//new object
		newAccount nacc = new newAccount();
		Transaction Tr = new Transaction();
		
		//get time
		dateCreated = nacc.getDateCreated();
		//set name,id,balance,rate
		nacc.setName(name);
		nacc.setid(id);
		nacc.setBalance(balance);
		nacc.setAnnualInterestRate(annualInterestRate);
		
		//asking
		System.out.println("Enter 1 to withdraw / Enter 2 to deposit : ");
		distinguish = input.nextInt();
		
		//choosing
		if(distinguish == 1){
			System.out.println("How much do you want to withdraw : ");
			money = input.nextInt();
			
			//withdrew money
			nacc.withdraw(money);
			System.out.printf("Holder name : "+nacc.getName()+"\nAccount balance : %f\ninterest rate : %f\n",nacc.getBalance(),nacc.getannualInterestRate());
			System.out.printf("Transaction Type : %c\n",nacc.act.get(0).getType());
			System.out.printf("Transaction Time : "+nacc.act.get(0).getDate()+"\n");
			System.out.printf("Transaction description : %s\n",nacc.act.get(0).getDescription());
			
			
		}
		//choosing		
		if(distinguish == 2){
			System.out.println("How much do you want to deposit : ");
			money = input.nextInt();
			
			//deposit money
			nacc.deposit(money);
			System.out.printf("Holder name : "+nacc.getName()+"\nAccount balance : %f\ninterest rate : %f\n",nacc.getBalance(),nacc.getannualInterestRate());
			System.out.printf("Transaction Type : %c\n",nacc.act.get(0).getType());
			System.out.printf("Transaction Time : \n"+nacc.act.get(0).getDate());
			System.out.printf("Transaction description : %s\n",nacc.act.get(0).getDescription());
					
						
		}
		
	}

}
