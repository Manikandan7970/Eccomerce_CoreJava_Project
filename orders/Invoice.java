package orders;

import products.Product;
import users.Customer;

public class Invoice {
	private int invoiceNumber;
	private Orders order;
	private Customer customer;
	private Product items;
	private int GST;
	private int discount;
	private int grandTotal;
	
	public Invoice()
	{}
	
	public Invoice(int invoiceNumber,Orders order,Customer customer,Product items,
			int GST,int discount,int grandTotal)
	{
		this.invoiceNumber=invoiceNumber;
		this.order=order;
		this.customer=customer;
		this.items=items;
		this.GST=GST;
		this.discount=discount;
		this.grandTotal=grandTotal;
	}
	
	public void setInvoiceNumber(int invoiceNumber)
	{
		this.invoiceNumber=invoiceNumber;
	}
	
	public int getInvoiceNumber()
	{
		return this.invoiceNumber;
	}
	
	public void setOrder(Orders order)
	{
		this.order=order;
	}
	
	public Orders getOrder()
	{
		return this.order;
	}
	
	public void setCustomer(Customer customer)
	{
		this.customer=customer;
	}
	
	public Customer getCustomer()
	{
		return this.customer;
	}
	
	public void setItems(Product items)
	{
		this.items=items;
	}
	
	public Product getItems()
	{
		return this.items;
	}
	
	public void setGST(int GST)
	{
		this.GST=GST;
	}
	
	public int getGST()
	{
		return this.GST;
	}
	
	public void setDiscount(int discount)
	{
		this.discount=discount;
	}
	
	public int getDiscount()
	{
		return this.discount;
	}
	
	public void setGrandTotal(int grandTotal)
	{
		this.grandTotal=grandTotal;
	}
	
	public int getGrandTotal()
	{
		return this.grandTotal;
	}
	
	public void viewInvoice()
	{
		
	}
	public void printInvoice()
	{
		
	}

	public void calculateGST()
	{
		
	}

	public void calculateFinalAmount()
	{
		
	}

}
