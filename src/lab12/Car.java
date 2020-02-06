package lab12;

/*
 * @Author Kyle Warchuck
 */

//car class
public class Car {

	// data members
	protected String make = "";
	protected String model = "";
	protected int year = 0;
	protected double price = 0.0;

	// no argument constructor
	public Car() {

	}

	// constructor
	// if you make this first you have to
	// manually make the no argument constructor
	public Car(String make, String model, int year, double price) {
		this.make = make;
		this.model = model;
		this.year = year;
		this.price = price;

	}

	// to string
	@Override
	public String toString() {
		return "Car [make=" + make + ", model=" + model + ", year=" + year + ", price=" + price + "]";
	}

	// getters and setters below
	public String getMake() {
		return make;
	}

	public void setMake(String make) {
		this.make = make;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

}
