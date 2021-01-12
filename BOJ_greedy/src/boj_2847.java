import java.util.*;
public class boj_2847 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int ans=0;
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		
		for(int i=n-2;i>=0;i--) {
			if(arr[i]>=arr[i+1]) {
				ans+=arr[i]-arr[i+1]+1;
				//System.out.println(ans);
			}
			arr[i]=Math.min(arr[i], arr[i+1]-1);
		}
		System.out.println(ans);
		
	}

}
