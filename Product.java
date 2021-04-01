package za.ac.cput.adp2assignment1;

/**
 * 1 April 2021
 * 217059376
 * Shasta Abrahams 
 */
public class Product {
    private String product1, product2, product3;

    public String getProduct1() {
        return product1;
    }

    public void setProduct1(String product1) {
        this.product1 = product1;
    }

    public String getProduct2() {
        return product2;
    }

    public void setProduct2(String product2) {
        this.product2 = product2;
    }

    public String getProduct3() {
        return product3;
    }

    public void setProduct3(String product3) {
        this.product3 = product3;
    }

    @Override
    public String toString() {
        return "Product{" + "product1=" + product1 + ", product2=" + product2 + ", product3=" + product3 + '}';
    }
    
    
    
}