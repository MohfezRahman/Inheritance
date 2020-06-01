import java.util.ArrayList;

/* Class:DisplayVehicle
 * *@author Mohfez Rahman * 
 * @version 1.0 
 * * Course: ITEC 2150 Spring 2020 
 * * Written: Feb 5 2020 * 
 * * This class – now describe what the class
 * does: This program is going to display the classes of Car and 
 * Truck by using ArrayLists;
 */
public class DisplayVehicle {

	/*
	 * Main method
	 * 
	 * @param args
	 * 
	 */
	public static void main(String[] args) {

		// Four Car objects
		Car car1 = new Car(225, 4, "silver", 4);
		Car car2 = new Car(260, 4, "brown", 4);
		Car car3 = new Car(205, 4, "black", 4);
		Car car4 = new Car(204, 4, "white", 4);

		// Four Truck objects
		Truck truck1 = new Truck(380, 4, 2, "62.3 cubic feet");
		Truck truck2 = new Truck(429, 4, 2, "60.0 cubic feet");
		Truck truck3 = new Truck(440, 4, 4, "40.0 cubic feet");
		Truck truck4 = new Truck(350, 4, 4, "30.0 cubic feet");

		// ArrayList created for vehicles
		ArrayList<Vehicle> vehicles = new ArrayList<Vehicle>();
		vehicles.add(car1);
		vehicles.add(car2);
		vehicles.add(car3);
		vehicles.add(car4);

		vehicles.add(truck1);
		vehicles.add(truck2);
		vehicles.add(truck3);
		vehicles.add(truck4);

		// for loop
		for (int i = 0; i < vehicles.size(); i++) {

			// output for the vehicles by using toSting method
			System.out.println(vehicles.get(i).toString());

		}

	}

}
