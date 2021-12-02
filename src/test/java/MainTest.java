import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {
    @Test
    public void testAddition() {
        assertEquals(201, Main.addition(100, 101));
        assertTrue(Main.addition(100, 101) > 100);
        assertTrue(Main.addition(100, 101) <= 201);
    }
}