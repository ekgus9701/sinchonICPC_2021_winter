import java.util.*;
public class boj_20044 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		n=n*2;
		int[] arr=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		
		Arrays.sort(arr);
		int small=1234567891;
		
		
		
		for(int i=1;i<n;i++) {
			small=Math.min(small, arr[i]+arr[n-1-i]);
			
		}
		System.out.println(small);
	}

}
