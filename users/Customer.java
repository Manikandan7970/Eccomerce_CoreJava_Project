package users;
import java.util.Scanner;
import cart.Cart;
import products.Product;
import store.DataStore;

public class Customer extends User {
	private short rewardPoints;
	private String membershipType;
	
	public Customer()
	{}
	
	public Customer(int userId,String userName, String userEmail,
			String userPassword,String userPhone,char userGender,
			boolean userActive,String userStatus,short rewardPoints,
			String membershipType)
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
	
	public void viewProductDetails(Product p)
	{
		System.out.println(p.toString());
	}

	public void searchProduct(Scanner so)
	{
		Product p;
		System.out.println("Search Product");
		System.out.println("How they want to search.");
		System.out.println("\n1.Search By Product Category"
				+ "\n2.Search By Product Name\n3.Search By Product Brand\n4.Back To Menu.\n\n");
		System.out.print("Enter Your Choice :");
		int search=so.nextInt();
		switch(search)
		{
		case 1:System.out.print("\n\nSearch product by category :");
		so.nextLine();
		String productCategory=so.nextLine();
		boolean isAvailable=false;
		int i;
		for(i=0;i<DataStore.products.size();i++)
		{
			if(DataStore.products.get(i).getProductCategory().getCategoryName().contains(productCategory))
			{
				p=DataStore.products.get(i);
				isAvailable=true;
				System.out.println(DataStore.products.get(i));
			}
		}
		if(isAvailable)
		{
			System.out.println("\n\n1.Buy\n2.Add to Cart\n3.Back to Menu");
			int choice=so.nextInt();
			switch(choice)
			{
			case 1:
			break;
			case 2:new Cart().addProductToCart(so,this);
			break;
			case 3:return;
			default :System.out.println("Invalid Input..");
			}
		}
		else 
		{
			System.out.println("Product Not Found To This Category..");
		}
		}
	}
	public void viewAllProducts()
	{
		for(int i=0;i<DataStore.products.size();i++)
			System.out.println(DataStore.products.get(i));
	}
	
	public void checkout()
	{
			
	}
	
	public void viewRewardPoints()
	{
		if(this instanceof PremiumCustomer)
		{
			PremiumCustomer p=(PremiumCustomer) this;
			System.out.println("\nCustomer Id : "+p.getUserId()
			+"\nCustomer Name : "+p.getUserName()
			+"\n\nMembership Type : "+p.getMemberShipType()
			+"\nReward Points : "+p.getRewardPoints()
			+"\nReward MultiPlier : "+p.getRewardMultiplier());
		}
		else if(this instanceof Customer)
		{
			System.out.println("\nCustomer Id : "+this.getUserId()
			+"\nCustomer Name : "+this.getUserName()
			+"\n\nMembership Type : "+this.getMemberShipType()
			+"\nReward Points : "+this.getRewardPoints());
		}
	}
	
	public void viewMembership()
	{
		if(this instanceof PremiumCustomer)
		{
			PremiumCustomer p=(PremiumCustomer) this;
			System.out.println("\nCustomer Id : "+p.getUserId()
			+"\nCustomer Name : "+p.getUserName()
			+"Membership Type : "+p.getMemberShipType()
			+"\nStatus : "+p.getUserStatus()
			+"\n\nExtra Discount : "+p.getExtraDiscount()
			+"\nFree Shipping : "+p.getFreeShiping()
			+"\nReward MultiPlier : "+p.getRewardMultiplier());
		}
		else if(this instanceof Customer)
		{
			System.out.println("\nCustomer Id : "+this.getUserId()
			+"\nCustomer Name : "+this.getUserName()
			+"Membership Type : "+this.getMemberShipType()
			+"\nStatus : "+this.getUserStatus());
		}
	}
	public void upgradeToPremium()
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
		System.out.println("My Profile");
		System.out.println("\nId : "+this.getUserId()+"\nName : "+this.getUserName()
		+"\nGender : "+this.getUserGender()+"\nEmail : "+this.getUserEmail()
		+"\nPhone Number : "+this.getUserPhone()+"\nReward Points : "+this.rewardPoints
		+"\nMembershipType : "+this.membershipType);
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
					so.nextLine();
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
