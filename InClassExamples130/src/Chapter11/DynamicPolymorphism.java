package Chapter11;

public class DynamicPolymorphism{

    public void move(){
        System.out.println("Vehicles can move!!");
    }

}

class MotorBike extends DynamicPolymorphism{

    @Override
    public void move(){
        System.out.println("MotorBike can move and accelerate too!!");
    }

}

class TestClass{

    public static void main(String[] args){

    DynamicPolymorphism vehicle = new MotorBike(); // Show this (NEW) 

    vehicle.move();    // prints MotorBike can move and accelerate too!!

    vehicle = new DynamicPolymorphism();

    vehicle.move();    // prints Vehicles can move!!
    
    //any superclass can be assigned to any of its sub classes! 

    }

}
