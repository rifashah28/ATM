package atmMachine;

public class Account
{
	int cardNum;
	int pinNum;
	double balance;
	
	public Account () 
	{
		
	}
	public Account(int card,int pin, double balance) 
	{
		this.cardNum = card;
		this.pinNum = pin;
		this.balance = balance;
	}
	
	/**
	 * Sets the Balance in the Account.
	 * 
	 * @param balance is the Balance in the Account.
	 */
	public void setBalance(double balance) 
	{
		if (balance >= 0)
		{
			this.balance = balance;
		} // End of if-statement
	} // End of setBalance

	/**
	 * Gets the Balance in the Account.
	 * 
	 * @return balance. Balance as a double.
	 */
	public double getBalance()
	{
		return balance;
	} // End of getBalance

	/**
	 * Adding amount to the Balance in the Account.
	 * 
	 * @param amount. Amount added to the Account.
	 */
	public void addToBalance(double amount)
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
	public void subtractFromBalance(double amount)
	{
		if (amount > 0)
		{
			balance = balance - amount;
		} // End of if-statement
	} // End of subtractFromBalance
}
