import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
public class boj_12931 {
//B�� A�� ������ ����
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
			if(Arrays.equals(A,B)) break; //������ break
			
			for(i=0;i<N;i++) {
				if(B[i]%2!=0) {//Ȧ�����
					ans+=1;
					B[i]--;

				}	
				if(!Arrays.equals(A,B)) { //���������� (0 0 ..�϶�)�� ���ֱ� ����
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
