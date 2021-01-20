import java.util.*;
public class boj_11047 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int K=sc.nextInt();
		int ans=0;
		Integer []A = new Integer[N];
		
		for(int i=0;i<N;i++) {
			A[i]=sc.nextInt();
		}
		
		Arrays.sort(A,Collections.reverseOrder());
		
		for(int i=0;i<N;i++) {
			ans+=K/A[i];
			K%=A[i];
			if(K<=0) {
				break;
			}
		}
		
		System.out.println(ans);
		
		
		
	}

}
