package atmMachine;

public class Account
{
	static int cardNum;
	int pinNum;
	static double balance;
	
	//public Account () 
	//{
		
	//}
	
	public Account(int card,int pin, double bal) 
	{
		Account.cardNum = card;
		this.pinNum = pin;
		Account.balance = bal;
	}
	
	/**
	 * Sets the Balance in the Account.
	 * 
	 * @param balance is the Balance in the Account.
	 */
	public static void setBalance(double bal) 
	{
		if (balance >= 0)
		{
			balance = bal;
		} // End of if-statement
	} // End of setBalance

	/**
	 * Gets the Balance in the Account.
	 * 
	 * @return balance. Balance as a double.
	 */
	public static double getBalance()
	{
		return Account.balance;
	} // End of getBalance

	/**
	 * Adding amount to the Balance in the Account.
	 * 
	 * @param amount. Amount added to the Account.
	 */
	public static void addToBalance(double amount)
	{
		if (amount > 0)
		{
			balance = balance + amount;
		} // End of if-statement
	} // End of addToBalance

	/**
	 * Subtracting amount from the Balance in the Account.
	 * 
	 * @param amount. Amount subtracted from the Account.
	 */
	public static void subtractFromBalance(double amount)
	{
		if (amount > 0)
		{
			balance = balance - amount;
		} // End of if-statement
	} // End of subtractFromBalance
	
	public static int getCardNum() 
	{
		return cardNum;
	}
}
