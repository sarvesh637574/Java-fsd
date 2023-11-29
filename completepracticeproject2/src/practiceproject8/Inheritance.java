package practiceproject8;
//Parent class (superclass)
	class Vehicle {
	    String brand;
	    int year;

	    Vehicle(String brand, int year) {
	        this.brand = brand;
	        this.year = year;
	    }
	    void start() {
	        System.out.println("Starting the vehicle.");
	    }
	    void stop() {
	        System.out.println("Stopping the vehicle.");
	    }
	}
	// Child class (subclass) that inherits from Vehicle
	class Car extends Vehicle {
	    int numDoors;
	    Car(String brand, int year, int numDoors) {
	        super(brand, year);
	        this.numDoors = numDoors;
	    }
	    void honk() {
	        System.out.println("Honking the car horn.");
	    }
	}


public class Inheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car myCar = new Car("Toyota", 2020, 4);
        // Accessing properties and methods from the parent class
        System.out.println("Car Brand: " + myCar.brand);
        System.out.println("Car Year: " + myCar.year);
        myCar.start();
        myCar.stop();
        // Accessing properties and methods specific to the child class
        System.out.println("Number of Doors: " + myCar.numDoors);
        myCar.honk();

	}

}
