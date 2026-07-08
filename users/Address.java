package users;

import java.util.ArrayList;

public class Address {
	private int doorNumber;
    private String street;
    private String area;
    private String city;
    private String district;
    private String state;
    private String country;
    private int pincode;
    public static ArrayList<Address> address =new ArrayList<Address>();
    
    public Address()
    {}
    
    public Address(int doorNumber,String street, String area,String city
    		,String district,String state,String country,int pincode)
    {
    	this.doorNumber=doorNumber;
    	this.street=street;
    	this.area=area;
    	this.city=city;
    	this.district=district;
    	this.country=country;
    	this.state=state;
    	this.pincode=pincode;
    }
    
    public void setDoorNumber(int doorNumber)
    {
    	this.doorNumber=doorNumber;
    }
    
    public int getDoorNumber()
    {
    	return this.doorNumber;
    }
    
    public void setStreet(String street)
    {
    	this.street=street;
    }
    
    public String getStreet()
    {
    	return this.street;
    }
    
    public void setArea(String area)
    {
    	this.area=area;
    }
    
    public String getArea()
    {
    	return this.area;
    }
    
    public void setCity(String city)
    {
    	this.city=city;
    }
    
    public String getCity()
    {
    	return this.city;
    }
    
    public void setDistrict(String district)
    {
    	this.district=district;
    }
    
    public String getDistrict()
    {
    	return this.district;
    }
    
    public void setState(String state)
    {
    	this.state=state;
    }
    
    public String getState()
    {
    	return this.state;
    }
    
    public void setCountry(String country)
    {
    	this.country=country;
    }
    
    public String getCountry()
    {
    	return this.country;
    }
    
    public void setPincode(int pincode)
    {
    	this.pincode=pincode;
    }
    
    public int getPincode()
    {
    	return this.pincode;
    }
    
    
   public void displayAddress()
   {
	   
   }

   public void updateAddress()
    {
    	
    }

}
