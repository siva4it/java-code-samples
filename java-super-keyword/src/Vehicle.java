public class Vehicle {
    int maxSpeed = 100;
    int maxSeats = 8;

    void getSpeed(){
        System.out.println("Vehicle Class Method Executed..!");
    }

    Vehicle(){
        System.out.println("Use case 1 - Accessing Constructor via Super");
        System.out.println("Vehicle Class Constructor Executed..!");
    }
}
