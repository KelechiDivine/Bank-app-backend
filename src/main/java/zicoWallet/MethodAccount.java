package zicoWallet;

public class MethodAccount {

	/** This are the  necessary things a customer will need to open
	 * a bank account**/
	
	private String firstName;
	private String lastName;
	private int mobileNumber;
	private String dob;
	private String address;
	private int id;
	private double balance;
	
	/**We are creating different constructors also called 'method overloading'
	 * this method is for flexibility**/
	
	
	public MethodAccount(){}
	
	
	public MethodAccount(String firstName, String lastName, String dob
			, String address) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.dob = dob;
		this.address = address;
	}
	
	public MethodAccount(int id, int mobileNumber) {
		this.id = id;
		this.mobileNumber = mobileNumber;
	}
	
	public MethodAccount(String firstName, String lastName, int mobileNumber,
						 String dob, String address, int id) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.mobileNumber = mobileNumber;
		this.dob = dob;
		this.address = address;
		this.id = id;
	}
	
	/**I created a getter method that get and return whatever value a a customer
	 * will be given us**/
	
	public String getFirstName() {
		return firstName;
	}
	
	public String getLastName() {
		return lastName;
	}
	
	public int getMobileNumber() {
		return mobileNumber;
	}
	
	public String getDob() {
		return dob;
	}
	
	public String getAddress() {
		return address;
	}
	
	public int getId() {
		return id;
	}
	
	/**I created a balance method that validate that user balance
	 * can't be less than 0**/
	
	public double withdraw(double isWithdraw){
		if (isWithdraw > 0.00)
			balance = balance - isWithdraw;
		return balance;
	}
	
	/**I created a withdrawal method that checks and validate amounts/ balance is
	 * not below or higher than what a user saves or withdrew**/
	
	public void credit(int isCredited){
		if (isCredited > 0.00)
			balance = balance + isCredited;
	}
	
	public double getCredit(){
		return balance  ;
	}
	
	public void sendAmount(double transfer){
		if (transfer <= balance)
			balance = balance - transfer;
	}
	
	public double getTransfer() {
		return balance;
	}
	
	
	public MethodAccount(double balance) {
		if (balance == balance && balance >= 0)
			this.balance = balance;
	}
	
	public double getBalance() {
		return balance;
	}
}
