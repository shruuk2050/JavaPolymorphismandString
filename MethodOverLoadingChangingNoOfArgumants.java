	class MethodOverLoadingChangingNoOfArgumants
	{  
		void sum(int a,int b)
		{
			System.out.println(a+b);
		}  
	        void sum(int a,int b,int c)
		{
			System.out.println(a+b+c);
		}  
	  
	 	public static void main(String args[])
	 	{  
	 		MethodOverLoadingChangingNoOfArgumants obj = new MethodOverLoadingChangingNoOfArgumants();  
	 		obj.sum(10,10,10);  
	 		obj.sum(20,20);  
	 	}  
	}  
