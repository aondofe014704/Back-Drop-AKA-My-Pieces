package testedCodes;

import Assignments.Account;
import exception.InvalidAmountException;
import exception.NewInsufficientBalanceException;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class AccountTest {
    @Test
    public void testToCreateAccount(){
        Account account = new Account("firstName", "lastName", "pin");
    }
    @Test
    public void testToDepositMoneyInTheAccountOnCreationBalanceIsZero(){
        Account account = new Account("firstName", "lastName", "pin");
        assertEquals(0, account.checkBalance());
        account.deposit(5_000);
        assertEquals(5_000, account.checkBalance());
    }
    @Test
    public void testToDepositTwiceBalanceIncreased(){
        Account account = new Account("firstName", "lastName", "pin");
        account.deposit(5_000);
        assertEquals(5_000, account.checkBalance());
        account.deposit(2_000);
        assertEquals(7_000, account.checkBalance());
    }
    @Test
    public void testNotToDepositNegativeAmount(){
        Account account = new Account("firstName", "lastName", "pin");
        account.deposit(500);
        assertEquals(500, account.checkBalance());
        assertThrows(NewInsufficientBalanceException.class, () -> account.deposit(-300));
    }
    @Test
        public void testToWithdrawMoneyBalanceDecreased(){
        Account account = new Account("firstName", "lastName", "pin");
        account.deposit(10000);
        assertEquals(10000, account.checkBalance());
        account.withdraw(3_000);
        assertEquals(7_000, account.checkBalance());
    }
    @Test
    public void testThatYouCannotWithdrawNegativeAmount(){
        Account account = new Account("firstName", "lastName", "pin");
        account.deposit(2000);
        assertEquals(2000, account.checkBalance());
        assertThrows(InvalidAmountException.class, ()-> account.withdraw(-1000));
        assertEquals(2000, account.checkBalance());
        account.withdraw(2000);
        assertEquals(0, account.checkBalance());
    }
    @Test
    public void testThatToWithdrawTwiceBalanceDecrease(){
        Account account = new Account("James", "Brown", "password");
        account.deposit(10000);
        assertEquals(10000, account.checkBalance());
        account.withdraw(3000);
        assertEquals(7000, account.checkBalance());
        account.withdraw(2000);
        assertEquals(5000, account.checkBalance());
    }
    @Test
    public void testThatToTransferFromOneAnotherToAnother(){
        Account account = new Account("firstName", "lastName", "pin");
        account.deposit(4_000);
        assertEquals(4_000, account.checkBalance());
        account.withdraw(3000);
        assertEquals(3000, account.checkBalance());
    }
}
