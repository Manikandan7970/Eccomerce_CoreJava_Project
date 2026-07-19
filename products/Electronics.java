package products;

import store.DataStore;

public class Electronics extends Product {
	private String warranty;
	private String voltage;
	private String power;
	private String model;
	
	public Electronics()
	{}
	
	public Electronics(int productId,String productName,Category productCategory
    		,String productBrand,int productPrice,byte productDiscount,short productStock,
    		byte productGst,byte productRating,String productDescription,
    		String warranty,String voltage,String power,String model,
    		Product product)
	{
		super(productId,productName,productCategory
	    		,productBrand,productPrice,productDiscount,productStock,
	    		productGst,productRating,productDescription);
		this.warranty=warranty;
		this.voltage=voltage;
		this.power=power;
		this.model=model;
	}
	
	public void setWarranty(String warrenty)
	{
		this.warranty=warrenty;
	}
	
	public String getWarranty()
	{
		return this.warranty;
	}
	
	public void setVoltage(String voltage)
	{
		this.voltage=voltage;
	}
	
	public String getVoltage()
	{
		return this.voltage;
	}
	
	public void setPower(String power)
	{
		this.power=power;
	}
	
	public String getPower()
	{
		return this.power;
	}
	
	public void setModel(String model)
	{
		this.model=model;
	}
	
	public String getModel()
	{
		return this.model;
	}
	public String toString()
    {
    	return "\nProduct Id : "+this.getProductId()+"\nProduct Name : "+this.getProductName()
    	        +"\nProduct Warrenty : "+this.warranty+"\nProduct Voltage : "+this.voltage
    	        +"\nProduct Power : "+this.power+"\nProduct Model : "+this.model
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
			if(DataStore.products.get(i)instanceof Electronics)
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
