import java.util.*;
public class boj_9663 {
	static int N,MAX=30,ans=0;
	static boolean isused1[]=new boolean[MAX]; // ���� �� Ȯ��: i
	static boolean isused2[]=new boolean[MAX]; // /�밢�� Ȯ��: depth+i ��ġ
	static boolean isused3[]=new boolean[MAX];// \�밢�� Ȯ��: depth-i+N-1 ��ġ(N-1�� depth-i�� �ּڰ����� ���� �� �ִ� ������ ��)
	
	public static void solve(int depth) {
		if(depth==N) {
			ans++;
			return;
		}
		for(int i=0;i<N;i++) {
			if(isused1[i]||isused2[i+depth]||isused3[depth-i+N-1]) continue;
			isused1[i]=true; //��ٰ� ǥ��
			isused2[i+depth]=true;
			isused3[depth-i+N-1]=true;
			solve(depth+1); 
			isused1[i]=false; //�� ������ϴϱ� false�� �ʱ�ȭ
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
