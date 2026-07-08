package users;

import java.util.Scanner;
import store.DataStore;

public class Admin extends User {
	public Admin()
	{}
	
	public Admin(int userId,String userName, String userEmail,
			String userPassword,String userPhone,char userGender,
			boolean userActive,String userStatus)
	{
		super(userId,userName,userEmail,userPassword,
				userPhone,userGender,userActive,userStatus);
	}
	
	
	public void addProduct()
	{
		
	}
	
	public void updateProduct()
	{
		
	}
	
	public void deleteProduct()
	{
		
	}
	
	public void viewProducts()
	{
		for(int i=0;i<DataStore.products.size();i++)
			System.out.println(DataStore.products.get(i));
	}
	
	public void searchProduct()
	{
		
	}
	
	public void viewCustomers()
	{
		for(int i=0;i<DataStore.customers.size();i++)
			System.out.println(DataStore.customers.get(i));
	}
	
	public void viewOrders()
	{
		for(int i=0;i<DataStore.orders.size();i++)
			System.out.println(DataStore.orders.get(i));
	}
	
	public void viewLowStock()
	{
		
	}
	
	public void generateReport()
	{
		
	}
	
	@Override
	public void login() {
		// TODO Auto-generated method stub
			System.out.println("Login Successfully...");
	}

	@Override
	public void logout() {
		// TODO Auto-generated method stub
		System.out.println("Logout...");
	}

	@Override
	public void displayProfile() {
		// TODO Auto-generated method stub
		System.out.println(this);
		
	}

	@Override
	public void changePassword(Scanner so) {
		// TODO Auto-generated method stub
		while(true)
		{
			System.out.println("Enter Your Current Password.");
			String currentPass=so.next();
			if(this.getUserPassword().contains(currentPass))
			{
					if(currentPass.equals(this.getUserPassword()))
					{
						while(true)
						{
							System.out.println("Enter Your new Pasword.");
							String newPass=so.next();
							System.out.println("Confirm Your Password.");
							String confirmPass=so.next();
							if(newPass.equals(confirmPass))
							{
								this.setUserPassword(confirmPass);
								System.out.println("Password Successfully Changed..");
								return;
							}
							else {
								System.out.println("Wrong Confirm Password.Please Try Again.");
							    }
						}
					}
			}
			else {
				System.out.println("Invalid Password.");
				return;
			     }
		}	
	}

	@Override
	public void updateProfile(Scanner so) {
		// TODO Auto-generated method stub
		while(true)
		{
			System.out.println("Which You Wants To Update.");
			System.out.println("1.Name\n2.Email\n3.Phone Number\n4.Gender\n5.Back");
			int choice=so.nextInt();
			if(choice==1)
			{
				while(true)
				{
					System.out.println("Enter New Name.");
					String newName=so.nextLine();
					if(!newName.equals(this.getUserName())&&newName.length()<=15)
					{
						this.setUserName(newName);
						System.out.println("Name Successfully Updated..");
						return;
					}
					else {
						System.out.println("Invalid Name Try Again.");
					}
				}
			}
			else if(choice==2)
			{
				while(true)
				{
					System.out.println("Enter New Email.");
					String newEmail=so.next();
					if(newEmail.contains("@gmail.com"))
					{
					this.setUserEmail(newEmail);
					System.out.println("Email Successfully Updated..");
					return;
					}
					else {
						System.out.println("Invalid Mail Try Again.");
					}
				}
			}
			else if(choice==3)
			{
				while(true)
				{
					System.out.println("Enter New Phone Number.");
					String newphoneNumber=so.next();
					if(newphoneNumber.length()==10)
					{
						this.setUserPhone(newphoneNumber);
						System.out.println("Phone Number Successfully Updated..");
						return;
					}
					else {
						System.out.println("Inavlid Phone Number Try Again.");
					}
				}
			}
			else if(choice==4)
			{
				while(true)
				{
					System.out.println("Enter New Gender M/F.");
					String newGender=so.next();
					if(newGender.toUpperCase().equals("M")||newGender.toUpperCase().equals("F"))
					{
						char gender=newGender.toUpperCase().charAt(0);
						this.setUserGender(gender);
						System.out.println("Gender Successfully Updated...");
						return;
					}
					else{
						System.out.println("Invalid Gender Try Again.");
					}
				}
			}
			else if(choice==5)
			{
				System.out.println("Back to menu...");
				return;
			}
			else {
				System.out.println("Invalid Choice..");
			}
			
		}
	}
}
