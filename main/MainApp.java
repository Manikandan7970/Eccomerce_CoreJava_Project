package main;

import java.util.Scanner;
import store.DataStore;


public class MainApp {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Menu m=new Menu();
		DataStore.Load();
		while(true)
		{
			System.out.println("Welcome To ShopShpere.");
			System.out.println("1.Admin\n2.Customer\n3.Exit");
			Scanner so=new Scanner(System.in);
			int choose=so.nextByte();
			switch(choose)
			{
			case 1:m.adminLogin(so,m);
				break;
			case 2:System.out.println("1.Signup or 2.You Already Have a Account? Login.");
			    int customerChoice=so.nextByte();
			    switch(customerChoice)
			    {
			    case 1:m.customerSignUp(so);
			           m.customerLogin(so);
			    break;
			    case 2:m.customerLogin(so);
			    break;
			    default :System.out.println("Invalid Option.");
			    }
				break;
			case 3:{System.out.println("Exit.");
			        return;}
			default :System.out.println("Invalid Option.");
			}
		}

	}


}
