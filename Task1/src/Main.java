import OOPS.Encapsulation.*;

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student();
        student1.setDetails("Nani", 34);
        student1.getDetails();

        Employee employee1 = new Employee();
        employee1.setEmployeeDetails("Satya", 30000);
        employee1.getEmployeeDetails();

        Person person1 = new Person();
        person1.setAge(26);
        person1.getAge();


        BankAccount bankAccount1 =
                new BankAccount(3443425L, 100);
        bankAccount1.deposit(20);
        bankAccount1.withdraw(30);


        Product product1 = new Product();
        product1.setProduct("perfume", 344);
        product1.getProducts();

        Mobile mobile = new Mobile();
        mobile.setMobile("Redmi", 23000);
        mobile.getMobile();

        Rectangle rectangle = new Rectangle();
        rectangle.setData(20,20);
        rectangle.calculateArea();
    }
}