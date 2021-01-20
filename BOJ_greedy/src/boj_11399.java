import java.util.*;
public class boj_11399 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		int N=sc.nextInt();
		int ans=0;
		int [] P = new int[N];
		for(int i=0;i<N;i++) {
			P[i]=sc.nextInt(); //받고
		}
		
		Arrays.sort(P); //오름차순으로 sort
		while(true) {
			if(N<0) {
				break;
			}
			//큰것부터 N을 감소시키면서 for문을 이용해 더함
			for(int i=0;i<N;i++) {
				ans+=P[i]; 
			}
			N--;
		}
		
		System.out.println(ans);
	}

}
