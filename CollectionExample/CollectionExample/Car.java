package CollectionExample;

//Class for instance members of the class Car

public class Car  implements Comparable<Car> {

	private String make;
	private int model;
	private int year;
	private int price;
	
	//Parameterized Constructor
	public Car(String make, int model, int year, int price) {
		super();
		this.make = make;
		this.model = model;
		this.year = year;
		this.price = price;
	}

//to display the values instead of Hashcode
	@Override
	public String toString() {
		return "Car [make=" + make + ", model=" + model + ", year=" + year + ", price=" + price + "]";
	}

//to ensure that equality is maintained
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((make == null) ? 0 : make.hashCode());
		result = prime * result + model;
		return result;
	}

	//to ensure that equality is maintained

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Car other = (Car) obj;
		if (make == null) {
			if (other.make != null)
				return false;
		} else if (!make.equals(other.make))
			return false;
		if (model != other.model)
			return false;
		return true;
	}

	
	
	@Override
	public int compareTo(Car car) {
		
		return this.make.compareTo(car.make);
	}
	
	
	
}
