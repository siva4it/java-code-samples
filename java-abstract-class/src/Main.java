public class Main {
    public static void main(String[] args) {
        //'Base' is abstract; cannot be instantiated
        //Base b = new Base();

        Base b = new Derived();
        b.fun();

        System.out.println("-----------------------------------------------------");

        Derived d = new Derived();
        d.fun();

        System.out.println("-----------------------------------------------------");

        Derived2 d2 = new Derived2();
        d2.fun2();

        System.out.println("-----------------------------------------------------");

        Base2 b2 = new Derived2();
        b2.fun2();
        b2.fun3();
        Base2.fun4();

        System.out.println("-----------------------------------------------------");
    }
}
