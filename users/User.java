package users;

import java.util.Scanner;

public abstract class User {
	private int userId;
	private String userName;
	private String userEmail;
	private String userPassword;
	private String userPhone;
	private char userGender;
	private boolean userActive;
	private String userStatus;
	
	public User()
	{}
	
	public User(int userId,String userName, String userEmail,
			String userPassword,String userPhone,char userGender,
			boolean userActive,String userStatus)
	{
		this.userId=userId;
		this.userName=userName;
		this.userEmail=userEmail;
		this.userPassword=userPassword;
		this.userPhone=userPhone;
		this.userGender=userGender;
		this.userActive=userActive;
		this.userStatus=userStatus;
	}
	
	public void setUserId(int userId)
	{
		this.userId=userId;
	}
	
	public int getUserId()
	{
		return this.userId;
	}
	
	public void setUserName(String userName)
	{
		this.userName=userName;
	}
	
	public String getUserName()
	{
		return this.userName;
	}
	
	public void setUserEmail(String userEmail)
	{
		this.userEmail=userEmail;
	}
	
	public String getUserEmail()
	{
		return this.userEmail;
	}
	
	public void setUserPassword(String userPassword)
	{
		this.userPassword=userPassword;
	}
	
	public String getUserPassword()
	{
		return this.userPassword;
	}
	
	public void setUserPhone(String userPhone)
	{
		this.userPhone=userPhone;
	}
	
	public String getUserPhone()
	{
		return this.userPhone;
	}
	
	public void setUserGender(char userGender)
	{
		this.userGender=userGender;
	}
	
	public char getUserGender()
	{
		return this.userGender;
	}
	
	public void setUserActive(boolean userActive)
	{
		this.userActive=userActive;
	}
	
	public boolean getUserActive()
	{
		return this.userActive;
	}
	
	public void setUserStatus(String userStatus)
	{
		this.userStatus=userStatus;
	}
	
	public String getUserStatus()
	{
		return this.userStatus;
	}
	
	public String toString()
	{
		return "\nUser Id : "+this.userId+"\nUser Name : "+this.userName+
				"\nUser Email : "+this.userEmail+"\nUser Password : "+this.userPassword+
				"\nUser Phone : "+this.userPhone+"\nUser Gender : "+this.userGender+
				"\nUser Status : "+this.userStatus +"\nUser Active : "+this.userActive+"\n";
	}
	public abstract void login();
	
	public abstract void logout();
	
	public abstract void displayProfile();
	
	public abstract void changePassword(Scanner so);
	
	public abstract void updateProfile(Scanner so);
	

}
