package atmMachine;
//Take this class and combine this to Account
public class Customer 
{
	/**
	 * First name and last name can be deleted because we only need card and pin for the program to work..
	 * Card num and pin will access the balance
	 */
	/** First Name of the Customer. */
	private String firstName;
	
	/** Last Name of the Customer. */
	private String lastName;
	
	/** Account Number of the Customer. */
	private String accountNumber;
	
	/** Pin Number for the Account. */
	private String pinNumber;
	
	/** Balance in the Account. */
	private double balance;
	
	/**
	 * Constructor for the Customer class.
	 * @param firstName is the First Name of the Customer.
	 * @param lastName is the Last Name of the Customer.
	 * @param accountNumber is the Account Number of the Customer.
	 * @param pinNumber is the Pin Number for the Account
	 */
	public Customer (String firstName, String lastName, String accountNumber, String pinNumber) 
	{
		setFirstName(firstName);
		setLastName(lastName);
		setAccountNumber(accountNumber);
		setPinNumber(pinNumber);
	} // End of Customer constructor
	
	/**
	 * Sets the Pin Number for the Account.
	 * @param pinNumber is the Pin Number for the Account.
	 */
	private void setPinNumber(String pinNumber)
	{
		// TODO Auto-generated method stub
		if (pinNumber != null) 
		{
			this.pinNumber = pinNumber;
		} // End of if-statement
	} // End of setPinNumber
	
	/**
	 * Gets the pin Number for the Account.
	 * @return pinNumber. Pin Number as a String.
	 */
	public String getPinNumber()
	{
		return pinNumber;
	} // End of getPinNumber
	
	/**
	 * Sets the Account Number of the Customer.
	 * @param accountNumber is the Account Number of the Customer.
	 */
	private void setAccountNumber(String accountNumber) {
		// TODO Auto-generated method stub
		if (accountNumber != null) {
			this.accountNumber = accountNumber;
		} // End of if-statement
	} // End of setAccountNumber
	
	/**
	 * Gets the Account Number of the Customer.
	 * @return accountNumber. Account Number as a String.
	 */
	public String getAccountNumber() {
		return accountNumber;
	} // End of getAccountNumber

	/**
	 * Sets the Last Name of the Customer.
	 * @param lastName is the Last Name of the Customer.
	 */
	private void setLastName(String lastName) {
		// TODO Auto-generated method stub
		if (lastName != null) {
			this.lastName = lastName;
		} // End of if-statement
	} // End of setLastName
	
	/**
	 * Gets the Last Name of the Customer.
	 * @return lastName. Last Name as a String.
	 */
	public String getLastName() {
		return lastName;
	} // End of getLastName

	/**
	 * Sets the First Name of the Customer.
	 * @param firstName is the First Name of the Customer.
	 */
	private void setFirstName(String firstName) {
		// TODO Auto-generated method stub
		if (firstName != null) {
			this.firstName = firstName;
		} // End of if-statement
	} // End of setFirstName
	
	/**
	 * Gets the First Name of the Customer.
	 * @return firstName. First Name as a String.
	 */
	public String getFirstName() {
		return firstName;
	} // End of getFirstName
	
	/**
	 * Sets the Balance in the Account.
	 * @param balance is the Balance in the Account.
	 */
	public void setBalance(double balance) {
		if (balance >= 0) {
			this.balance = balance;
		} // End of if-statement
	} // End of setBalance
	
	/**
	 * Gets the Balance in the Account.
	 * @return balance. Balance as a double.
	 */
	public double getBalance() {
		return balance;
	} // End of getBalance
	
	/**
	 * Adding amount to the Balance in the Account.
	 * @param amount. Amount added to the Account.
	 */
	public void addToBalance(double amount) {
		if (amount > 0) {
			balance = balance + amount;
		} // End of if-statement
	} // End of addToBalance
	
	/**
	 * Subtracting amount from the Balance in the Account.
	 * @param amount. Amount subtracted from the Account.
	 */
	public void subtractFromBalance(double amount) {
		if (amount > 0) {
			balance = balance - amount;
		} // End of if-statement
	} // End of subtractFromBalance
}
