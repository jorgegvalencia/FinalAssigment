package Entities;

import java.util.Date;

public class PuntoInfTuristico extends Sitio {

	private Date schedule;

	public PuntoInfTuristico(String name, String address, boolean accesibility,
			Double latitude, Double longitude, String city, String postalCode,
			String telephone, String email, Date schedule) {
		super(name, address, accesibility, latitude, longitude, city, postalCode,
				telephone, email);
		this.schedule = schedule;
	}



}