package Constructors;

public class Product {

    String name;
    int price;

    Product(){
        System.out.println("this is first constructor");
    }

    Product(String productName){
        this.name = productName;
        System.out.println("this is second constructor");

    }

    Product (int productPrice){
        this.price = productPrice;
        System.out.println("this is third constructor");
    }

    public static void main(String[] args) {
        Product product = new Product();
        Product product1 = new Product("perfume");
        Product product2 = new Product(240);

        System.out.println("The product name is : " + product1.name);
        System.out.println("The product price is : " + product2.price);
    }
}
