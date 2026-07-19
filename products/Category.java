package products;

public class Category {
	private int categoryId;
	private String categoryName;
	private String description;
	
	public Category()
	{}

	public Category(int categoryId,String categoryName,String description)
	{
		this.categoryId=categoryId;
		this.categoryName=categoryName;
		this.description=description;
		
//		Category is an independent class that stores category information 
//		(categoryId, categoryName, and description). 
//		Each Product has a reference to one Category, 
//		while one Category can be associated with many product
//		(a one-to-many relationship).`
	}
	
	public void setCategoryId(int categoryId)
	{
		this.categoryId=categoryId;
	}
	
	public int getCategoryId()
	{
		return this.categoryId;
	}
	
	public void setCategoryName(String categoryName)
	{
		this.categoryName=categoryName;
	}
	
	public String getCategoryName()
	{
		return this.categoryName;
	}
	
	public void setDescription(String description)
	{
		this.description=description;
	}
	
	public String getDescription()
	{
		return this.description;
	}
	
	public String toString()
	{
		return "\nCategory Id : "+this.categoryId+"\nCategory Name : "+this.categoryName
				+"\nCategory Description : "+this.description;
	}
	
	public void displaycategory(Product p)
	{
		System.out.println("\nCategory Id : "+p.getProductCategory().categoryId
				+"\nCategory Name : "+p.getProductCategory().categoryName
				+"\nCategory Discription : "+p.getProductCategory().getDescription()+"\n");
	}
}
