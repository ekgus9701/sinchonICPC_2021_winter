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
			
			int a = V/P;	//��
			int b= V%P;		//������
			
			ans+=a*L;		//��*����� �� �ִ� L��
			
			if(b<=L) {	//�������� ����� �� �ִ� ������ �۴ٸ�
				ans+=b;	//�������� �״�� ���Ѵ�.
			}
			else {	//�׷��� �ʴٸ�
				ans+=L; //����� �� �ִ³��� ��°�� ���Ѵ�.
			}

			System.out.println("Case "+j +": "+ans);
			i=0;ans=0; //������ �ʱ�ȭ�ϰ�
			j+=1; //��¥�� �Ϸ� �����ش�.
		}
	}
}
