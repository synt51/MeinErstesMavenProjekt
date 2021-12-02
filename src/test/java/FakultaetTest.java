import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FakultaetTest {
    @Test
    public void testFakultaet1(){
        assertEquals(Fakultaet.fakultaet(0), 1);
    }
    @Test
    public void testFakultaet2(){
        assertEquals(Fakultaet.fakultaet(1), 1);
    }
    @Test
    public void testFakultaet3(){
        assertEquals(Fakultaet.fakultaet(2), 2);
    }
    @Test
    public void testFakultaet4(){
        assertEquals(Fakultaet.fakultaet(3), 6);
    }
    @Test
    public void testFakultaet5(){
        assertEquals(Fakultaet.fakultaet(4), 24);
    }

}