import java.util.*;
public class boj_2231 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int N=sc.nextInt();
		
		int a,b,c,d,e,f;
		
		for(a=0;a<10;a++) {
			for(b=0;b<10;b++) {
				for(c=0;c<10;c++) {
					for(d=0;d<10;d++) {
						for(e=0;e<10;e++) {
							for(f=0;f<10;f++) {
								if(a+b+c+d+e+f+100000*a+10000*b+1000*c+d*100+e*10+f==N) {
									System.out.println(100000*a+10000*b+1000*c+d*100+e*10+f);
									System.exit(0);
								}
							}
						}
					}
				}
			}
		}
		
		System.out.println(0);
	}
	

}
