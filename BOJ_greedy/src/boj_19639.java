import java.util.*;
public class boj_19639 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int X=sc.nextInt();
		int Y=sc.nextInt();
		int M=sc.nextInt();
		int M1=M;
		int i=0,j=0;
		int minus=0,plus=0;
		
		Integer hp[]=new Integer[X];
		Integer heal[]=new Integer[Y];
		
		
		for(int k=0;k<X;k++) {
			hp[k]=sc.nextInt();
			minus+=hp[k];
			
		}
		
		for(int l=0;l<Y;l++) {
			heal[l]=sc.nextInt();
			plus+=heal[l];
			
		}
		
		if(10-minus+plus<=0) { //ü��+ȸ����-�ҰԵǴ� ü���� 0���� ������
			System.out.println(0);
			System.exit(0);
		}
		
		if(X==0) {//X�� 0���� ������
			for(int k=0;k<Y;k++) {
				System.out.println(k+1);//Y�� �ش��ϴ� ���� ���
				if(k==Y-1) {
				System.exit(0);
				}
			}
		}
		
		if(Y==0) {//Y�� 0���� ������
			for(int k=0;k<X;k++) {
				System.out.println(k+1);//X�� �ش��ϴ� ���� ���
				if(k==X-1) {
					System.exit(0);
					}
			}
		}

		
		while(true) {
			
			if(i==X&&j==Y) { //��ο� �ο�� ������ �� ������
				break;
			}
			if(i==X) { //��ο� �ο����� ���� ������ ��������
				M+=heal[j];
				System.out.println(j+1);
				j++;
			}
			if(i!=X) { //��ο� �ο����ʾ�����
				if(M-hp[i]>0) { //i��° ����� �ο� ���� ü���� 0���� ũ�ٸ� 
					M-=hp[i]; //i��° ����� �ο��
					System.out.println("-"+(i+1));
					i++; //��������� �ο����ϹǷ� i�� ����
				}
				else {//i��° ����� �ο� ���� ü���� 0���� �۱⶧���� 
					M+=heal[j]; //������ �Դ´�
					System.out.println(j+1);
					j++; //������������ �Ѿ��
				}
			}
			
			
		}
	}

}
