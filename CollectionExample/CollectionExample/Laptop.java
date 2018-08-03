package CollectionExample;
//Class for instance members of the class Laptop
public class Laptop {

	private String company;
	private int model;
	private String operatingSystem;
	private String processor;
	
	
	public Laptop(String company, int model, String operatingSystem, String processor) {
		super();
		this.company = company;
		this.model = model;
		this.operatingSystem = operatingSystem;
		this.processor = processor;
	}


	//to display the values instead of Hashcode

	@Override
	public String toString() {
		return "Laptop [company=" + company + ", model=" + model + ", operatingSystem=" + operatingSystem
				+ ", processor=" + processor + "]";
	}

	//to ensure that equality is maintained

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((company == null) ? 0 : company.hashCode());
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
		Laptop other = (Laptop) obj;
		if (company == null) {
			if (other.company != null)
				return false;
		} else if (!company.equals(other.company))
			return false;
		if (model != other.model)
			return false;
		return true;
	}
	
	
}
