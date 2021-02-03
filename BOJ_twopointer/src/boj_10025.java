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
		K=K*2+1;//K만큼 떨어진 양동이이기 때문에 //K는7
		                              //---곰0--- >>7
		
		
		for(int i=0;i<=1000000;i++) {//1     2      7       8    
			if(i>=K) S-=arr[i-K];                  //S=7   S=6  (K만큼 떨어질 수 있기 때문에 i-K인것을 빼준다.)     
			S+=arr[i];               //S=5   S=7   S=11    S=6
			ans=S>ans? S:ans;        //ans=5 ans=7 ans=11  ans=11
			//S와 ans를 비교해 더 큰것으로 ans를 업데이트한다.
		}
		System.out.println(ans); //ans를 출력한다.
	}

}
