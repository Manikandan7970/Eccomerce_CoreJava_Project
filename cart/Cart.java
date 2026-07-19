package cart;
import java.util.ArrayList;
import java.util.Scanner;
import products.Product;
import store.DataStore;
import users.Customer;

public class Cart {
	private int cartID;
	private Customer customer;
	private int totalItems;
	private int totalPrice;
	private ArrayList<CartItems> cartItems=new ArrayList<>();
    
    public Cart()
    {}
    
    public Cart(int cartID,Customer customer,ArrayList<CartItems> cartItems,int totalItems,int totalPrice)
    {
    	this.cartID=cartID;
    	this.customer=customer;
    	this.cartItems=cartItems;
    	this.totalItems=totalItems;
    	this.totalPrice=totalPrice;
    }
    
    public void setCartId(int cartID)
    {
    	this.cartID=cartID;
    }
    
    public int getCartId()
    {
    	return this.cartID;
    }
    
    public void setCustomer(Customer customer)
    {
    	this.customer=customer;
    }
    
    public Customer getCustomer()
    {
    	return this.customer;
    }
    
    public void setCartItems(ArrayList<CartItems> cartItems)
    {
    	this.cartItems=cartItems;
    }
    
    public ArrayList<CartItems> getCartItems()
    {
    	return this.cartItems;
    }
    
    public void setTotalItems(int totalItems)
    {
    	this.totalItems=totalItems;
    }
    
    public int gettotalItems()
    {
    	return this.totalItems;
    }
    
    public void setPrice(int totalprice)
    {
    	this.totalPrice=totalprice;
    }
    
    public int getTotalPrice()
    {
    	return this.totalPrice;
    }
    
    public String toString()
    {
    	return ""+this.cartItems;
    }
    
    public void addProductToCart(Scanner so,Customer c)
	{
	    System.out.print("\nEnter Product Id : ");
	    int productId = so.nextInt();

	    System.out.print("\nEnter Quantity : ");
	    int quantity = so.nextInt();

	    boolean cartFound = false;
	    boolean productFound = false;
	    for (Product product : DataStore.products)
	    {
	        if (product.getProductId() == productId)
	        {
	            productFound = true;

	            int discount = new CartItems().calculateDiscount(product);
	            int subtotal = new CartItems().calculateSubtotal(product, discount, quantity);

	            CartItems cartItem = new CartItems(
	                    product,
	                    quantity,
	                    product.getProductPrice(),
	                    discount,
	                    subtotal);

	            // Existing cart
	            for (Cart cart : DataStore.Allcarts)
	            {
	                if (cart.getCustomer().getUserId() == c.getUserId())
	                {
	                    cartFound = true;

	                    cart.setPrice(cart.getTotalPrice()+subtotal);
	                    cart.setTotalItems(cart.gettotalItems()+quantity);
	                    
	                    cart.getCartItems().add(cartItem);

	                    System.out.println("\nProduct added to cart successfully...");
	                    return;
	                }
	            }

	            // New cart
	            if (!cartFound)
	            {
	                ArrayList<CartItems> cartItems = new ArrayList<>();
	                cartItems.add(cartItem);

	                Cart cart = new Cart(
	                        10001,
	                        c,
	                        cartItems,
	                        quantity,
	                        subtotal);

	                DataStore.Allcarts.add(cart);

	                System.out.println("Product added to cart successfully.");
	                return;
	            }
	        }
	    }

	    if (!productFound)
	    {
	        System.out.println("Product Not Found.");
	    }
	}
    
    public void removeProductFromCart(Scanner so,Customer c)
	{
		 System.out.print("\nEnter Product Id : ");
		    int productId = so.nextInt();
		    
		    boolean cartFound=false;
		    boolean productFound=false;
		    int itemPrice=0;
		    int itemsCount=0;
		    for(Cart cart : DataStore.Allcarts)
		    {
		    	if(cart.getCustomer()==c)
		    	{
		    		cartFound=true;
		    		for(int i=0;i<cart.getCartItems().size();i++)
		    		{
		    			if(cart.getCartItems().get(i).getProducts().getProductId()==productId)
		    			{
		    				productFound=true;
		    				itemPrice=cart.getCartItems().get(i).getSubtotal();
		    				itemsCount=cart.getCartItems().get(i).getQuantity();
		    				cart.getCartItems().remove(i);
		    				System.out.println("Product Removed Successfully...");
		    				
		    			}
		    		}
		    		
		    		if(!productFound)
		    		{
		    			System.out.println("Product Not Found..");
		    		}
		    		
		    		cart.setPrice(cart.getTotalPrice()-itemPrice);
		    		cart.setTotalItems(cart.gettotalItems()-itemsCount);
		    	}
		    }
		    
		    if(!cartFound)
		    {
		    	System.out.println("You Have No Cart...");
		    }
	}
    
