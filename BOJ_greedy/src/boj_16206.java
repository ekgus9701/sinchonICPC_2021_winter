import java.util.*;
public class boj_16206 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int m=sc.nextInt();
		
		int [] arr=new int[n];
		int cut=0; //�ڸ� ��
		int eat=0; //���� �� �ִ� ������ũ ����(���̰� 10�� ������ũ ��)
		
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();

		}
		Arrays.sort(arr);
		for(int i=0;i<n;i++) { //1���ڸ����ڰ� 0�ΰ͵鸸 ����(0�ΰŸ� ���� ������� �̵�)
			if(cut==m) {
				break;
			}
			if(arr[i]==10) { //10�̶��
				eat+=1;  
			}
			else if(arr[i]==20) {
				eat+=2;
				cut+=1;
			}
			if(arr[i]%10==0&&(arr[i]!=10&&arr[i]!=20)) { //10���� ������ ��������
				while(cut!=m) { //�ڸ� �� �ִ� Ƚ���� ���Ҵٸ� �ݺ�
					if(arr[i]<10) { //10���� ������ �ǹ̾���
						break;
					}
					arr[i]-=10;
					cut+=1;
					
					if(arr[i]==10) {//20�� 2��(10,10)�� �����Ŵϱ� break
						eat+=2;
						break; 
					}
					else if(arr[i]>10) {
						eat+=1;	
					}
				}
			}
		}
		
		
		for(int i=0;i<n;i++) { //1���ڸ����ڰ� 0�� �ƴѰ�츦 ����		
			if(cut==m) {
				break;
			}
			
			if(arr[i]<10) continue;
			if(arr[i]%10 != 0) {
				while(cut!=m) {
					if(arr[i]<10)
						break;
					cut+=1;
					arr[i]-=10;
					eat+=1;					
				}
			}
		}
		System.out.println(eat);
	}

}
