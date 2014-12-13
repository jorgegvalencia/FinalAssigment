package Entities;

public class Sitio {

	public String type;
	
	public String name;

	public String address;

	public boolean accesibility;

	public Double latitude;

	public Double longitude;

	public String postalCode;

	public String telephone;

	public String email;
	
	public double distance;

	public Sitio(String type, String name, String address, boolean accesibility,
			double latitude, double longitude, String postalCode,
			String telephone, String email, double distance) {
		this.name = name;
		this.address = address;
		this.accesibility = accesibility;
		this.latitude = latitude;
		this.longitude = longitude;
		this.postalCode = postalCode;
		this.telephone = telephone;
		this.email = email;
		this.distance = distance;
	}



}