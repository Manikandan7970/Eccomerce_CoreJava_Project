package orders;

public class Discount {
	private String coupen;
	private int discountPercentage;
	private int membershipDiscount;
	private int festivalDiscount;
	
//	The Discount class centralizes all discount-related logic. 
//	It stores coupon information and different types of discounts 
//	(coupon, membership, and festival) and provides methods to validate coupons 
//	and calculate the final discounted price, making the code reusable and 
//	easier to maintain.
	public Discount()
	{}
	
	public Discount(String coupen,int discountPercentage,
			int membershipDiscount,int festivalDiscount)
	{
		this.coupen=coupen;
		this.discountPercentage=discountPercentage;
		this.membershipDiscount=membershipDiscount;
		this.festivalDiscount=festivalDiscount;
	}
	
	public void setCoupen(String coupen)
	{
		this.coupen=coupen;
	}
	
	public String getCoupen()
	{
		return this.coupen;
	}
	
	public void setDiscountPercentage(int discountPercentage)
	{
		this.discountPercentage=discountPercentage;
	}
	
	public int getDiscountPercentage()
	{
		return this.discountPercentage;
	}
	
	public void setMembershipDiscount(int membershipDiscount)
	{
		this.membershipDiscount=membershipDiscount;
	}
	
	public int getMembershipDiscount()
	{
		return this.membershipDiscount;
	}
	
	public void setFestivalDiscount(int festivalDiscount)
	{
		this.festivalDiscount=festivalDiscount;
	}
	
	public int getFestivalDiscount()
	{
		return this.festivalDiscount;
	}
	
	public void calculateDiscount() 
	{
		
	}
	public void validateCoupon()
	{
		
	}
}
