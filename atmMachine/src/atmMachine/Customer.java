/**
 * Description:
 * CECS 343 SPRING 2020
 * ATM Machine: Customer
 * @author Nathaniel Monte De Ramos and Rifa Safeer Shah
 * Date:
 */

package atmMachine;

public class Customer {

	/** Account Number of the Customer. */
	private String accountNumber;
	
	/** Pin Number for the Account. */
	private String pinNumber;
	
	/** Balance in the Account. */
	private double balance;
	
	/**
	 * Constructor for the Customer class.
	 * @param accountNumber is the Account Number of the Customer.
	 * @param pinNumber is the Pin Number for the Account
	 */
	public Customer (String accountNumber, String pinNumber) {
		setAccountNumber(accountNumber);
		setPinNumber(pinNumber);
	} // End of Customer constructor
	
	/**
	 * Sets the Pin Number for the Account.
	 * @param pinNumber is the Pin Number for the Account.
	 */
	private void setPinNumber(String pinNumber) {
		if (pinNumber != null) {
			this.pinNumber = pinNumber;
		} // End of if-statement
	} // End of setPinNumber
	
	/**
	 * Gets the pin Number for the Account.
	 * @return pinNumber. Pin Number as a String.
	 */
	public String getPinNumber() {
		return pinNumber;
	} // End of getPinNumber
	
	/**
	 * Sets the Account Number of the Customer.
	 * @param accountNumber is the Account Number of the Customer.
	 */
	private void setAccountNumber(String accountNumber) {
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
