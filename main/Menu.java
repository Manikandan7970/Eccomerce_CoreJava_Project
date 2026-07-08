package main;

import java.util.Scanner;

import store.DataStore;
import users.Admin;

public class Menu {
	public void adminLogin(Scanner so,Menu m)
	{
		so.nextLine();
		System.out.println("Login.");
		System.out.println("Enter Email.");
		String email=so.nextLine();
		System.out.println("Enter Password.");
		String password=so.nextLine();
		boolean contain=false;
		for(int i=0;i<DataStore.admins.size();i++)
		{
			Admin admin=DataStore.admins.get(i);
			if(email.equals(admin.getUserEmail()) &&
					password.equals(admin.getUserPassword()))
			{
			contain=true;
			m.adminMenu(so, admin, m);
			}
		}
		if(!contain){
			System.out.println("Wrong Email or Password.");
			System.out.println("Please enter valid email or password.");
			adminLogin(so,m);
		}
	}
	
	public void customerLogin(Scanner so)
	{
		
	}
	public void customerSignUp(Scanner so)
	{
		
	}
	public void adminMenu(Scanner so,Admin admin,Menu m)
	{
			while(true)
			{
				System.out.println("1.Logout\n2.Display Profile\n3.Change Password\n4.Update Profile\n5.Add Product\n6.Update Product\n"
						+ "7.Delete Product\n8.Search Product\n9.View All Products\n10.View Low Stock Products\n"
						+ "11.View Customers\n12.View Orders\n13.Generate Reports");
				int choice=so.nextInt();
				switch(choice)
				{
				case 1:admin.logout();
				return;
				case 2:admin.displayProfile();
				break;
				case 3:admin.changePassword(so);
				break;
				case 4:admin.updateProfile(so);
				break;
				case 5:admin.addProduct();
				break;
				case 6:admin.updateProduct();
				break;
				case 7:admin.deleteProduct();
				break;
				case 8:admin.searchProduct();
				break;
				case 9:admin.viewProducts();
				break;
				case 10:admin.viewLowStock();
				break;
				case 11:admin.viewCustomers();
				break;
				case 12:admin.viewOrders();
				break;
				case 13:admin.generateReport();
				break;
				default :System.out.println("Invalid Option..");
				}
			}
	}
	public void customerMenu(Scanner so,Object o,Menu m)
	{
		
	}

}
