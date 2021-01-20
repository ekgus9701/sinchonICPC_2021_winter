import java.util.*;

public class boj_1931 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[][] arr=new int[n][2];
		
		for(int i=0;i<n;i++) {
			for(int j=0;j<2;j++) {
				arr[i][j]=sc.nextInt();
			}
		}
		Arrays.sort(arr,new Comparator<int[]>() {
			@Override
			public int compare(int[] o1, int[] o2) {
				if(o1[1]==o2[1]) {
					return o1[0]-o2[0];
				}
				
					return o1[1]-o2[1];
				
			}
		});
		
		int a=0,b=0;
		
		for(int i=0;i<n;i++) {
			if(a<=arr[i][0]) {
				a=arr[i][1];
				b++;
			}
		}
		System.out.println(b);
	
	}

}