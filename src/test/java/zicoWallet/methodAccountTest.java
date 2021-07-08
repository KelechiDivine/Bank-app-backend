package zicoWallet;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class methodAccountTest {
	
	@Test
	public void testAccountBalance(){
		AccountMethod account = new AccountMethod(0.0);
		Assertions.assertEquals(0.0, account.getBalance());
	}
	
	@Test
	public void testCanWithdraw(){
		AccountMethod methodAccount = new AccountMethod();
		methodAccount.withdraw(2500);
		Assertions.assertEquals(500, methodAccount.getWithdraw());
	}
	
	@Test
	public  void testIsCreated(){
		AccountMethod accountMethod = new AccountMethod();
		accountMethod.credit(-1);
		Assertions.assertEquals(2999, accountMethod.getCredit());
	}
	
	@Test
	public void testCanTransfer(){
		AccountMethod accountMethod = new AccountMethod();
		accountMethod.sendAmount(3500);
		Assertions.assertEquals(3000, accountMethod.getTransfer());
	}
}