import java.util.*;

class main
{
	
	public static int gcd(int m, int n)
	{
		if (m > n) return gcd(n,m);
		if (m == n) return m;
		if (m == 0) return n;
		if (m == 1) return 1;
		
		return gcd(m, n%m);
	}


	public static void main(String[] args)
	{

		Scanner sc = new Scanner(System.in);

		int m = sc.nextInt();
		int n = sc.nextInt();

		System.out.println(gcd(m,n));
	}
}
