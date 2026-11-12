package Constructors;

public class Car {
    String brand;
    int model;
    int price;

    Car(String brandName, int modelName, int prices){
        brand = brandName;
        model = modelName;
        price = prices;

    }

    public static void main(String[] args) {
        Car car1 = new Car("BMW", 2022, 100000);
        Car car2 = new Car("Range Rover", 2026, 200000);

        System.out.print(car1.brand);
        System.out.print(car1.model);
        System.out.println(car1.price);
        System.out.print(car2.brand);
        System.out.print(car2.model);
        System.out.println(car2.price);
    }
}
