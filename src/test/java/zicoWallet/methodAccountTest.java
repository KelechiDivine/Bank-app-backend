package zicoWallet;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class methodAccountTest {
	
	@Test
	public void testAccountBalance(){
		MethodAccount account = new MethodAccount(0.0);
		Assertions.assertEquals(0.0, account.getBalance());
	}
	
	@Test
	public void testCustomerCanSave(){
		MethodAccount account = new MethodAccount();
		account.credit(200);
		Assertions.assertEquals(200, account.getCredit());
	}
	
	@Test
	public void testCustomerCanSendMoney(){
		MethodAccount methodAccount = new MethodAccount();
		methodAccount.sendAmount(2500);
		Assertions.assertEquals(500, methodAccount.getTransfer());
	}
	
}