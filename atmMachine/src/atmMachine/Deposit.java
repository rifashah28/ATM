package atmMachine;

import java.util.Scanner;

//adds and amount to the account
public class Deposit 
{

	public void deposit()
	{
		double depositAmmount;//initial for the deposit ammount
		double accBalance;//initial for the account balance
		int choice;
		
		Scanner scan = new Scanner(System.in);//for scanning the user input for deposit
		System.out.println("Your balance is " + Account.getBalance());//show the user the balance before deposit
		System.out.println("How much would you like to deposit?");
		
		depositAmmount = scan.nextDouble();//taking in the deposit
		accBalance = Account.getBalance() + depositAmmount;//the new balance 
		
		System.out.println("Your new balance is " + accBalance);//print out new balance
		Account.setBalance(accBalance);//set the customer balance to the new 	
		System.out.println("Would you like a Receipt?\n1. Yes\n2. No");
		
		choice = scan.nextInt();
		if(choice == 1) 
		{
			//make receipt class
		}
		else 
		{
			System.out.println("Thank you! Have a nice day.");
		}
	}
}




// DO SOME TEST TO CHECK IF ITS RIGHT