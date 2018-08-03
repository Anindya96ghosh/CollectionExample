package CollectionExample;

//Class for instance members of the class CellPhone
public class CellPhone {


	private String company;
	private int model;
	private String operatingSystem;
	private String description;
	private int price;
	
	public CellPhone(String company, int model, String operatingSystem, String description, int price) {
		super();
		this.company = company;
		this.model = model;
		this.operatingSystem = operatingSystem;
		this.description = description;
		this.price = price;
	}

	//to display the values instead of Hashcode

	@Override
	public String toString() {
		return "CellPhone [company=" + company + ", model=" + model + ", operatingSystem=" + operatingSystem
				+ ", description=" + description + ", price=" + price + "]";
	}

	//to ensure that equality is maintained

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((company == null) ? 0 : company.hashCode());
		result = prime * result + model;
		result = prime * result + ((operatingSystem == null) ? 0 : operatingSystem.hashCode());
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
		CellPhone other = (CellPhone) obj;
		if (company == null) {
			if (other.company != null)
				return false;
		} else if (!company.equals(other.company))
			return false;
		if (model != other.model)
			return false;
		if (operatingSystem == null) {
			if (other.operatingSystem != null)
				return false;
		} else if (!operatingSystem.equals(other.operatingSystem))
			return false;
		return true;
	}

	
}
