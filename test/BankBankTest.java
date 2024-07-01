import Assignments.AccountAccount;
import Assignments.BankBank;
import exception.InsufficientBalanceException;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class BankBankTest{
    @Test
    public void testThatBankExists(){
        BankBank bank = new BankBank();
        assertNotNull(bank);
    }
    @Test
    public void testToAddCustomerInTheBank(){
        BankBank bank = new BankBank();
        bank.addCustomer("Mary", "Clark");
        assertEquals(1, bank.getNumberOFCustomers());
    }
    @Test
    public void testToAddAnotherCustomer_ListIncreasesd(){
        BankBank bank = new BankBank();
        bank.addCustomer("Mary", "Clark");
        bank.addCustomer("Maryson", "Clarkson");
        assertEquals(2, bank.getNumberOFCustomers());
    }
    @Test
    public void testToDepositMoneyFromTheBank(){
        BankBank bank = new BankBank();
        AccountAccount createdAccount = bank.addCustomer("Jack", "Jackson");
        bank.deposit(12_000, createdAccount.getAccountNumber());
    }
    @Test
    public void testToWithdraw_BalanceDecreased(){
        BankBank bank = new BankBank();
        AccountAccount createdAccount = bank.addCustomer("James", "Robinson");
        assertEquals(3000, createdAccount.getAccountNumber());
    }

//    @Test
//    public void testThatAmountToBeDepositedMustBeAboveZero(){
//        BankBank bank = new BankBank();
//        AccountAccount createdAccount = bank.addCustomer("Olive", "Olive");
//        assertThrows(InsufficientBalanceException.class, ()-> bank.deposit(-5_000, createdAccount.getAccountNumber()));
//
//
//    }

}
