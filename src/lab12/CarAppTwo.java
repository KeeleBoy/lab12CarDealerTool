package lab12;

import java.util.Scanner;

public class CarAppTwo {

	public static void main(String[] args) {

		Car Chevy1 = new UsedCar("1 Chevy", "Colbalt", 1999, 2000, 50000);
		Car Chevy2 = new UsedCar("2 Chevy", "Bolt", 2002, 2500, 50000);
		Car Chevy3 = new UsedCar("3 Chevy", "Malibu", 2004, 3000, 50000);
		Car Chevy4 = new Car("4 Chevy", "Impala", 1999, 5000);
		Car Chevy5 = new Car("5 Chevy", "Camaro", 2006, 10000);
		Car Chevy6 = new Car("6 Chevy", "Corvette", 2009, 20000);
		Car Empty = new Car();

		Car[] carList = new Car[6];
		carList[0] = Chevy1;
		carList[1] = Chevy2;
		carList[2] = Chevy3;
		carList[3] = Chevy4;
		carList[4] = Chevy5;
		carList[5] = Chevy6;

		for (Car car : carList) {
			if (car.getClass().equals(Car.class)) {
				System.out.printf("Make: %-10s Model: %-10s Year: %-10d Price: %-10.2f", car.make, car.model, car.year,
						car.price);
				System.out.println();
			} else if (car.getClass().equals(UsedCar.class)) {
				UsedCar newCar = (UsedCar) car;
				System.out.printf("Make: %-10s Model: %-10s Year: %-10d Price: %-10.2f Miles: %-10.2f", newCar.make,
						newCar.model, newCar.year, newCar.price, newCar.Miles);
				System.out.println();
			}
		}

		System.out.println("Which car would you like(1-6): ");
		Scanner scnr = new Scanner(System.in);
		String CarChoice = scnr.nextLine();

		if (CarChoice.equals("1")) {
			carList[0] = Empty;

		} else if (CarChoice.equals("2")) {
			carList[1] = Empty;

		} else if (CarChoice.equals("3")) {
			carList[2] = Empty;

		} else if (CarChoice.equals("4")) {
			carList[3] = Empty;

		} else if (CarChoice.equals("5")) {
			carList[4] = Empty;

		} else if (CarChoice.equals("6")) {
			carList[5] = Empty;

		} else {
			System.out.println("Did not compute...");
		}
		for (Car car : carList) {
			if (car.getClass().equals(Car.class)) {
				System.out.printf("Make: %-10s Model: %-10s Year: %-10d Price: %-10.2f", car.make, car.model, car.year,
						car.price);
				System.out.println();
			} else if (car.getClass().equals(UsedCar.class)) {
				UsedCar newCar = (UsedCar) car;
				System.out.printf("Make: %-10s Model: %-10s Year: %-10d Price: %-10.2f Miles: %-10.2f", newCar.make,
						newCar.model, newCar.year, newCar.price, newCar.Miles);
				System.out.println();
			}
		}

	}

}

//I know it not perfect but its getting late
//and i'm happy with what I have so far
