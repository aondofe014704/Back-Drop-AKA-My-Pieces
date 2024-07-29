package testedCodes.TestedAccount;

import TestedAccount.Account;
import TestedAccount.AmountMustBeGreaterThanZero;
import TestedAccount.AccountBalanceIsTooLowException;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class AccountTest {
    @Test
    public void testThatAccountCanBeCreated(){
        Account account = new Account();
        assertNotNull(account);
    }
    @Test
    public void testThatAccountIsZeroBalancedOnCreation(){
        Account account = new Account();
        assertEquals(0, account.checkBalance("0147"));
    }
    @Test
    public void testToGetAccountName(){
        Account account = new Account();
        account.getAccountName("Jack Songu");
    }
    @Test
    public void testToGetAccountNumber(){
        Account account = new Account();
        account.getAccountNumber(1);
    }
    @Test
    public void testToDepositMoney_AccountBalanceIncreased(){
        Account account = new Account();
        assertEquals(0, account.checkBalance("0147"));
        account.deposit(5_000);
        assertEquals(5_000, account.checkBalance("0147"));
    }
    @Test
    public void testNotToDepositANegativeAmount(){
        Account account = new Account();
        assertEquals(0, account.checkBalance("0147"));
        assertThrows(AmountMustBeGreaterThanZero.class, ()-> account.deposit(-5_000));
        assertEquals(0, account.checkBalance("0147"));
    }
    @Test
    public void testToWithdrawMoney_AccountBalanceDecreased(){
        Account account = new Account();
        assertEquals(0, account.checkBalance("0147"));
        account.deposit(7_000);
        assertEquals(7_000, account.checkBalance("0147"));
        account.withdraw(4_000, "0147");
        assertEquals(3_000, account.checkBalance("0147"));
    }
    @Test
    public void testNotToWithdrawMoreThanAccountBalance() {
        Account account = new Account();
        account.setPin("0147");
        assertEquals(0, account.checkBalance("0147"));
        account.deposit(7_000);
        assertEquals(7_000, account.checkBalance("0147"));
        assertThrows(AccountBalanceIsTooLowException.class, ()-> account.withdraw(20_000, "0147"));
        assertEquals(7_000, account.checkBalance("0147"));


    }
}
