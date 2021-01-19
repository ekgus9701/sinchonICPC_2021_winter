import java.io.*;
import java.util.*;


public class boj_1018 {
	
		public static int min(int a, int b, int c) {
			if(a<b) {
				if(a<c)return a;
				else return c;
			}
			else {
				if(b<c)return b;
				else return c;
			}
		}
		
		public static void main(String[] args) throws IOException {
			// TODO Auto-generated method stub
			 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		      String s = br.readLine();
		      StringTokenizer st = new StringTokenizer(s);
		      int n=Integer.parseInt(st.nextToken());
		      int m = Integer.parseInt(st.nextToken());
		      char mat [][]=new char [n][m];
		      
		      for(int k=0;k<n;k++) {
		         String ss=br.readLine();
		         
		         for(int l=0;l<m;l++) {
		            mat[k][l]=ss.charAt(l);
		         }
		      }

			int ans = (int)1e9; 
			
			for(int a = 0; a <= n - 8; a++) {
				for(int b = 0; b <= m - 8; b++) {
					int num1 = 0, num2 = 0; 
					for(int i = a; i < a + 8; i++) {
						for(int j = b; j < b + 8; j++) {
							if(mat[i][j] == 'W') {
								if((i + j) % 2 == 0)num1++;
								else num2++; 
							}
							else {
								if((i + j) % 2 == 0)num2++; 
								else num1++; 
							}
						}
					}
					ans = min(ans, num1, num2);
				}
			}		      
			System.out.println(ans);
	}
}