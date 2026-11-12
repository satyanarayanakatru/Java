package Constructors;

public class Overload {

    String name;
    long mobile;
    String role;

    Overload(){
        System.out.println("No parameters");
    }

    Overload(String fullname){
        name = fullname;
        System.out.println(name);
    }

    Overload(long  mobileNum){
        mobile = mobileNum;
    }

    Overload(String roles, String fullName){
        role = roles;
        name  =fullName;
    }

    public static void main(String[] args) {
        Overload overload1 = new Overload();
        Overload overload2 = new Overload("nani");
        Overload overload3 = new Overload(8179795623L);
        Overload overload4 = new Overload("Developer", "Katru");

        System.out.println(overload2.name);
        System.out.println(overload4.role);

    }
}
