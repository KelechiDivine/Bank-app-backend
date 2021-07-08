package zicoWallet;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class methodAccountTest {
	
	@Test
	public void testCustomerCanSave(){
		methodAccount account = new methodAccount();
		account.credit(200);
		Assertions.assertEquals(200, account.getCredit());
	}
	
}