package payment;

import java.util.Scanner;

public class CashOnDelivery implements Payment,Refundable,TrackPayment {
	int cashCollected;
	int balanceReturned;
	public CashOnDelivery()
	{}
	public CashOnDelivery(int cashCollected,int balanceReturned)
	{
		this.cashCollected=cashCollected;
		this.balanceReturned=balanceReturned;
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
