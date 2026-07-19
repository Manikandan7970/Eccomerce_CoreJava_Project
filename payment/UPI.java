package payment;

import java.util.Scanner;
import store.DataStore;

public class UPI implements Payment,Refundable,TrackPayment {
	private String UPIID;
	private int pinNo;
	private String appName;
	private int bankBalance;
	public UPI()
	{}
	public UPI(String UPIID,int pinNo,String appName,int bankBalance)
	{
		this.UPIID=UPIID;
		this.pinNo=pinNo;
		this.appName=appName;
		this.bankBalance=bankBalance;
	}
	
	public String getUPIID()
	{
		return this.UPIID;
	}
	
	public void setUPIID(String UPIID)
	{
		this.UPIID=UPIID;
	}
	
	public int getPinNo()
	{
		return this.pinNo;
	}
	
	public void setPinNo(int pinNo)
	{
		this.pinNo=pinNo;
	}
	
	public String getAppName()
	{
		return this.appName;
	}
	
	public void setAppName(String appName)
	{
		this.appName=appName;
	}
	
	public void setBankBalance(int bankBalance)
    {
    	this.bankBalance=bankBalance;
    }
    
    public int getBankBalance() {
    	
    	return this.bankBalance;
    }

	@Override
	public void pay(Scanner so) {
		// TODO Auto-generated method stub
		while(true)
		{
			System.out.println("UPI Apps.\n1.Gpay\n2.Phonepe\n3.Paytm\n4.Back");
			int appchoice=so.nextInt();
			boolean valid=false;
			if(appchoice==1)
			{
				System.out.println("Enter UPI Id.");
				String upiId=so.next();
				System.out.println("Enter Pass");
				int pinNo=so.nextInt();
				for(int i=0;i<DataStore.payments.size();i++)
				{
					UPI o=(UPI) DataStore.payments.get(i);
					if(o.UPIID==upiId && o.appName.equalsIgnoreCase("gpay"))
					{
						if(o.pinNo==pinNo && o.appName.equalsIgnoreCase("gpay"))
								valid=true;
						else
							System.out.println("Invalid Pin.");
					}
					else {
						System.out.println("Invalid Upi Id.");
					}
				}
				if(valid)
					System.out.println("Payment SuccessFully..");
				else
					System.out.println("Not Payment Successfully..");
			}
			else if(appchoice==2)
			{
				System.out.println("Enter UPI Id.");
				String upiId=so.next();
				System.out.println("Enter Pass");
				int pinNo=so.nextInt();
				for(int i=0;i<DataStore.payments.size();i++)
				{
					UPI o=(UPI) DataStore.payments.get(i);
					if(o.UPIID==upiId && o.appName.equalsIgnoreCase("phonepe"))
					{
						if(o.pinNo==pinNo && o.appName.equalsIgnoreCase("phonepe"))
								valid=true;
						else
							System.out.println("Invalid Pin.");
					}
					else {
						System.out.println("Invalid Upi Id.");
					}
				}
				if(valid)
					System.out.println("Payment SuccessFully..");
				else
					System.out.println("Not Payment Successfully..");
			}
			
			else if(appchoice==3)
			{
				System.out.println("Enter UPI Id.");
				String upiId=so.next();
				System.out.println("Enter Pass");
				int pinNo=so.nextInt();
				for(int i=0;i<DataStore.payments.size();i++)
				{
					UPI o=(UPI) DataStore.payments.get(i);
					if(o.UPIID==upiId && o.appName.equalsIgnoreCase("phonepe"))
					{
						if(o.pinNo==pinNo && o.appName.equalsIgnoreCase("phonepe"))
								valid=true;
						else
							System.out.println("Invalid Pin.");
					}
					else {
						System.out.println("Invalid Upi Id.");
					}
				}
				if(valid)
					System.out.println("Payment SuccessFully..");
				else
					System.out.println("Not Payment Successfully..");
			}
			else if(appchoice==4)
			{
				System.out.println("Back..");
				return;
			}
			else {
				System.out.println("Invalid Option...");
			}
		}
		
	}

	@Override
	public void paymentStatus() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void refund() {
		// TODO Auto-generated method stub
		
	}

	


}
