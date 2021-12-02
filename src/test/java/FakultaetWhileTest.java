import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FakultaetWhileTest {
    @Test
    public void testFakultaetWhile1(){
        assertEquals(FakultaetWhile.fakultaet(0), 1);
    }
    @Test
    public void testFakultaetWhile2(){
        assertEquals(FakultaetWhile.fakultaet(1), 1);
    }
    @Test
    public void testFakultaetWhile3(){
        assertEquals(FakultaetWhile.fakultaet(2), 2);
    }
    @Test
    public void testFakultaetWhile4(){
        assertEquals(FakultaetWhile.fakultaet(3), 6);
    }
    @Test
    public void testFakultaetWhile5(){
        assertEquals(FakultaetWhile.fakultaet(4), 24);
    }

}