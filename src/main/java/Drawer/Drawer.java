package Drawer;

import Product.Product;
import Drawer.ProductCodeType;
import java.util.ArrayList;

public class Drawer {
  private ProductCodeType productCodeType;
  private ArrayList<Product>products;


    public Drawer(ProductCodeType productCodeType ) {
        this.productCodeType = productCodeType;
        this.products = new ArrayList<Product>();
    }

  public ProductCodeType getProductCodeType() {
       return productCodeType;
   }

    public String getProductCode() {
        return this.productCodeType.getProductCode();
    }

    public double getProductPrice(){
        return this.productCodeType.getProductPrice();
    }
    public void setProductCodeType(ProductCodeType productCodeType) {
        this.productCodeType = productCodeType;
    }
    public void addProduct(Product product){
        this.products.add(product);

    }
    public int countProduct(){
        return this.products.size();

    }
    public Product returnProduct() {
        if (this.products.size() > 0) {

            return this.products.remove(0);
        }
          return null;

    }


}


