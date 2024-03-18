import java.util.*;
public class TheatreSquare{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
		long n=sc.nextLong();
		long m=sc.nextLong();
		long a=sc.nextLong();
		
		long r=(m+a-1)/a;
		long c=(n+a-1)/a;
		
		System.out.println(r*c);
	}
}
