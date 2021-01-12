import java.util.*;
import java.io.*;

public class boj_1080 {

	public static void main(String[] args) throws Exception, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st=new StringTokenizer(br.readLine());
		int N=Integer.parseInt(st.nextToken());
		int M=Integer.parseInt(st.nextToken());
		int cnt=0;
		
		int [][] arr1 = new int[N][M];
		int [][] arr2 = new int[N][M];
		int [][] arr3=new int[N][M];
		
		
		for(int i=0;i<N;i++) {	//행렬A
			String input=br.readLine();
			for(int j=0;j<M;j++) {
				arr1[i][j]=input.charAt(j)-'0';		
				
			}
		}
		
		for(int i=0;i<N;i++) {//행렬 B
			String input=br.readLine();
			for(int j=0;j<M;j++) {
				arr2[i][j]=input.charAt(j)-'0';
			}
		}
		
		for(int n=0;n<N-2;n++) {
			for(int m=0;m<M-2;m++) {
				if(arr1[n][m]==arr2[n][m]) {
					arr3[n][m]=1;	//같으면 1 대입
					}
				else arr3[n][m]=0; //다르면 0 대입
			
				//System.out.println(arr3[n][m]);
				if(arr3[n][m]==0) { //다르면 뒤집어줘야한다
					if(n<N-2) {
					arr1[n][m]=(arr1[n][m]==1)?0:1;
					arr1[n][m+1]=(arr1[n][m+1]==1)?0:1;
					arr1[n][m+2]=(arr1[n][m+2]==1)?0:1;
					arr1[n+1][m]=(arr1[n+1][m]==1)?0:1;
					arr1[n+1][m+1]=(arr1[n+1][m+1]==1)?0:1;
					arr1[n+1][m+2]=(arr1[n+1][m+2]==1)?0:1;
					arr1[n+2][m]=(arr1[n+2][m]==1)?0:1;
					arr1[n+2][m+1]=(arr1[n+2][m+1]==1)?0:1;
					arr1[n+2][m+2]=(arr1[n+2][m+2]==1)?0:1;
					
					cnt+=1;
					}	
				}
			}
		}
		
		//마지막으로 같은지 다른지 확인
		for(int i=0;i<N;i++) {
			for(int j=0;j<M;j++) {
				if(arr1[i][j]==arr2[i][j]) {
					arr3[i][j]=1;	//같으면 1 대입
					}
				else arr3[i][j]=0; //다르면 0 대입
			}
		}
		
		for(int n=0;n<N;n++) {
			for(int m=0;m<M;m++) {
				if(arr3[n][m]==0) {// 최종적으로 다르면
					System.out.println("-1");
					System.exit(0);
				}
				
			}
		}
		System.out.println(cnt);
	}

}
