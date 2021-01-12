import java.util.*;
import java.io.*;
public class boj_1080 {

	public static void main(String[] args) throws Exception, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N=Integer.parseInt(br.readLine());
		int M=Integer.parseInt(br.readLine());
		
		int [][] arr1 = new int[N][M];
		int [][] arr2 = new int[N][M];
		int [][] arr3=new int[N][M];
		
		for(int i=0;i<N;i++) {
			String input=br.readLine();
			for(int j=0;j<M;j++) {
				arr1[i][j]=input.charAt(j)-'0';
			}
		}
		
		for(int i=0;i<N;i++) {
			String input=br.readLine();
			for(int j=0;j<M;j++) {
				arr2[i][j]=input.charAt(j)-'0';
			}
		}
		
		System.out.println(arr1[0][1]);
		
		for(int i=0;i<N;i++) {
			
		}
	}

}
