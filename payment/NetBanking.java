package payment;

import java.util.Scanner;

public class NetBanking implements Payment,Refundable,TrackPayment {
	private String bankName;
    private String accountNumber;
    private int bankBalance;
    
    public NetBanking()
    {}
    
    public NetBanking(String bankName,String accountNumber,int bankBalance)
	{
		this.bankName=bankName;
		this.accountNumber=accountNumber;
		this.bankBalance=bankBalance;
	}
    
    public void setBankName(String bankName)
    {
    	this.bankName=bankName;
    }
    
    public String getBankName()
    {
    	return this.bankName;
    }
    
    public void setAccountNumber(String accountNumber)
    {
    	this.accountNumber=accountNumber;
    }
    
    public String getAccountNumber()
    {
    	return this.accountNumber;
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
		
	}

	@Override
	public void refund() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void paymentStatus() {
		// TODO Auto-generated method stub
		
	}

}
