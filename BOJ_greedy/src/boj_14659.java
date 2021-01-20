import java.util.*;
public class boj_14659 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n, kill,cur_max=0,ans = 0;
		Scanner sc = new Scanner(System.in);
		n=sc.nextInt();
		int [] arr=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		kill=0;
		for(int j=0;j<n;j++) {
			if(arr[j]>=cur_max) {
				cur_max=arr[j];
				ans=Math.max(ans, kill);
				kill=0;
			}
			else {
				kill++;
			}
		}
		ans=Math.max(ans, kill);
		System.out.println(ans);
	}

}
