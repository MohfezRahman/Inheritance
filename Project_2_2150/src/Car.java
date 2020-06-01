/* Class:Car
 * *@author Mohfez Rahman * 
 * @version 1.0 
 * * Course: ITEC 2150 Spring 2020 
 * * Written: Feb 5, 2020 * 
 * * This class – now describe what the class
 * does: This program is This program has attributes of Car class, by using the 
 * parent class Vehicle's attributes and Car's attributes then 
 * display the output by using toString to the main class.
 */
public class Car extends Vehicle {

	// Attributes of Car
	private int numberOfDoors;
	private String color;

	// Constructor with parameters
	public Car(double horsepower, int numberOfWheels, String color, int numberOFDoor) {
		super(horsepower, numberOfWheels);
		this.color = color;
		this.numberOfDoors = numberOFDoor;
	}

	/**
	 * Getter method for color
	 * 
	 * @return the color
	 */
	public String getColor() {
		return color;
	}

	/**
	 * Setter method for color
	 * 
	 * @param color the color to set
	 */
	public void setColor(String color) {
		this.color = color;
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

	@Override
	/* toString method created */

	public String toString() {
		return "Number Of Doors = " + numberOfDoors + ", Car color = " + color + ",  Horsepower = " + getHorsepower()
		+ ", Number Of Wheels = " + getNumberOfWheels();
	}

}
