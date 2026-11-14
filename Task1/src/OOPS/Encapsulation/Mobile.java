package OOPS.Encapsulation;

public class Mobile {

    private String brand;
    private int price;


   public void setMobile(String brand, int price){
        this.brand = brand;
        this.price = price;
    }

    public void getMobile(){
       System.out.println("Brand is :" + brand);
       System.out.println("Price is :" + price);
    }
}
