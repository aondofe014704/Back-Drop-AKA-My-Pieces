import Assignments.AccountAccount;
import exception.AmountCannotBeLessThanZeroException;
import exception.InsufficientBalanceException;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class AccountAccountTest {
    @Test
    public void testThatAccountCanBeCreated_BalanceIsZeroOnCreation(){
        AccountAccount account = new AccountAccount();
        assertEquals(0, account.checkBalance());
    }
    @Test
    public void testToDeposit_BalanceIncreases(){
        AccountAccount account = new AccountAccount();
        account.deposit(4_000);
        assertEquals(4_000, account.checkBalance());
   }
   @Test
    public void testThatNegativeAmountCannotBeDeposited(){
        AccountAccount account = new AccountAccount();
        assertThrows(AmountCannotBeLessThanZeroException.class, ()->account.deposit(-4_000));
   }
   @Test
    public void testToWithdraw_BalanceDecreases() throws InsufficientBalanceException {
        AccountAccount account = new AccountAccount();
        account.deposit(10_000);
        account.withdraw(3000);
        assertEquals(7_000, account.checkBalance());
   }
   @Test
    public void testThatWithdrawalAmountCannotBeAboveAccountBalance(){
        AccountAccount account = new AccountAccount();
        account.deposit(10_000);
        assertEquals(10_000, account.checkBalance());
        assertThrows(InsufficientBalanceException.class, ()->account.withdraw(3000000));
   }
}
