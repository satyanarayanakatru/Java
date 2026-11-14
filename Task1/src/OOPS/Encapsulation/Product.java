package OOPS.Encapsulation;

public class Product {
    private String productName;
    private int price;

    public void setProduct(String name, int pri){
        this.productName = name;

        if (pri > 0){
            this.price = pri;
        } else {
            System.out.println("price is invalid");
        }
    }

    public void getProducts(){
        System.out.println(productName);
        System.out.println(price);

    }
}
