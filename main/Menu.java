package main;

import java.util.Scanner;
import cart.Cart;
import orders.Invoice;
import orders.Orders;
import store.DataStore;
import users.Address;
import users.Admin;
import users.Customer;
import users.PremiumCustomer;

public class Menu {
	public void adminLogin(Scanner so,Menu m)
	{
		while(true)
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
				admin.login();
				m.adminMenu(so, admin, m);
				return;
				}
			}
			if(!contain){
				System.out.println("Wrong Email or Password.");
				System.out.println("Please enter valid email or password.");
			}
		}
	}
	
	public void customerLogin(Scanner so,Menu m)
	{
		while(true)
		{
			so.nextLine();
			System.out.println("Login.");
			System.out.println("Enter Email.");
			String email=so.nextLine();
			System.out.println("Enter Password.");
			String password=so.nextLine();
			boolean contain=false;
			for(int i=0;i<DataStore.customers.size();i++)
			{
				Customer customer=DataStore.customers.get(i);
				if(email.equals(customer.getUserEmail()) &&
						password.equals(customer.getUserPassword()))
				{
				contain=true;
				customer.login();
				m.customerMenu(so, customer, m);
				return;
				}
			}
			if(!contain){
				System.out.println("Wrong Email or Password.");
				System.out.println("Please enter valid email or password.");
			}
		}						
	}
	public void customerSignUp(Scanner so)
	{
		while(true)
		{
			System.out.println("Register.");
			System.out.println("Enter Name");
			so.nextLine();
			String name=so.nextLine();
			System.out.println("Enter Email");
			String email=so.next();
			System.out.println("Enter Password");
			String password=so.next();
			System.out.println("Enter Phone Number");
			String phoneNumber=so.next();
			System.out.println("Enter Gender M/F");
			String Gender=so.next();
			char gender=Gender.toUpperCase().charAt(0);
			boolean valid=false;
			String registermail="";
			if(name.length()<=15)
			{
				if(email.contains("@gmail.com"))
				{
					for(int i=0;i<DataStore.customers.size();i++)
					{
						if(!DataStore.customers.get(i).getUserEmail().contains(email))
						{
							registermail=DataStore.customers.get(i).getUserEmail();
						}
					}
						if(!email.contains(registermail))
						{
							if(password.length()>=8)
							{
								if(phoneNumber.length()==10)
								{
									if(Gender.toUpperCase().equals("M")||Gender.toUpperCase().equals("F"))
									{
										valid=true;
									}
									else {
										System.out.println("Invalid gender.");
										System.out.println("Please enter valid gender.");
								         }
								}
								else
								{
									System.out.println("Invalid phone number.");
									System.out.println("Please enter valid phone number.");
								}
								
							}
					        else {
							System.out.println("Not a strong password.");
							System.out.println("Please enter strong password.");
						         }
						  
						}
						else {
							System.out.println("Have already account to this mail.");
							System.out.println("Please enter another mail");
						}
				}
			else{
				System.out.println("Invalid email.");
				System.out.println("Please enter valid email.");
			    }
			}
			else {
				System.out.println("Name charcter length is to much.");
				System.out.println("Please enter below 15 characters.");
			}
			
			if(valid)
			{
				Customer c=new Customer(204,name,email,password,phoneNumber,gender,true,
						"Active",(short)0,"Regular");
				if(DataStore.customers.add(c))
				{
					System.out.println("Registered Successfully...");
					break;
				}
				else {
					System.out.println("Not Registered Successfully.Please try again.");
				}
			}
			
		}
		
		
		
	}
	public void adminMenu(Scanner so,Admin admin,Menu m)
	{
			while(true)
			{
				System.out.println("1.Logout\n2.Display Profile\n3.Change Password\n4.Update Profile\n5.Add Product\n6.Update Product\n"
						+ "7.Delete Product\n8.Search Product\n9.View All Products\n10.View Low Stock Products\n"
						+ "11.View Customers\n12.View Orders\n13.Generate Reports");
				System.out.print("\nEnter Your Choice :");
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
	public void customerMenu(Scanner so,Customer c,Menu m)
	{
		while(true)
		{
			System.out.println("\n1.Profile\n2.Products\n3.Cart\n4.Orders\n5.Address\n6.Rewards & Membership\n7.Logout\n\n");
			System.out.print("Enter Your Choice :");
			int mainMenu=so.nextInt();
			if(mainMenu==1)
			{
				System.out.println("\n1.Display Profile\n2.Change Password\n3.Update Profile\n4.Back\n\n");
				System.out.print("Enter Your Choice :");
				int profilemenu=so.nextInt();
				switch(profilemenu)
				{
				case 1:c.displayProfile();
				break;
				case 2:c.changePassword(so);
				break;
				case 3:c.updateProfile(so);
				break;
				case 4:break;
				default : System.out.println("Invalid Input.");
				}
			}
			else if(mainMenu==2)
			{
					System.out.println("\n1.Search Product\n2.View All Products\n3.Back\n\n");
					System.out.print("Enter Your Choice :");
					int productMenu=so.nextInt();
					switch(productMenu)
					{
					case 1:c.searchProduct(so);
					break;
					case 2:c.viewAllProducts();
					break;
					case 3:break;
					default : System.out.println("Invalid Option.");
					}
			}
			
			else if(mainMenu==3)
			{
				Cart cart=new Cart();
				System.out.println("\n1.Add Product to Cart\n2.Remove Product from Cart\n3.Update Quantity"
						+ "\n4.View Cart\n5.Clear Cart\n6.Checkout\n7.Back\n\n");
				System.out.print("Enter Your Choice :");
				int cartMenu=so.nextInt();
				switch(cartMenu)
				{
				case 1:cart.addProductToCart(so,c);
				break;
				case 2:cart.removeProductFromCart(so,c);
				break;
				case 3:cart.updateCartQuantity(so,c);
				break;
				case 4:cart.viewCart(so,c);
				break;
				case 5:cart.clearCart(c);
				break;
				case 6:c.checkout();
				break;
				case 7:break;
				default :System.out.println("Invalid Option...");
				}
			}
			
			else if(mainMenu==4)
			{
				Orders o=new Orders();
				System.out.println("\n1.Place Order\n2.View My Orders\n3.Cancel Order\n4.View Invoice\n5.Back\n\n");
				System.out.print("Enter Your Choice :");
				int orderMenu=so.nextInt();
				switch(orderMenu)
				{
				case 1:o.placeOrder();
				break;
				case 2:o.viewOrders();
				break;
				case 3:o.cancelOrder();
				break;
				case 4:new Invoice().viewInvoice();
				break;
				case 5:break;
				default:System.out.println("Invalid Option..");
				}
			}
			
			else if(mainMenu==5)
			{
				Address a=new Address();
				System.out.println("\n1.Add Address\n2.Update Address\n3.View Address\n4.Remove Address\n5.Back\n\n");
				System.out.print("Enter Your Choice :");
				int addressMenu=so.nextInt();
				switch(addressMenu)
				{
				case 1:a.addAddress(so,c);
				break;
				case 2:a.updateAddress(so,c);
				break;
				case 3:a.viewAddress(c);
				break;
				case 4:a.removeAddress(so,c);
				break;
				case 5:break;
				default:System.out.println("Invalid Option...");
				}
			}
			else if(mainMenu==6)
			{
			if(c instanceof Customer)
			{
					System.out.println("\n1.View Reward Points\n2.View Membership\n3.Upgrade to Premium\n4.Back\n\n");
					System.out.print("Enter Your Choice :");
					int rewardMembershipTypeMenu=so.nextInt();
					switch(rewardMembershipTypeMenu)
					{
					case 1:c.viewRewardPoints();
					break;
					case 2:c.viewMembership();
					break;
					case 3:c.upgradeToPremium();
					break;
					case 4:break;
					default:System.out.println("Invalid Option....");
					}
			}
			if(c instanceof PremiumCustomer)
			{
					System.out.println("\n1.View Reward Points\n2.Redeem Reward Points\n3.View Membership\n4.View Extra Discount"
							+ "\n5.Upgrade Membership\n6.Back\n\n");
					System.out.print("Enter Your Choice :");
					int rewardMembershipTypeMenu=so.nextInt();
					switch(rewardMembershipTypeMenu)
					{
					case 1:c.viewRewardPoints();
					break;
					case 2:((PremiumCustomer) c).redeemRewardPoints();
					break;
					case 3:c.viewMembership();
					break;
					case 4:((PremiumCustomer) c).extraDiscount();
					break;
					case 5:((PremiumCustomer) c).upgradeMembership();
					break;
					case 6:break;
					default :System.out.println("Invalid Option..");
					}
			}
			}
			else if(mainMenu==7)
			{
				c.logout();
				return;
			}
			else {
				System.out.println("Invalid Option..");
			}
			
		}
	}

}
