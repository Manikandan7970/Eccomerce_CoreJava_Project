package products;

import store.DataStore;

public class Fashion extends Product {
	private byte size;
	private String color;
	private String material;
	
	public Fashion()
	{}
	
	public Fashion(int productId,String productName,Category productCategory
    		,String productBrand,int productPrice,byte productDiscount,short productStock,
    		byte productGst,byte productRating,String productDescription,
    		byte size,String color,String material,Product product)
	{
		super(productId,productName,productCategory
	    		,productBrand,productPrice,productDiscount,productStock,
	    		productGst,productRating,productDescription);
		this.size=size;
		this.color=color;
		this.material=material;
	}
	
	public void setSize(byte size)
	{
		this.size=size;
	}
	
	public byte setSize()
	{
		return this.size;
	}
	
	public void setColor(String color)
	{
		this.color=color;
	}
	
	public String getColor()
	{
		return this.color;
	}
	
	public void setMaterial(String material)
	{
		this.material=material;
	}
	
	public String getMaterial()
	{
		return this.material;
	}
	public String toString()
    {
    	return "\nProduct Id : "+this.getProductId()+"\nProduct Name : "+this.getProductName()
    	        +"\nProduct Size : "+this.size+"\nProduct Color : "+this.color+"\nProduct Material : "+this.material
    			+"\nProduct Brand : "+this.getProductBrand()+"\nProduct Price : "+this.getProductPrice()
    			+"\nProduct Discount : "+this.getProductDiscount()
    			+"\nProduct Stock : "+this.getProductStock()+"\nProduct Gst : "+this.getProductGst()
    			+"\nProduct Rating : "+this.getProductRating()+"\nProduct Description : "+this.getProductDescription()
    	        +"\nProduct Category : "+this.getProductCategory().toString()+"\n";
    }
    
	@Override
	public void displayProduct() {
		// TODO Auto-generated method stub
		for(int i=0;i<DataStore.products.size();i++)
			if(DataStore.products.get(i) instanceof Fashion)
				System.out.println(DataStore.products.get(i));
	}
	@Override
	public void calculatePrice() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void updateStock() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void checkAvailability() {
		// TODO Auto-generated method stub
		
	}

}
