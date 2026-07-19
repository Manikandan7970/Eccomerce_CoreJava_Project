package orders;

import java.util.Date;
import payment.Payment;
import products.Product;
import users.Customer;

public class Orders {
	private int orderID;
	private Customer customer;
	private Product product;
	private Date orderDate;
	private String status;
	private Payment payment;
	private int totalAmount;
	
	public Orders()
	{}
	
	public Orders(int orderID,Customer customer,Product product,
			Date orderDate,String status,Payment payment,int totalAmount)
	{
		this.orderID=orderID;
		this.orderDate=orderDate;
		this.customer=customer;
		this.product=product;
		this.orderDate=orderDate;
		this.status=status;
		this.payment=payment;
		this.totalAmount=totalAmount;
	}
	
	public void setOrderId(int orderID)
	{
	    this.orderID=orderID;
	}
	
	public int getOrderID()
	{
		return this.orderID;
	}
	
	public void setCustomer(Customer customer)
	{
		this.customer=customer;
	}
	
	public Customer getCustomer()
	{
		return this.customer;
	}
    
	public void setProduct(Product product)
	{
		this.product=product;
	}
	
	public Product getProduct()
	{
		return this.product;
	}
	
	public void setOrderDate(Date orderDate)
	{
		this.orderDate=orderDate;
	}
	
	public Date getOrderDate()
	{
		return this.orderDate;
	}
	
	public void setStatus(String status)
	{
		this.status=status;
	}
	
	public String getStatus()
	{
		return this.status;
	}
	
	public void setPayment(Payment payment)
	{
		this.payment=payment;
	}
	
	public Payment getPayment()
	{
		return this.payment;
	}
	
	public void setTotalAmount(int totalAmount)
	{
		this.totalAmount=totalAmount;
	}
	
	public int getTotalAmount()
	{
		return this.totalAmount;
	}
	
	public void viewOrders()
	{
		
	}
	
    public void placeOrder()
    {
    	
    }

    public void cancelOrder()
    {
    	
    }

    public void generateInvoice()
    {
    	
    }

    public void updateStatus()
    {
    	
    }
    
}
