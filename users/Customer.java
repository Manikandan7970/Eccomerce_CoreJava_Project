package users;

import java.util.Scanner;

public class Customer extends User {
	private short rewardPoints;
	private String membershipType;
	
	public Customer()
	{}
	
	public Customer(int userId,String userName, String userEmail,
			String userPassword,String userPhone,char userGender,
			boolean userActive,String userStatus,short rewardPoints,String membershipType)
	{
		super(userId,userName,userEmail,userPassword,userPhone,
				userGender,userActive,userStatus);
		this.rewardPoints=rewardPoints;
		this.membershipType=membershipType;
	}
	
	
	public void setRewardPoints(short rewardPoints)
	{
		this.rewardPoints=rewardPoints;
	}
	
	public short getRewardPoints()
	{
		return this.rewardPoints;
	}
	
	public void setMemberShipType(String membershipType)
	{
		this.membershipType=membershipType;
	}
	
	public String getMemberShipType()
	{
		return this.membershipType;
	}
	
	
	public void register()
	{
		
	}

	public void searchProduct()
	{
		
	}

	public void addToCart() 
	{
		
	}

	public void removeCart()
	{
		
	}

	public void checkout()
	{
		
	}

	public void viewOrders()
	{
		
	}

	public void cancelOrder()
	{
		
	}
	
	public void calculateDiscount()
	{
		
	}
	
	public void signUp()
	{
		
	}
	
	public String toString()
	{
		return "\nUser Id : "+this.getUserId()+"\nUser Name : "+this.getUserName()+
				"\nUser Email : "+this.getUserEmail()+"\nUser Password : "+this.getUserPassword()+
				"\nUser Phone : "+this.getUserPhone()+"\nUser Gender : "+this.getUserGender()+
				"\nUser Status : "+this.getUserStatus() +"\nUser Active : "+this.getUserActive()+
				"\nReward Points : "+this.rewardPoints+"\nMembership Type : "+this.membershipType+"\n";
	}

	@Override
	public void login() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void logout() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void displayProfile() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void changePassword(Scanner so) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateProfile(Scanner so) {
		// TODO Auto-generated method stub
		
	}
	

}
