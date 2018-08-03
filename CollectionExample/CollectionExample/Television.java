package CollectionExample;

public class Television {

	private String company;
	private int price;
	private boolean is3DEnabled3D;
	private String type;
	
	
	public Television(String company, int price, boolean is3dEnabled3D, String type) {
		super();
		this.company = company;
		this.price = price;
		is3DEnabled3D = is3dEnabled3D;
		this.type = type;
	}


	@Override
	public String toString() {
		return "Television [company=" + company + ", price=" + price + ", is3DEnabled3D=" + is3DEnabled3D + ", type="
				+ type + "]";
	}

	//to ensure that equality is maintained

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((company == null) ? 0 : company.hashCode());
		result = prime * result + price;
		result = prime * result + ((type == null) ? 0 : type.hashCode());
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
		Television other = (Television) obj;
		if (company == null) {
			if (other.company != null)
				return false;
		} else if (!company.equals(other.company))
			return false;
		if (price != other.price)
			return false;
		if (type == null) {
			if (other.type != null)
				return false;
		} else if (!type.equals(other.type))
			return false;
		return true;
	}
	
	
	
	
	
}
