package Raphael.Mulenda;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Wall wall1 = new Wall("West");
        Wall wall2 = new Wall("East");
        Wall wall3 = new Wall("South");
        Wall wall4 = new Wall("North");

        Ceiling ceiling = new Ceiling(12,55);
        Bed bed = new Bed("Modern",4,3,2,1);

        Lamp lamp = new Lamp("Classic", false,74);

        Bedroom bedroom = new Bedroom("John Doe Room",wall1,wall2,wall3,wall4,ceiling,bed,lamp);

        bedroom.MakeBed();
        bedroom.getLamp().turnOn();
    }
}