    public void viewCart(Scanner so,Customer c)
	{
		System.out.println("=========================================================\n"
				          +"                    SHOPSPHERE CART\n"
				         + "=========================================================\n");
		System.out.println("  ===================== My Cart ====================== ");
		
		for(int i=0;i<DataStore.Allcarts.size();i++)
		{
			if(DataStore.Allcarts.get(i).getCustomer().getUserId()==c.getUserId())
					System.out.println("\nCart Id : "+DataStore.Allcarts.get(i).getCartId()+
							"\nCustomer : "+DataStore.Allcarts.get(i).getCustomer().getUserId()
							+"\nCustomer Name : "+DataStore.Allcarts.get(i).getCustomer().getUserName()+"\n");
			
		}
		
		System.out.println("  ------------------ Cart Items ---------------------- ");
		
		new CartItems().displayItem(c);
		
		System.out.println("  ------------------ Total Price --------------------- ");
		for(int k=0;k<DataStore.Allcarts.size();k++)
		{
			if(DataStore.Allcarts.get(k).getCustomer().getUserId()==c.getUserId())
			{
				System.out.println("\nTotal Items : "+(DataStore.Allcarts.get(k).gettotalItems())
				+"\nTotal Price : "+(DataStore.Allcarts.get(k).getTotalPrice()));
				
			}
		}
		System.out.println("\n  ==================================================== \n");
		
		System.out.println("\n1.Remove Product From Cart\n2.Update Cart Quantity\n3.Clear Cart.\n4.Back");
		int cartOption=so.nextInt();
		switch(cartOption)
		{
		case 1:removeProductFromCart(so,c);
		break;
		case 2:updateCartQuantity(so,c);
		break;
		case 3:clearCart(c);
		}
	}
    
    public void updateCartQuantity(Scanner so,Customer c)
	{
		System.out.print("\nEnter Product Id :");
		int productId=so.nextInt();
		System.out.print("\nEnter Quantity :");
		int quantity=so.nextInt();
		boolean cartFound=false;
		boolean productFound=false;
		int oldItem=0;
		int oldAmount=0;
		int updateAmount=0;
		for(Cart cart:DataStore.Allcarts)
		{
			if(cart.getCustomer().getUserId()==c.getUserId())
			{
				cartFound=true;
				for(CartItems cartitem : cart.getCartItems())
				{
					if(cartitem.getProducts().getProductId()==productId)
					{
						productFound=true;
						
						oldItem=cartitem.getQuantity();
						oldAmount=cartitem.getSubtotal();
						
						cartitem.setQuantity(quantity);
						cartitem.setSubtotal(cartitem.calculateSubtotal
								(cartitem.getProducts(), 
								cartitem.getDiscount(), 
								quantity));
						
						updateAmount=cartitem.calculateSubtotal
								(cartitem.getProducts(), 
								cartitem.getDiscount(), 
								quantity);
						System.out.println("Updated Cart Quantity..");
					}
					
				}
				if(!productFound)
				{
					System.out.println("Product Not Found In Your Cart..");
				}
				
				cart.setTotalItems((cart.gettotalItems()-oldItem)+quantity);
				cart.setPrice((cart.getTotalPrice()-oldAmount)+updateAmount);
			}
		}
		
		if(!cartFound)
		{
			System.out.println("You Have No Cart..");
			System.out.println("Please Add Item to Cart..");
		}
		
	}

    public void clearCart(Customer c)
	{
		for(Cart cart :DataStore.Allcarts)
		{
			if(cart.getCustomer()==c)
			{
				cart.getCartItems().clear();
				cart.setPrice(0);
				cart.setTotalItems(0);
				System.out.println("Cart Cleared Successfully...");
			}
		}
	}

    

    public int calculateTotal(Cart c)
    {
    	int cartItemstotalPrice=0;
    	for(CartItems cartitems : c.getCartItems())
        	cartItemstotalPrice+=cartitems.getPrice();
    	return cartItemstotalPrice;
    }

}
