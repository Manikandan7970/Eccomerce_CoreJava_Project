package products;

import store.DataStore;

public class Books extends Product {
	private String author;
	private String publisher;
	private String language;
	private String edition;
	
	public Books()
	{}
    
    public Books(int productId,String productName,Category productCategory
    		,String productBrand,int productPrice,byte productDiscount,short productStock,
    		byte productGst,byte productRating,String productDescription,
    		String author,String publisher,String language,String edition,
    		Product product)
    {
    	super(productId,productName,productCategory
    		,productBrand,productPrice,productDiscount,productStock,
    		productGst,productRating,productDescription);
    	this.author=author;
    	this.publisher=publisher;
    	this.language=language;
    	this.edition=edition;
    }
    
    public void setAuthor(String author)
    {
    	this.author=author;
    }
    
    public String getAuthor()
    {
    	return this.author;
    }
    
    public void setPublisher(String publisher)
    {
    	this.publisher=publisher;
    }
    
    public String getPublisher()
    {
    	return this.publisher;
    }
    
    public void setLanguage(String language)
    {
    	this.language=language;
    }
    
    public String getLanguage()
    {
    	return this.language;
    }
    
    public void setEdition(String edition)
    {
    	this.edition=edition;
    }
    
    public String getEdition()
    {
    	return this.edition;
    }
    public String toString()
    {
    	return "\nProduct Id : "+this.getProductId()+"\nProduct Name : "+this.getProductName()
    	        +"\nProduct Author : "+this.author+"\nProduct Publisher : "+this.publisher
    	        +"\nProduct Language : "+this.language+"\nProduct Edition : "+this.edition
    			+"\nProduct Brand : "+this.getProductBrand()+"\nProduct Price : "+this.getProductPrice()
    			+"\nProduct Discount : "+this.getProductDiscount()
    			+"\nProduct Stock : "+this.getProductStock()+"\nProduct Gst : "+this.getProductGst()
    			+"\nProduct Rating : "+this.getProductRating()+"\nProduct Description : "+this.getProductDescription()
    	        +"\nProduct Category : "+this.getProductCategory()+"\n";
    }
    
	@Override
	public void displayProduct() {
		// TODO Auto-generated method stub
		for(int i=0;i<DataStore.products.size();i++)
			if(DataStore.products.get(i) instanceof Books)
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
