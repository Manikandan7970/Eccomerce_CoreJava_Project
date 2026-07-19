package users;

import java.util.Scanner;

import store.DataStore;

public class Address {
	private int addressNo;
	private Customer customer;
	private String doorNumber;
    private String street;
    private String area;
    private String city;
    private String district;
    private String state;
    private String country;
    private String addressType;
    private int pincode;
    
    public Address()
    {}
    
    public Address(int addressNo,Customer customer,String doorNumber,String street, String area,String city
    		,String district,String state,String country,int pincode,String addressType)
    {
    	this.addressNo=addressNo;
    	this.customer=customer;
    	this.doorNumber=doorNumber;
    	this.street=street;
    	this.area=area;
    	this.city=city;
    	this.district=district;
    	this.country=country;
    	this.state=state;
    	this.pincode=pincode;
    	this.addressType=addressType;
    }
    
    public void setAddressNo(int addressNo)
    {
    	this.addressNo=addressNo;
    }
    
    public int getAddressNo()
    {
    	return this.addressNo;
    }
    public Customer getCustomer()
    {
    	return this.customer;
    }
    
    public void setCustomer(Customer customer)
    {
    	this.customer=customer;
    }
    
    public void setDoorNumber(String doorNumber)
    {
    	this.doorNumber=doorNumber;
    }
    
    public String getDoorNumber()
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
    
    public void setAddressType(String addressType)
    {
    	this.addressType=addressType;
    }
    
    public String getAddressType()
    {
    	return this.addressType;
    }
    
    public String toString()
    {
    	return "\nCustomer Name : "+this.customer.getUserName()
    	+"\nCustomer Number : "+this.customer.getUserPhone()+
    	"\nCustomer Address : \nAddress No : "+this.addressNo+"\nDoor No : "+this.doorNumber+
    	"\nStreet : "+this.street+"\nArea : "+this.area+"\nCity : "
    	+this.city+"\nDistrict : "+this.district+"\nState : "+this.state
    	+"\nCountry : "+this.country+"\nPincode : "+this.pincode
    	+"\nAddress Type : "+this.addressType;
    }
    
    public void addAddress(Scanner so,Customer c)
	{
    	System.out.print("\nAddress No :");
    	int addressNo=so.nextInt();
		System.out.print("\nDoor No :");
		so.nextLine();
		String doorNo=so.nextLine();
		System.out.print("\nStreet :");
		String street=so.nextLine();
		System.out.print("\nArea :");
		String area=so.nextLine();
		System.out.print("\nCity :");
		String city=so.nextLine();
		System.out.print("\nDistrict :");
		String district=so.nextLine();
		System.out.print("\nState :");
		String state=so.nextLine();
		System.out.print("\nCountry :");
		String country=so.nextLine();
		System.out.print("\nPinCode :");
		int pinCode=so.nextInt();
		System.out.print("Chooose Address Type :\n1.Home\n2.Work");
		int choose=so.nextInt();
		if(choose==1)
		{
		Address newAddress=new Address(addressNo,c,doorNo,street,area,city,district,state,country,pinCode,"Home");
		DataStore.addresses.add(newAddress);
		System.out.println("Address Added Successfully..");
		}
		else if(choose==2)
		{
			Address newAddress=new Address(addressNo,c,doorNo,street,area,city,district,state,country,pinCode,"Work");
			DataStore.addresses.add(newAddress);
			System.out.println("Address Added Successfully..");
		}
		else {
			System.out.println("Choose Invalid Option..");
		}
	}
	
	public void updateAddress(Scanner so,Customer c)
	{
		System.out.print("\nEnter Address No :");
		int addressNo=so.nextInt();
		boolean addressFound=false;
		for(int i=0;i<DataStore.addresses.size();i++)
		{
			Address address=DataStore.addresses.get(i);
			if(address.getCustomer()==c)
			{
				if(address.getAddressNo()==addressNo)
				{
					addressFound=true;
					System.out.println("Select the field you want to update:");
					System.out.println("1.Door No\n2.Street\n3.Area\n4.City\n5.District"
							+ "\n6.State\n7.Country\n8.Address Type\n9.PinCode\n10.Back");
					int choose=so.nextInt();
					switch(choose)
					{
					case 1:System.out.print("\nEnter Door No :");
					so.nextLine();
					String doorNo=so.nextLine();
					address.setDoorNumber(doorNo);
					System.out.println("Updated DoorNo.");
					break;
					case 2:System.out.print("\nEnter Street :");
					so.nextLine();
					String street=so.nextLine();
					address.setStreet(street);
					System.out.println("Updated Street.");
					break;
					case 3:System.out.print("\nEnter Area :");
					String area=so.nextLine();
					address.setArea(area);
					System.out.println("Updates Area.");
					break;
					case 4:System.out.print("\nEnter City :");
					String city=so.nextLine();
					address.setCity(city);
					System.out.println("Updates City.");
					break;
					case 5:System.out.print("\nEnter District :");
					String district=so.nextLine();
					address.setDistrict(district);
					System.out.println("Updated District.");
					break;
					case 6:System.out.print("\nEnter State.");
					String state=so.nextLine();
					address.setState(state);
					System.out.println("Updated State.");
					break;
					case 7:System.out.print("\nEnter Country :");
					String country=so.nextLine();
					address.setCountry(country);
					System.out.println("Updated Country.");
					break;
					case 8:System.out.print("\nChoose Address Type 1.Home 2.Work :");
					int addressType=so.nextInt();
					if(addressType==1)
					{
						address.setAddressType("Home");
					    System.out.println("Updated Address Type.");
					}
					else if(addressType==2)
					{
						address.setAddressType("Work");
						System.out.println("Updated Address Type.");
					}
					else
						System.out.println("Invalid Input Option.");
					break;
					case 9:System.out.print("\nEnter PinCode :");
					int pinCode=so.nextInt();
					address.setPincode(pinCode);
					System.out.println("Updated Pincode.");
					break;
					case 10:System.out.println("Back..");
						return;
					default :System.out.println("Invalid Input Option.");
					}
				}
				if(!addressFound)
					System.out.println("Address No Not Found.");
			}
		}
	}
	
	public void viewAddress(Customer c)
	{
		boolean addressFound=false;
		for(Address address : DataStore.addresses)
		{
			if(address.customer.getUserId()==c.getUserId())
			{
				addressFound=true;
				System.out.println(address);
			}
		}
		if(!addressFound)
		{
			System.out.println("You Have No Address In This Account.");
			System.out.println("Please Add Address.");
		}
	}
	
	public void removeAddress(Scanner so,Customer c)
	{
		System.out.print("Enter Address No :");
		int addressNo=so.nextInt();
		boolean addressFound=false;
		for(int i=0;i<DataStore.addresses.size();i++)
		{
			Address address=DataStore.addresses.get(i);
			if(address.getCustomer()==c && address.addressNo==addressNo)
			{
				addressFound=true;
				DataStore.addresses.remove(i);
			}
		}
		if(!addressFound)
		{
			System.out.println("Addres Not Found..");
		}
	}
	
	public void selectDeliveryAddress()
	{
		
	}

}
