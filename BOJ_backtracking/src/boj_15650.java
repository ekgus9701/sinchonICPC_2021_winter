import java.util.Scanner;

public class boj_15650 {
	static int N,M,MAX=10;
	static int answer[]=new int [MAX];
	public static void solve(int depth, int num) {
		if(depth==M) {
			for(int i=0;i<M;i++) {
				System.out.print(answer[i]+" ");
			}
			System.out.println(); return;
		}
		for(int i=num;i<=N;i++) {
			answer[depth]=i;
			solve(depth+1,i+1);//Àç±Í
			
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc = new Scanner(System.in);
	      
	       N=sc.nextInt();
	       M=sc.nextInt();
	      
	      solve(0,1);
	      sc.close();
	}

}
