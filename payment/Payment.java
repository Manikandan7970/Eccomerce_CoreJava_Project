package payment;

import java.util.Scanner;

public interface Payment {
	public void pay(Scanner so);
	
//	Payment is an interface because it defines a common contract
//	(pay(), refund(), paymentStatus()) for all payment methods.
//	Classes like UPI, Card, CashOnDelivery, and 
//	NetBanking implement this interface and 
//	provide their own payment-specific behavior 
//	while sharing the same method names.

}
