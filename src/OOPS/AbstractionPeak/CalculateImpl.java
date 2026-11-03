package OOPS.AbstractionPeak;

import java.util.HashSet;
import java.util.Set;

public class CalculateImpl   {
    static void main(String[] args) {
        Product productDettolObjRef=new Product(1,5);
        Product productSantoorObjRef2=new Product(2,2);

        Set  productSet=new HashSet ();
//        productSet.get
        productSet.add(null);
        productSet.add(productDettolObjRef);
        productSet.add(1);
        productSet.add(2);
        productSet.add(3);
        productSet.add(4);
        productSet.add(productSantoorObjRef2);
        productSet.add(5);
    }
}
class Product{
    private int productId;

    @Override
    public String toString() {
        return "Product{" +
                "productId=" + productId +
                ", quantity=" + quantity +
                '}';
    }

    private int quantity;
    public Product(int productId, int quantity) {
        this.productId = productId;
        this.quantity = quantity;
    }

    @Override
    public int hashCode() {
        return this.productId;
    }
}
