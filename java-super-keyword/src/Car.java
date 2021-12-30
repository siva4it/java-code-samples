public class Car extends Vehicle{
    int maxSpeed = 110;

    void getSpeed (){
        System.out.println("Car Class Method Executed..!");
    }

    void display(){
        System.out.println("Use case 2 - Accessing variables via Super");
        System.out.println("Max Speed - Car = " + maxSpeed);
        System.out.println("Max Speed - Vehicle = " + super.maxSpeed);

        System.out.println();

        System.out.println("Use case 3 - Accessing Method via Super");
        getSpeed();
        super.getSpeed();
    }

    Car(){
        super();
        System.out.println("Car Class Constructor Executed..!");
        System.out.println();
    }
}
