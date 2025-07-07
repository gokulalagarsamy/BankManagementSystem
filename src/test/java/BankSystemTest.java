import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class BankSystemTest {
    @Test
    public void testBankSystemRuns() {
        BankSystem system = new BankSystem();
        assertDoesNotThrow(system::run);
    }
}
