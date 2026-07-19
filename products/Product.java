package products;
public abstract class Product {
	private int productId;
    private String productName;
    private String productBrand;
    private int productPrice;
    private short productStock;
    private byte productGst;
    private byte productRating;
    private byte productDiscount;
    private String productDescription;
    private Category productCategory;
    public Product()
    {}
    
    public Product(int productId,String productName,Category productCategory
    		,String productBrand,int productPrice,byte productDiscount,short productStock,
    		byte productGst,byte productRating,String productDescription)
    {
    	this.productId=productId;
    	this.productName=productName;
    	this.productCategory=productCategory;
    	this.productBrand=productBrand;
    	this.productPrice=productPrice;
    	this.productDiscount=productDiscount;
    	this.productStock=productStock;
    	this.productGst=productGst;
    	this.productRating=productRating;
    	this.productDescription=productDescription;
    }
    public void setProductId(int productId)
    {
    	this.productId=productId;
    }
    
    public int getProductId()
    {
    	return this.productId;
    }
    
    public void setProductName(String productName)
    {
    	this.productName=productName;
    }
    
    public String getProductName()
    {
    	return this.productName;
    }
    
    public void setProductCategory(Category productCategory)
    {
    	this.productCategory=productCategory;
    }
    
    public Category getProductCategory()
    {
    	return this.productCategory;    			
    }
    
    public void setProductBrand(String productBrand)
    {
    	this.productBrand=productBrand;
    }
    
    public String getProductBrand()
    {
    	return this.productBrand;
    }
    
    public void setProductPrice(int productPrice)
    {
    	this.productPrice=productPrice;
    }
    
    public int getProductPrice()
    {
    	return this.productPrice;
    }
    
    public void setProductDiscount(byte productDiscount)
    {
    	this.productDiscount=productDiscount;
    }
    
    public byte getProductDiscount()
    {
    	return this.productDiscount;
    }
    
    public void setProductStock(short productStock)
    {
    	this.productStock=productStock;
    }
    
    public short getProductStock()
    {
    	return this.productStock;
    }
    
    public void setProductGst(byte productGst)
    {
    	this.productGst=productGst;
    }
    
    public byte getProductGst()
    {
    	return this.productGst;
    }
    
    public void setProductRating(byte productRating)
    {
    	this.productRating=productRating;
    }
    
    public byte getProductRating()
    {
    	return this.productRating;
    }
    
    public void setProductDescription(String productDescription)
    {
    	this.productDescription=productDescription;
    }
    
    public String getProductDescription()
    {
    	return this.productDescription;
    }
    
    public String toString()
    {
    	return "\nProduct Id : "+this.productId+"\nProduct Name : "+this.productName
    			+"\nProduct Category : "+this.productCategory
    			+"\nProduct Brand : "+this.productBrand+"\nProduct Price : "+this.productPrice
    			+"\nProduct Discount : "+this.productDiscount
    			+"\nProduct Stock : "+this.productStock+"\nProduct Gst : "+this.productGst
    			+"\nProduct Rating : "+this.productRating+"\nProduct Description : "+this.productDescription;
    }
    
    public abstract void displayProduct();

    public abstract void calculatePrice();

    public abstract void updateStock();

    public abstract void checkAvailability();

}
