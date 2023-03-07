package programs;

public class PrimeMethod {
	
	static boolean prime(int n)
	{
		boolean flag=false;
		
		
		if(n==0||n==1)
			System.out.println("the given number"+n+ "is not prime");
		else{
			for(int i=2;i<n/2;i++)
			{
				if(n%i==0)
					flag=false;
			}
			if(flag)
				System.out.println("not prime");
			else
				System.out.println("prime");
		}
		
		return flag;
	}

	public static void main(String args[])
	{
		prime(29);
		
	}
}
