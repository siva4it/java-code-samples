//Derived class with abstract method overridden
public class Derived extends Base {

    Derived() {
        System.out.println("Derived Constructor Executed..!");
    }

    @Override
    void fun() {
        System.out.println("Derived fun() Executed..!");
    }

}
