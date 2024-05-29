class OverLoadingTypePromotionIfMatching
{  
	void sum(long a,long b)
	{	
		System.out.println("long arg method invoked");
	}  
	void sum(int a,int b)
	{
		System.out.println("int arg method invoked");
	}  
	  
	public static void main(String args[])
	{  
		OverLoadingTypePromotionIfMatching obj = new OverLoadingTypePromotionIfMatching();  
		obj.sum(20,20);  
	}  
}  
