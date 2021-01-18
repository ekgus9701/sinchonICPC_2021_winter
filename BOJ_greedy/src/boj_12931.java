import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
public class boj_12931 {
//B를 A와 같도록 만듦
	public static void main(String[] args) throws Exception, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N=Integer.parseInt(br.readLine());
		int A[]=new int [N];
		int B[]=new int [N];
		
		int even=0,check=0,ans=0;
		StringTokenizer st=new StringTokenizer(br.readLine());
		for(int i=0;i<N;i++) {
			B[i]=Integer.parseInt(st.nextToken());
		}
		int i=0;
		while(true) {
			if(Arrays.equals(A,B)) break; //같으면 break
			
			for(i=0;i<N;i++) {
				if(B[i]%2!=0) {//홀수라면
					ans+=1;
					B[i]--;

				}	
				if(!Arrays.equals(A,B)) { //같지않으면 (0 0 ..일때)를 뻬주기 위함
					if(i==N-1&&(B[i]%2==0)) {
						for(int k=0;k<N;k++) {
							B[k]/=2;
						}
						ans+=1;
					}
				}
			}
		}
			System.out.println(ans);
		
		}

}
