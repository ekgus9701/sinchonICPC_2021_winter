import java.util.*;
public class boj_11399 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		int N=sc.nextInt();
		int ans=0;
		int [] P = new int[N];
		for(int i=0;i<N;i++) {
			P[i]=sc.nextInt(); //�ް�
		}
		
		Arrays.sort(P); //������������ sort
		while(true) {
			if(N<0) {
				break;
			}
			//ū�ͺ��� N�� ���ҽ�Ű�鼭 for���� �̿��� ����
			for(int i=0;i<N;i++) {
				ans+=P[i]; 
			}
			N--;
		}
		
		System.out.println(ans);
	}

}
