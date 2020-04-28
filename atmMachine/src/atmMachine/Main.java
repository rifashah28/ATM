package atmMachine;
// put main to the ATM class... 
public class Main {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Customer customer = new Customer("joe","jane","1","1");
		ATM atm = new ATM();
		
		//assuming card and pin are correct
		atm.menu();
		
		
		System.out.println("end");
	}

}

