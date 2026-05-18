package bean;

public class Address {
private int doorno;
private String street;
private String city;
private long pincode;
public void setDoorno(int doorno) {
	this.doorno = doorno;
}
public void setStreet(String street) {
	this.street = street;
}
public void setCity(String city) {
	this.city = city;
}
public void setPincode(long pincode) {
	this.pincode = pincode;
}
@Override
public String toString() {
	return "Address  \ndoorno=" + doorno + "\nstreet=" + street + "\ncity=" + city + "\npincode=" + pincode;
}

}
