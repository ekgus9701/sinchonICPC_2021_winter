import java.util.*;
public class boj_1463 {
	public static long dp[]=new long [1000010];
	public static int N;
	public static long calc(int k) {
		if(k==2) {
			return dp[k]=1;
		}
		if(k==3) {
			return dp[k]=1;
		}

		long a=1000000000,b=1000000000,c=1000000000;
		if(k%3==0) {
			a=calc(k/3)+1;
		}
		if(k%2==0) {
			b=calc(k/2)+1;
		}
		
		c=calc(k-1)+1;

		return dp[k]=Math.min(Math.min(a, b), c);
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		N=sc.nextInt();
		
		System.out.println(calc(N));
		
		
	}

}
