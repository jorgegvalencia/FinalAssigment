package Entities;

public class Sitio {

	public String name;

	public String address;

	public boolean accesibility;

	public Double latitude;

	public Double longitude;

	public String city;

	public String postalCode;

	public String telephone;

	public String email;

	public Sitio(String name, String address, boolean accesibility,
			Double latitude, Double longitude, String city, String postalCode,
			String telephone, String email) {
		this.name = name;
		this.address = address;
		this.accesibility = accesibility;
		this.latitude = latitude;
		this.longitude = longitude;
		this.city = city;
		this.postalCode = postalCode;
		this.telephone = telephone;
		this.email = email;
	}



}