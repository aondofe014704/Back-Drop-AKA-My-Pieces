package NewPackageForNewAccount;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class AccountTest {
    @Test
    public void testThatWeHaveAnAccount(){
        Account firstBank = new Account();
        assertNotNull(firstBank);
    }
    @Test
    public void testThatAccountIsCreatedWithZeroBalance(){
        Account firstBank = new Account();
        assertEquals(0, firstBank.checkBalance("014704"));
    }
    @Test
    public void testThatWeCanDepositMoney_BalanceIncreases(){
        Account firstBank = new Account();
        assertEquals(0, firstBank.checkBalance("014704"));
        firstBank.deposit(7_000);
        assertEquals(7_000, firstBank.checkBalance("014704"));
    }
    @Test
    public void testThatDepositAmountCannotBeNegative(){
        Account firstBank = new Account();
        assertEquals(0, firstBank.checkBalance("014704"));
        assertThrows(AmountMustBeGreaterZeroException.class, ()-> firstBank.deposit(-500));
        assertEquals(0, firstBank.checkBalance("014704"));
    }
    @Test
    public void testToWithdraw_BalanceDecreases(){
        Account firstBank = new Account();
        assertEquals(0, firstBank.checkBalance("014704"));
        firstBank.deposit(10_000);
        assertEquals(10_000, firstBank.checkBalance("014704"));
        firstBank.withdraw(3000, "014704");
        assertEquals(7_000, firstBank.checkBalance("014704"));
    }
    @Test
    public void testNotToWithdrawMoreThanAccountBalance(){
        Account firstBank = new Account();
        assertEquals(0,firstBank.checkBalance("014704"));
        firstBank.deposit(5_000);
        assertEquals(5_000, firstBank.checkBalance("0147"));
        assertThrows(InsufficientBalanceException.class, ()-> firstBank.withdraw(7_0000, "014704"));
        assertEquals(5_000, firstBank.checkBalance("014704 "));
    }


}
