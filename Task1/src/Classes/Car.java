package Classes;

public class Car {

    String name;
    String color;
    long cost;
    void carDetails(){
        System.out.println(name);
        System.out.println(color);
        System.out.println(cost);
    }

    public static void main(String[] args){

        Customer customer1 = new Customer();
        customer1.customerid = 223;
        customer1.customerName = "Katru Satyanarayana";
        customer1.mobile = 8179795623L;

        Car car1 = new Car();
        car1.name = "BMW";
        car1.color = "orange";
        car1.cost = 1000000;
        car1.carDetails();


        System.out.println(customer1.customerid);
        System.out.println(customer1.customerName);
        System.out.println(customer1.mobile);
    }

}
