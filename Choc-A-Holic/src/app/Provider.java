package app;

import java.io.Serializable;

public class Provider implements Serializable {
	private static final long serialVersionUID = 5255424007418446010L;
	private long providerNumber;
	private String name;
	private String address;
	private String city;
	private String state;
	private long zip;
	private String email;
	
	public Provider(long providerNumber, String name, String address, String city, String state, long zip, String email){
		this.providerNumber = providerNumber;
		this.name = name;
		this.address = address;
		this.city = city;
		this.state = state;
		this.zip = zip;
		this.email = email;
	}

	public long getProviderNumber() {
		return providerNumber;
	}

	public void setProviderNumber(long providerNumber) {
		this.providerNumber = providerNumber;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public long getZip() {
		return zip;
	}

	public void setZip(long zip) {
		this.zip = zip;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	public String toString() {
		return providerNumber + "~" + name + "~" + address + "~" + city + "~" + state + "~" + zip + "~" + email;
	}
}