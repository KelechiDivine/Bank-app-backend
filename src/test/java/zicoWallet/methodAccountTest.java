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
	public void testWithdrawIsOutOBounds() throws Exception {
		AccountMethod methodAccount = new AccountMethod();
		methodAccount.withdrawalOutOfBound(3500);
		Throwable throwable = Assertions.assertThrows(IndexOutOfBoundsException.class,
				methodAccount::getWithdraw);
		Assertions.assertEquals("", throwable.getMessage());
	}
	
	@Test
	public void testWithdrawAmount(){
		AccountMethod accountMethod = new AccountMethod();
		accountMethod.withdraw(300);
		Assertions.assertEquals(2700, accountMethod.getWithdraw());
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
	public void testAmountTransferIsOutOfBound() throws  IndexOutOfBoundsException{
		AccountMethod accountMethod = new AccountMethod();
		accountMethod.sendAmountIsOutOfBound(3500);
		Throwable throwable = Assertions.assertThrows(IndexOutOfBoundsException.class,
				accountMethod::getTransfer);
		Assertions.assertEquals("", throwable.getMessage());
	}
	
	@Test
	public void testAmountCanBeTransferred(){
		AccountMethod accountMethod = new AccountMethod();
		accountMethod.sendMoney(2900);
		Assertions.assertEquals(100, accountMethod.getTransfer());
	}
}