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
	public  void testIndexOutOfBoundsExceptionForCredited() throws IndexOutOfBoundsException{
		AccountMethod accountMethod = new AccountMethod(-1);
		Throwable throwable = Assertions.assertThrows(IndexOutOfBoundsException.class,
				accountMethod::getCredit);
		Assertions.assertEquals("", throwable.getMessage());
	}
	
	@Test
	public void testAccountCanBeCredited(){
		AccountMethod accountMethod = new AccountMethod(100L);
		Assertions.assertEquals(3100, accountMethod.getCredit());
	}
	
	@Test
	public void testAmountCanTransfer(){
		AccountMethod accountMethod = new AccountMethod();
		accountMethod.sendAmount(3500);
		Assertions.assertEquals(3000, accountMethod.getTransfer());
	}
}