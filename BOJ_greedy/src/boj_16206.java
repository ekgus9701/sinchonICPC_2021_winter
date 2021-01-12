import java.util.*;
public class boj_16206 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int m=sc.nextInt();
		
		int [] arr=new int[n];
		int cut=0; //자른 수
		int eat=0; //먹을 수 있는 롤케이크 개수(길이가 10인 롤케이크 수)
		
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();

		}
		Arrays.sort(arr);
		for(int i=0;i<n;i++) { //1의자리숫자가 0인것들만 생각(0인거를 먼저 따져줘야 이득)
			if(cut==m) {
				break;
			}
			if(arr[i]==10) { //10이라면
				eat+=1;  
			}
			else if(arr[i]==20) {
				eat+=2;
				cut+=1;
			}
			if(arr[i]%10==0&&(arr[i]!=10&&arr[i]!=20)) { //10으로 나누어 떨어지면
				while(cut!=m) { //자를 수 있는 횟수가 남았다면 반복
					if(arr[i]<10) { //10보다 작으면 의미없음
						break;
					}
					arr[i]-=10;
					cut+=1;
					
					if(arr[i]==10) {//20을 2개(10,10)로 나눈거니까 break
						eat+=2;
						break; 
					}
					else if(arr[i]>10) {
						eat+=1;	
					}
				}
			}
		}
		
		
		for(int i=0;i<n;i++) { //1의자리숫자가 0이 아닌경우를 따짐		
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
