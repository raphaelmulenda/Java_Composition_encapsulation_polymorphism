package Raphael.Mulenda;

public class Car {
    private boolean engine;
    private int cylinders;
    private String name;
    private int wheels;


    public Car(int cylinder, String name) {
        this.engine = true;
        this.cylinders = cylinder;
        this.name = name;
        this.wheels = 4;
    }

    public int getCylinders() {
        return cylinders;
    }

    public String getName() {
        return name;
    }

    public String startEngine(){
        return "Car -> StartEngine()";
    }

    public String accelerate(){
        return "Car -> accelerate()";

    }

    public String brake (){
        return "Car -> brake().";
    }
}
