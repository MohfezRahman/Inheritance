/* Class:Truck
 * *@author Mohfez Rahman * 
 * @version 1.0 
 * * Course: ITEC 2150 Spring 2020 
 * * Written: Feb 5, 2020 * 
 * * This class – now describe what the class
 * does: This program has attributes of Truck class, by using the 
 * parent class Vehicle's attributes and Truck's attributes then 
 * display the output by using toString to the main class.
 */
public class Truck extends Vehicle {

	//Attributes of Truck
	private int numberOfDoors;
	private String cargoCapacity;

	// Constructor with parameters
	public Truck(double horsepower, int numberOfWheels, int numberOfDoor, String cargoCapacity) {
		super(horsepower, numberOfWheels);
		this.cargoCapacity = cargoCapacity;
		this.numberOfDoors = numberOfDoor;

	}

	/**
	 * Getter method for numberOfDoors
	 * 
	 * @return the numberOfDoors
	 */
	public int getNumberOfDoors() {
		return numberOfDoors;
	}

	/**
	 * Setter method for numberOfDoors
	 * 
	 * @param numberOfDoors the numberOfDoors to set
	 */
	public void setNumberOfDoors(int numberOfDoors) {
		this.numberOfDoors = numberOfDoors;
	}

	/**
	 * Getter method for cargoCapacity
	 * 
	 * @return the cargoCapacity
	 */
	public String getCargoCapacity() {
		return cargoCapacity;
	}

	/**
	 * Setter method for cargoCapacity
	 * 
	 * @param cargoCapacity the cargoCapacity to set
	 */
	public void setCargoCapacity(String cargoCapacity) {
		this.cargoCapacity = cargoCapacity;
	}

	@Override
	// toString method created 
	public String toString() {
		return "Truck Number Of Doors = " + numberOfDoors + ", Cargo Capacity = " + cargoCapacity + ", Horsepower = "
				+ getHorsepower() + ", Number Of Wheels = " + getNumberOfWheels();
	}

}
