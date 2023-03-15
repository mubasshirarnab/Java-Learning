package PracticeForCT1;
import Movies.Titanic;

/* Write a Java program to create a class named ArrayExample, in this class
        declare an array named myArray of Car type. Now initialize the myAarray
        and call the display method for each index of myArray in the main method.
        In the Car class there are two class variables: carName and carModel,
        constructor (initialized the variables), and display method ( display the value
        of carName and carModel).*/
public class Car {
    public String carName;
    private String carModel;

    Car(String carName, String carModel){
        this.carName = carName;
        this.carModel = carModel;
    }

    public String getCarModel(){
        return carModel;
    }

    public void setCarModel(String carModel){
        this.carModel = carModel;
    }

    void display(){
        System.out.println("Car Name: " + carName + "    Model: " + carModel);
        System.out.println();
    }
}

class ArrayExample{
    public static void main(String[] args) {
        Car[] myArray = new Car[3];

        myArray[0] = new Car("BMW", "Road Track 509");
        myArray[1] = new Car("Toyota", "X corola 2012");
        myArray[2] = new Car("Tesla", "M 2022");


        for (int i = 0; i < myArray.length; i++){
            myArray[i].display();
        }
    }
}
