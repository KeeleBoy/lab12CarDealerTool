package lab12;

public class UsedCar extends Car {

	protected double Miles = 0;

	public UsedCar(String make, String model, int year, double price, double Miles) {
		this.make = make;
		this.model = model;
		this.year = year;
		this.price = price;
		this.Miles = Miles;

	}

	public UsedCar(double miles) {
		super();
		Miles = miles;
	}

	@Override
	public String toString() {
		return "UsedCar [Miles=" + Miles + "]";
	}

	public double getMiles() {
		return Miles;
	}

	public void setMiles(double miles) {
		Miles = miles;
	}

}
