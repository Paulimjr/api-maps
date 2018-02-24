package br.com.api.maps.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import br.com.api.maps.enums.Status;

@Entity
public class Company implements Serializable {

	private static final long serialVersionUID = 6114318895159283166L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@Column(name = "name")
	private String name;
	
	@Column(name = "status")
	private Status status;
	
	@Column(name = "latitude")
	private double latitude;
	
	@Column(name = "longitude")
	private double longitude;
	
	public Company() {
		
	}
	
	public Company (String name, double latitude, double longitude) {
		this.name = name;
		this.latitude = latitude;
		this.longitude = longitude;
		this.status = Status.ACTIVE;
	}

	/**
	 * @return the id
	 */
	public Integer getId() {
		return id;
	}


	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}


	/**
	 * @return the status
	 */
	public Status getStatus() {
		return status;
	}


	/**
	 * @return the latitude
	 */
	public double getLatitude() {
		return latitude;
	}


	/**
	 * @return the longitude
	 */
	public double getLongitude() {
		return longitude;
	}


	/**
	 * @param id the id to set
	 */
	public void setId(Integer id) {
		this.id = id;
	}


	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}


	/**
	 * @param status the status to set
	 */
	public void setStatus(Status status) {
		this.status = status;
	}


	/**
	 * @param latitude the latitude to set
	 */
	public void setLatitude(double latitude) {
		this.latitude = latitude;
	}


	/**
	 * @param longitude the longitude to set
	 */
	public void setLongitude(double longitude) {
		this.longitude = longitude;
	}
	
}
