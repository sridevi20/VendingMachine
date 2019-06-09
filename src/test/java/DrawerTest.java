import Drawer.Drawer;
import Drawer.ProductCodeType;
import Product.Product;
import Product.Crisps;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class DrawerTest {

    Drawer drawer;
    private ProductCodeType productCodeType;
    private Crisps product;

    @Before
    public void setUp() {
        drawer = new Drawer(ProductCodeType.COLA);
        product = new Crisps("Crisps","Walkers");

    }
    @Test
    public void getProductCode(){
        assertEquals("C1",drawer.getProductCode());
    }
    @Test
    public void getProductPrice(){
        assertEquals(0.60, drawer.getProductPrice(),0.00);
   }
   @Test
    public void canAddProductToDrawer(){

       drawer.addProduct(product);
        assertEquals(1, drawer.countProduct());
   }
   @Test
    public void canReturnProductToDrawer(){
        drawer.addProduct(product);
//       drawer.returnProduct();
       assertEquals(product,drawer.returnProduct());
//       assertEquals(0, drawer.countProduct());
   }


}

