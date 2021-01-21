import java.util.*;
public class boj_9663 {
	static int N,MAX=30,ans=0;
	static boolean isused1[]=new boolean[MAX]; // 같은 열 확인: i
	static boolean isused2[]=new boolean[MAX]; // /대각선 확인: depth+i 일치
	static boolean isused3[]=new boolean[MAX];// \대각선 확인: depth-i+N-1 일치(N-1은 depth-i를 최솟값으로 만들 수 있는 임의의 수)
	
	public static void solve(int depth) {
		if(depth==N) {
			ans++;
			return;
		}
		for(int i=0;i<N;i++) {
			if(isused1[i]||isused2[i+depth]||isused3[depth-i+N-1]) continue;
			isused1[i]=true; //썼다고 표시
			isused2[i+depth]=true;
			isused3[depth-i+N-1]=true;
			solve(depth+1); 
			isused1[i]=false; //또 써줘야하니까 false로 초기화
			isused2[i+depth]=false;
			isused3[depth-i+N-1]=false;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		N=sc.nextInt();
		solve(0);
		System.out.println(ans);
	}

}
