package users;

public class PremiumCustomer extends Customer implements MembershipBenefits,Rewardable {
	private int extraDiscount;
	private boolean freeShiping;
	private int rewardMultiplier;
	
	public PremiumCustomer()
	{}
	
	public PremiumCustomer(int userId,String userName, String userEmail,
			String userPassword,String userPhone,char userGender,
			boolean userActive,String userStatus,short rewardPoints,
			String membershipType,int extraDiscount,boolean freeShiping,
			int rewardMultiplier)
	{
		super(userId,userName,userEmail,userPassword,userPhone,userGender,
				userActive,userStatus,rewardPoints,membershipType);
		this.extraDiscount=extraDiscount;
		this.freeShiping=freeShiping;
		this.rewardMultiplier=rewardMultiplier;
	}
	
	public void setExtraDiscount(int extraDiscount)
	{
		this.extraDiscount=extraDiscount;
	}
	
	public int getExtraDiscount()
	{
		return this.extraDiscount;
	}
	
	public void setFreeShiping(boolean freeShiping)
	{
		this.freeShiping=freeShiping;
	}
	
	public boolean getFreeShiping()
	{
		return this.freeShiping;
	}
	
	public void setrewardMultiplier(int rewardMultiplier)
	{
		this.rewardMultiplier=rewardMultiplier;
	}
	
	public int getRewardMultiplier()
	{
		return this.rewardMultiplier;
	}
	
	public void calculateTotal()
    {
    	
    }

	public void redeemPoints()
	{
		
	}

	public void upgradeMembership()
	{
		
	}

	@Override
	public void freeShipping() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void extraDiscount() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void redeemReward() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void earnrewardPoints() {
		// TODO Auto-generated method stub
		
	}
	
	public String toString()
	{
		return "\nUser Id : "+this.getUserId()+"\nUser Name : "+this.getUserName()+
				"\nUser Email : "+this.getUserEmail()+"\nUser Password : "+this.getUserPassword()+
				"\nUser Phone : "+this.getUserPhone()+"\nUser Gender : "+this.getUserGender()+
				"\nUser Status : "+this.getUserStatus() +"\nUser Active : "+this.getUserActive()+
				"\nReward Points : "+this.getRewardPoints()+"\nMembership Type : "+
				this.getMemberShipType()+"\nExtra Discount : "+this.extraDiscount+"\nFree Shiping : "+
	            this.freeShiping+"\nReward Multiplier : "+this.rewardMultiplier+"\n";
	}
	
	
}
