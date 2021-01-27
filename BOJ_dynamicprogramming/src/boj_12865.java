import java.util.*;
public class boj_12865 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int N=sc.nextInt();
		int K=sc.nextInt();
		
		int W[]=new int [N+1];
		int V[]=new int [N+1];
		int dp[][]=new int[N+1][K+1];
		
		for(int i=1;i<=N;i++) {
			W[i]=sc.nextInt();
			V[i]=sc.nextInt();
		}
			
		for (int i = 1; i <= N; i++) {
			for (int j = 1; j <= K; j++) {
				
				// i��° ���Ը� �� ���� �� ���� ��� 
				if(W[i] > j) {
					dp[i][j] = dp[i - 1][j];
				}
				// i��° ���Ը� �� ���� �� �ִ� ��� 
				else {// ���� i���� ���� i���� ���� j-W[i]�� �� + ���� ��ġ(V[i])�� ū ���� ���� 
					dp[i][j] = Math.max(dp[i - 1][j], dp[i - 1][j - W[i]] + V[i]);
				}
				
			}
		}
		System.out.println(dp[N][K]);
	
	}

}
