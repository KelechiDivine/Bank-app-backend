package zicoWallet;

public class AccountMethod {

	/** This are the  necessary things a customer will need to open
	 * a bank account**/
	
	private String firstName;
	private String lastName;
	private int mobileNumber;
	private String dob;
	private String address;
	private int id;
	private double balance = 3000;
	
	/**We are creating different constructors also called 'method overloading'
	 * this method is for flexibility**/
	
	
	public AccountMethod(){}
	
	public AccountMethod(String firstName, String lastName, String dob
			, String address) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.dob = dob;
		this.address = address;
	}
	
	public AccountMethod(int id, int mobileNumber) {
		this.id = id;
		this.mobileNumber = mobileNumber;
	}
	
	public AccountMethod(String firstName, String lastName, int mobileNumber,
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
	
	public void withdraw(double isWithdraw){
		if (isWithdraw > balance)
			System.out.print("Transaction error.");
		
		if (isWithdraw <= balance && isWithdraw >= 0)
			System.out.print("Transaction successful..");
			balance = balance - isWithdraw;
	}
	
	
	/**I created a withdrawal method that checks and validate amounts/ balance is
	 * not below or higher than what a user saves or withdrew**/
	
	public void credit(int isCredited){
		if (isCredited < 0)
			System.out.print("Transaction could not be performed.");
		
		if (isCredited > 0)
			System.out.print("Your account has been credited.");
		balance = balance + isCredited;
	}
	
	public double getCredit(){
		return balance;
	}
	
	public void sendAmount(float transfer){
		if (transfer > balance)
			System.out.print("Insufficient balance to make transactions.");
		
		if (transfer <= balance)
			balance = transfer - balance;
	}
	
	public double getTransfer() {
		return balance;
	}
	
	
	public AccountMethod(double balance) {
		if (balance == balance && balance >= 0)
			this.balance = balance;
	}
	
	public double getBalance() {
		return balance;
	}
	
	public double getWithdraw() {
		return balance;
	}
}
