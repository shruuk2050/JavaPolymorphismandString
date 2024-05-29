class OverloadingChangingReturnTypeOfMethod
{  
	int sum(int a,int b)
	{
		System.out.println(a+b);
	}  
	double sum(int a,int b)
	{
		System.out.println(a+b);
	}  
	public static void main(String args[])
	{  
		OverloadingChangingReturnTypeOfMethod obj = new OverloadingChangingReturnTypeOfMethod();  
		int result = obj.sum(20,20);  
	  
	}  
}  
