/*레슨의 길이를 기준으로 블루레이를 만들었을 때 만들 수 있는 블루레이의 개수가 M과 같거나 큰 경우
다시 레슨의 길이를 더 크게 하여 가능 여부를 찾는다.
레슨의 길이가 너무 큰 경우 블루레이의 개수가 M보다 작은 값이 나온다. 그 경우 다시 레슨의 길이를 줄여 탐색한다.
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
			//최종 left:9 right:45
		}
		
		while(left<=right) {
			int mid=(left+right)/2; //임의의 수 mid
			int sum=0;
			int cnt=0;
			
			//binary search로 mid보다 작은 갯수를 구한다.
			for(int i=0;i<N;i++) {
				if(sum+lesson[i]>mid) {
					sum=0;
					cnt++;
				}
				sum+=lesson[i];
			}
			if(sum!=0)
				cnt++;
			if(cnt<=M) //구한 개수가 m보다 작으면
				right=mid-1; //최댓값 감소(레슨 길이를 감소시킨다.)
			else //구한 개수가 m보다 크면
				left=mid+1; //최솟값 증가(레슨 길이를 증가시킨다)
			
		}
		System.out.println(left);
	}

}
