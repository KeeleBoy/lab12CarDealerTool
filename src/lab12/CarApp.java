package lab12;

import java.util.Scanner;

//car application class
public class CarApp {

	// main
	public static void main(String[] args) {

		// importing scanner
		Scanner scnr = new Scanner(System.in);

		// basic question
		System.out.println("Welcome to the car tool!");
		System.out.println("How many cars are you going to be adding today?: ");

		// get an integer for how many things they want to add
		int choiceSize = scnr.nextInt();
		scnr.nextLine();

		// create an array the size depends on their choice
		Car[] carList = new Car[choiceSize];
		// ArrayList<Car> carList = new ArrayList<>()

		// for loop is a counting loop adding as many entries as they decide
		for (int i = 0; i < carList.length; i++) {

			// taking the users choices
			System.out.println("Please enter car " + (i + 1) + "'s make: ");
			String make = scnr.nextLine();

			System.out.println("Please enter car " + (i + 1) + "'s model: ");
			String model = scnr.nextLine();

			System.out.println("Please enter car " + (i + 1) + "'s year: ");
			int year = scnr.nextInt();

			System.out.println("Please enter car " + (i + 1) + "'s price: ");
			double price = scnr.nextDouble();

			// attempt to add their decisions to the array
			Car newCar = new Car(make, model, year, price);
			carList[i] = newCar;
			scnr.nextLine();

		}
		// print out their list and say goodbye
		// System.out.println(carList);
		// above doesn't work you can't print an array

		// have to loop through array and print each
		// for (int i = 0; i < carList.length; i++)
		// System.out.println(carList[i]);

		// enhanced for loop attempt
		for (Car c : carList) {
			// System.out.println("Make: " + c.make + " Model: " + c.model + " Year: " +
			// c.year + " Price: " + c.price);
			// previous version

			// updated version
			System.out.printf("Make: %10s Model: %10s Year: %10d Price: %10.2f", c.make, c.model, c.year, c.price);
			System.out.println();
		}

		// goodbye message
		System.out.println("Goodbye!");

	}

}
