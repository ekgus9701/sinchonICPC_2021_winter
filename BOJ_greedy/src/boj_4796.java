import java.io.*;
import java.util.*;
public class boj_4796 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;

		int j=1,i=0,ans=0;
		while(true) {
			st=new StringTokenizer(br.readLine());
			int L=Integer.parseInt(st.nextToken());
			int P=Integer.parseInt(st.nextToken());
			int V=Integer.parseInt(st.nextToken());

			if(V==0&&(L==0&&P==0)) break;
			
			int a = V/P;	//몫
			int b= V%P;		//나머지
			
			ans+=a*L;		//몫*사용할 수 있는 L일
			
			if(b<=L) {	//나머지가 사용할 수 있는 날보다 작다면
				ans+=b;	//나머지를 그대로 더한다.
			}
			else {	//그렇지 않다면
				ans+=L; //사용할 수 있는날을 통째로 더한다.
			}

			System.out.println("Case "+j +": "+ans);
			i=0;ans=0; //변수를 초기화하고
			j+=1; //날짜를 하루 더해준다.
		}
	}
}
