import java.util.*;
public class boj_10025 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		int N=sc.nextInt();
		int K=sc.nextInt();
		int S=0;
		int ans=0;
		int arr[]=new int[1000010];
		for(int i=0;i<N;i++) {
			int g=sc.nextInt();
			int x=sc.nextInt();
			arr[x]=g; //arr[7]=4 arr[15]=10 arr[2]=2 arr[1]=5
		}
		K=K*2+1;//K��ŭ ������ �絿���̱� ������ //K��7
		                              //---��0--- >>7
		
		
		for(int i=0;i<=1000000;i++) {//1     2      7       8    
			if(i>=K) S-=arr[i-K];                  //S=7   S=6  (K��ŭ ������ �� �ֱ� ������ i-K�ΰ��� ���ش�.)     
			S+=arr[i];               //S=5   S=7   S=11    S=6
			ans=S>ans? S:ans;        //ans=5 ans=7 ans=11  ans=11
			//S�� ans�� ���� �� ū������ ans�� ������Ʈ�Ѵ�.
		}
		System.out.println(ans); //ans�� ����Ѵ�.
	}

}
