package Classes;

public class Product {
    String name;
    long price;
    int quantity;
    void totalPrice(){
        double total = price * quantity;
        System.out.println("Total price of the " + name + " is : " + total);
    }

    public static void main(String[] args){
        Product product1 = new Product();

        product1.name = "perfume";
        product1.price = 5665L;
        product1.quantity = 2;
        product1.totalPrice();
    }
}
