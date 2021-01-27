/*������ ���̸� �������� ��緹�̸� ������� �� ���� �� �ִ� ��緹���� ������ M�� ���ų� ū ���
�ٽ� ������ ���̸� �� ũ�� �Ͽ� ���� ���θ� ã�´�.
������ ���̰� �ʹ� ū ��� ��緹���� ������ M���� ���� ���� ���´�. �� ��� �ٽ� ������ ���̸� �ٿ� Ž���Ѵ�.
*/

import java.util.*;
public class boj_2343 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int N=sc.nextInt();
		int M=sc.nextInt();
		int lesson[]=new int[N];
		
		int left=0,right=0;
		for(int i=0;i<N;i++) {
			lesson[i]=sc.nextInt();
			right+=lesson[i];
			if(left<lesson[i])
				left=lesson[i];
			//���� left:9 right:45
		}
		
		while(left<=right) {
			int mid=(left+right)/2; //������ �� mid
			int sum=0;
			int cnt=0;
			
			//binary search�� mid���� ���� ������ ���Ѵ�.
			for(int i=0;i<N;i++) {
				if(sum+lesson[i]>mid) {
					sum=0;
					cnt++;
				}
				sum+=lesson[i];
			}
			if(sum!=0)
				cnt++;
			if(cnt<=M) //���� ������ m���� ������
				right=mid-1; //�ִ� ����(���� ���̸� ���ҽ�Ų��.)
			else //���� ������ m���� ũ��
				left=mid+1; //�ּڰ� ����(���� ���̸� ������Ų��)
			
		}
		System.out.println(left);
	}

}
