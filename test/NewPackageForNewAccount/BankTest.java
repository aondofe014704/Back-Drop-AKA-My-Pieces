package NewPackageForNewAccount;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class BankTest {
    @Test
    public void testThatGtBankHaveBeenInitilized(){
        Bank gtBank = new Bank();
        assertNotNull(gtBank);
    }
    @Test
    public void testThatBankHasZeroNumberOfCustomers(){
        Bank gtBank = new Bank();
        assertEquals(0, gtBank.getNumberOfCustomers());
    }
    @Test
    public void testThatWeCanAddCustomerToTheBank(){
        Bank gtBank = new Bank();
        gtBank.addCustomer("Jack Songu", "0147", "08133608698");
        assertEquals(1, gtBank.getNumberOfCustomers());
    }
    @Test
    public void testThatAccountBalanceIsZero(){
        Bank gtBank = new Bank();
        gtBank.addCustomer("Jack Songu", "0147", "08133608698");
        assertEquals(0.0, gtBank.checkBalance(8133608698L, "0147"));

    }
    @Test
    public void testToDeposit(){
        Bank gtBank = new Bank();
        gtBank.addCustomer("Jack Songu", "0147", "08133608698");
        gtBank.deposit(1000.0, 8133608698L);
        assertEquals(1000.0, gtBank.checkBalance(8133608698L, "0147"));
    }
    @Test
    public void testToWithdraw(){
        Bank gtBank = new Bank();
        gtBank.addCustomer("Jack Songu", "0147", "08133608698");
        gtBank.deposit(2000.0, 8133608698L);
        gtBank.withdraw(1000.0, 8133608698L, "0147");
        assertEquals(1000.0, gtBank.checkBalance(8133608698L, "0147"));
    }
    @Test
    public void testToTransfer(){
        Bank gtBank = new Bank();
        gtBank.addCustomer("Jack Songu", "0147", "08133608698");
        gtBank.addCustomer("James Brown","0147", "08133608699");
        gtBank.deposit(5000.0, 8133608698L);
        gtBank.transfer(3000.0, 8133608698L,8133608699L , "0147");
        assertEquals(2000.0, gtBank.checkBalance(8133608698L, "0147"));
        assertEquals(3000.0, gtBank.checkBalance(8133608699L, "0148"));
        assertEquals(2, gtBank.getNumberOfCustomers());
    }
}
