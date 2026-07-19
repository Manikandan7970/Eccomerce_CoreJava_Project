package payment;

import java.util.Scanner;

public class Card implements Payment,Refundable,TrackPayment{
	String cardNumber;
	String cardHolder;
    String expiryDate;
    int CVV;
    private int bankBalance;

    public Card()
    {}
	public Card(String cardNumber,String cardHolder,String expiryDate,int CVV,int bankBalance)
	{
		this.cardNumber=cardNumber;
		this.cardHolder=cardHolder;
		this.expiryDate=expiryDate;
		this.CVV=CVV;
		this.bankBalance=bankBalance;
	}
	
	public void setCardNumber(String cardNumber)
	{
		this.cardNumber=cardNumber;
	}
	
	public String getCardNumber()
	{
		return this.cardNumber;
	}
	
	public void setCardHolder(String cardHolder)
	{
		this.cardHolder=cardHolder;
	}
	
	public String getCardHolder()
	{
		return this.cardHolder;
	}
	
	public void setExpiryDate(String expiryDate)
	{
		this.expiryDate=expiryDate;
	}
	
	public String getExpiryDate()
	{
		return this.expiryDate;
	}
	
	public void setCVV(int CVV)
	{
		this.CVV=CVV;
	}
	
	public int getCVV()
	{
		return this.CVV;
	}
	
	public void setBankBalance(int bankBalance)
	{
		this.bankBalance=bankBalance;
	}
	
	public int getBankBalance()
	{
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
