package Spring2022;

public class Vehicle {
        Vehicle(String name){
            System.out.println("Vehicle is created.");
        }
    }
    class Bike extends Vehicle{
        Bike(){
            super("Truck");
            System.out.println("Bike is created.");
        }
        public static void main(String[] args){
            Bike b = new Bike();
        }
    }

