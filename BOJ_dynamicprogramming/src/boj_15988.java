import java.util.*;
public class boj_15988 {
	
	static int T;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int MOD=1000000009,t;
		int n;
		long dp[]=new long[1000010];
		dp[1]=1;dp[2]=2;dp[3]=4;
		for(int i=4;i<=1000000;i++) {
			dp[i]+=dp[i-1]+dp[i-2]+dp[i-3]; //n을 만드는 방법의 수 
		//마지막에             +1      +2      +3     을 하면 dp[i]가 된다.
			dp[i]%=MOD;
		}
		T=sc.nextInt();
		
		while(true) {
			if(T<=0)
				break;
			n=sc.nextInt();
			System.out.println(dp[n]);
			T--;
		}
	}

}
