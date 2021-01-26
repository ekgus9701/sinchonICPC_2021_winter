import java.util.*;
public class boj_2748 {
	static long fib[] = new long[100];
	static int n;
	public static long fibo (int n) {
		if(fib[n]!=-1) //처음에 -1로 초기화했는데 다른수로 바뀌었다면 이미 계산되어 저장된것
			return fib[n];
		if(n<2) //n이 0,1이면
			return fib[n]=n;
		return fib[n]=fibo(n-1)+fibo(n-2);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		n=sc.nextInt();
		
		for(int i=0;i<100;i++) {
			fib[i]=-1;
		}
		System.out.println(fibo(n));
		
	}

}
