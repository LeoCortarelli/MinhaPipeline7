package exemplos;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class RetTest {
    @Test
    public void testSum() {
    	Ret calculator = new Ret();
        assertEquals(5, calculator.sum(2, 3));
    }
}
