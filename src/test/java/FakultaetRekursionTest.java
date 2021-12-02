import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FakultaetRekursionTest {
    @Test
    public void testFakultaetRekursion1(){
        assertEquals(FakultaetRekursion.fakultaet(0), 1);
    }
    @Test
    public void testFakultaetRekursion2(){
        assertEquals(FakultaetRekursion.fakultaet(1), 1);
    }
    @Test
    public void testFakultaetRekursion3(){
        assertEquals(FakultaetRekursion.fakultaet(2), 2);
    }
    @Test
    public void testFakultaetRekursion4(){
        assertEquals(FakultaetRekursion.fakultaet(3), 6);
    }
    @Test
    public void testFakultaetRekursion5(){
        assertEquals(FakultaetRekursion.fakultaet(4), 24);
    }

}