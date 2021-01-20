import java.util.*;
public class boj_2839 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int ans = 0;
		Scanner sc = new Scanner(System.in);
		int N=sc.nextInt();
		while(true) {
			if(N%5==0) {
				ans+=N/5;
				System.out.println(ans);
				break;
			}
			N=N-3;
			ans+=1;
			if(N<0) {
				System.out.println("-1");
				break;
			}
		}
	}

}
