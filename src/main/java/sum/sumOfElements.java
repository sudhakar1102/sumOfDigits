package sum;

public class sumOfElements {
	public static int sumOfDigits(int n)
	{
		int sum=0;
		while(n!=0)
		{
			int rem=n%10;
			sum+=rem;
			n=n/10;
		}
		return sum;
	}
}
