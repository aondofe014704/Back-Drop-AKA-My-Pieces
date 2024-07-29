package NewPackageForNewAccount;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotNull;

public class TimeTest {
    @Test
    public void testToCreateTime(){
        Time time = new Time();
        assertNotNull(time);
    }

}
