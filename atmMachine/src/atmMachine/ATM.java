package atmMachine;
import java.util.List;
import java.util.Scanner;
import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class ATM
{
	public static void main(String args[]) 
	{
		int cardNumberFromFile = 0;
		int pinNumberFromFile = 0;
		int balanceFromFile = 0;
		
		Account userBankAccount;
		
		boolean cardNumExist = true;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Welcome to the ATM.");
		System.out.println("Please Enter Card Number: "); // give a 6 digit card num
		int cardNum = sc.nextInt();//takes the card number from user
		
		/**
		 * need to make a txt file where the name is the card num.
		 * in the file the first line will be the pin num.
		 * the program will access the file by asking the user to enter the card num which is its name
		 * then the program will ask the user to enter the pin num. 
		 * if the pin num is equal to the second line of the txt file, then take the balance. 
		 * If not equal to the second line ask one more time. The user has 3 tries until the program will exit automatically
		 * After the program has access to the txt file, the values will be sent to Account.Account(card,pin,balance)
		 */
		
		while(cardNumExist)//while card numbers exist
		{
			try 
			{
				Path fileScan = Paths.get(cardNum + ".txt");//search for card num text file
				List<String> lines = Files.readAllLines(fileScan);//put all lines in a List of strings
				cardNumberFromFile = Integer.parseInt(lines.get(0));//the card number that is on the file(file name)
				pinNumberFromFile = Integer.parseInt(lines.get(1));//the pin number that is on the file
				balanceFromFile = Integer.parseInt(lines.get(2));//balance amount on the file
			
				break;
			}
			catch(Exception e) 
			{
				System.out.println("Card does not Exist");
			}
		}

		//fix pin number attempts
		for(int i = 0; i < 3; i++) 
		{
			
			System.out.println("Please Enter Pin Number: "); // 5 digit pin num
			//if card num and pin num are right then thats when you get this menu
			//if not the program will exit after 3 tries
			int pinNum = sc.nextInt();
			
			if(pinNum == pinNumberFromFile) 
			{
				i += 2;
				userBankAccount = new Account(cardNumberFromFile, pinNumberFromFile, balanceFromFile);//the account of the user
				
				//WELCOME Message
				System.out.println("Hello, Welcome to your Bank Account");
				//after the program has the balance show this menu
				System.out.println("Choose from the following Transactions or Exit.");
				System.out.println("1 - Deposit Funds.");
				System.out.println("2 - Withdraw Funds.");
				System.out.println("3 - Check Balance.");
				System.out.println("4 - Transfer Balance.");
				System.out.println("5 - Exit.");
				
				int choice = sc.nextInt();
				switch(choice) 
				{
					case 1:
						Deposit.deposit();
						break;
					case 2:
						Withdraw.withdraw();
						break;
					case 3:
						CheckBalance.checkBalance();
						break;
					case 4:
						TransferFund.transferFund();
						break;
					case 5:
						System.out.println("Thank you. Have a nice day.");
						System.exit(0);					
				}
				
			}
			else //else if the pin number entered by the user is right
			{
				System.out.println("Wrong Pin Number. Please try again");
				
				if(i == 3) 
				{
					System.out.println("Login Attempt Exceeded Allowed Ammount.");
					System.exit(0);
				}
				//opens the same text then writes the new balance	
			}
		}
	} // End of menu
	
} // End of ATM class

