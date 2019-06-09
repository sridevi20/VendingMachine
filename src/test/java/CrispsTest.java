import Product.Crisps;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CrispsTest {
    private Crisps crisps;

    @Before
    public void setUp() {
        crisps = new Crisps("Crisps", "Walkers");
    }
        @Test
        public void hasName(){
            assertEquals("Crisps", crisps.getName());
        }
        @Test
    public void setName(){
        crisps.setName("Nachoes");
        assertEquals("Nachoes",crisps.getName());
        }
        @Test
    public void hasBrand(){
        assertEquals("Walkers",crisps.getBrand());
        }
        @Test
    public void setBrand(){
        crisps.setBrand("Doritos");
        assertEquals("Doritos",crisps.getBrand());
        }



}
