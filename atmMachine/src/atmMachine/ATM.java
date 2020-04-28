package atmMachine;
import java.util.Scanner;

public class ATM
{
	/**
	 * Make this the main menu
	 */
	public void menu() 
	{
		
		Scanner menuChoice = new Scanner(System.in);
		
		System.out.println("Welcome to the ATM.");
		System.out.println("Please Enter Card Number: "); // give a 6 digit card num
		System.out.println("Please Enter Pin Number: "); // 6 digit pin num
		//if card num and pin num are right then thats when you get this menu
		//if not the program will exit after 3 tries
		
		/**
		 * need to make a txt file where the name is the card num.
		 * in the file the first line will be the pin num.
		 * the program will access the file by asking the user to enter the card num which is its name
		 * then the program will ask the user to enter the pin num. 
		 * if the pin num is equal to the first line of the txt file, then take the balance. 
		 * If not equal to the first line ask one more time. The user has 3 tries until the program will exit automatically
		 * After the program has access to the txt file, the values will be sent to Account.Account(card,pin,balance)
		 */
		
		//after the program has the balance show this menu
		System.out.println("Choose from the following Transactions or Exit.");
		System.out.println("1 - Deposit Funds.");
		System.out.println("2 - Withdraw Funds.");
		System.out.println("3 - Check Balance.");
		System.out.println("4 - Transfer Balance.");
		System.out.println("5 - Exit.");
		
		int userAns = menuChoice.nextInt();//takes the user's choice 
		
		
	} // End of menu
	
} // End of ATM class

