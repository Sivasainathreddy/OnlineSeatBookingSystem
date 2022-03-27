package com.OSB.Model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "Seat")
public class Seat implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)

	private int locationId;

	@NotNull(message = "Location Name must not be Empty")
	private String locationName;
	
	
	@NotNull(message = "Seats must not be Empty")
	private int seatAvailable;

	

	public Seat() {
		super();
		
	}

	public Seat(@NotNull(message = "Location Name must not be Empty") String locationName,
			@NotNull(message = "Seats must not be Empty") int seatAvailable) {
		super();
		this.locationName = locationName;
		this.seatAvailable = seatAvailable;
	}

	public int getLocationId() {
		return locationId;
	}

	public void setLocationId(int locationId) {
		this.locationId = locationId;
	}

	public String getLocationName() {
		return locationName;
	}

	public void setLocationName(String locationName) {
		this.locationName = locationName;
	}

	public int getSeatAvailable() {
		return seatAvailable;
	}

	public void setSeatAvailable(int seatAvailable) {
		this.seatAvailable = seatAvailable;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public String toString() {
		return "Seat [locationId=" + locationId + ", locationName=" + locationName + ", seatAvailable=" + seatAvailable
				+ "]";
	}



	
	
}
