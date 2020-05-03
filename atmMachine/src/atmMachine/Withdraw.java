package atmMachine;

import java.util.Scanner;

//subracts an Amount from the account balance
public class Withdraw 
{
	public static void withdraw() 
	{
		double withdrawAmount;
		double accBalance;
		boolean wrongAmount = true;//checks the amount
		int choice;
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Your balance is " + Account.getBalance());

		for(int i = 0; i < 3 && wrongAmount; i++)//user gets 3 tries
		{
			System.out.println("How much woul you like to withdraw?");
			withdrawAmount = scan.nextDouble();
			
			if(withdrawAmount >= Account.getBalance()) 
			{
				System.out.println("Withdrawal Amount is Greater than your Balance.\nPlease Try Again.");
			}
			else 
			{
				accBalance = Account.getBalance() - withdrawAmount;
				
				System.out.println("Your new balance is " + accBalance);
				Account.setBalance(accBalance);
				wrongAmount = false;
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
	}
}
//DO SOME TEST TO CHECK IF ITS RIGHT