package cart;
import products.Product;
import store.DataStore;
import users.Customer;

public class CartItems {
	private Product product;
	private int quantity;
	private int price;
	private int discount;
	private int subtotal;
	
	public CartItems()
	{}
	
	public CartItems(Product product,int quantity,
			int price,int discount,int subtotal)
	{
		this.product=product;
		this.quantity=quantity;
		this.price=price;
		this.discount=discount;
		this.subtotal=subtotal;
	}
	
	public void setProduct(Product product)
	{
		this.product=product;
	}
	
	public Product getProducts()
	{
		return this.product;
	}
	
	public void setQuantity(int quantity)
	{
		this.quantity=quantity;
	}
	
	public int getQuantity()
	{
		return this.quantity;
	}
	
	public void setPrice(int price)
	{
		this.price=price;
	}
	
	public int getPrice()
	{
		return this.price;
	}
	
	public void setDiscount(int discount)
	{
		this.discount=discount;
	}
	
	public int getDiscount()
	{
		return this.discount;
	}
	
	public void setSubtotal(int subtotal)
	{
		this.subtotal=subtotal;
	}
	
	public int getSubtotal()
	{
		return this.subtotal;
	}
	
	public String toString()
	{
		return "\nProduct Id : "+this.product.getProductId()
	            +"\nProduct Category : "+this.product.getProductCategory().getCategoryName()
				+"\nProduct Name : "+this.product.getProductName()
				+"\nQuantity : "+this.quantity
				+"\nPrice : "+this.price
				+"\nDiscount : "+this.discount
				+"\nSub Total : "+this.subtotal+"\n";
	}
	public int calculateSubtotal(Product p,int discountAmount,int quantity)
	{
		return (p.getProductPrice()*quantity)-(discountAmount*quantity);
	}
	
	public int calculateDiscount(Product p)
	{
		int discount =(p.getProductPrice()/100)*p.getProductDiscount();
		return discount;
	}
	
	public void displayItem(Customer c)
	{
		for(int j=0;j<DataStore.Allcarts.size();j++)
		{
			if(DataStore.Allcarts.get(j).getCustomer().getUserId()==c.getUserId())
				System.out.println(DataStore.Allcarts.get(j));
		}
	}
}
