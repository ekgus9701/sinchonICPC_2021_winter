import java.util.*;
public class boj_19639 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int X=sc.nextInt();
		int Y=sc.nextInt();
		int M=sc.nextInt();
		int M1=M;
		int i=0,j=0;
		int minus=0,plus=0;
		
		Integer hp[]=new Integer[X];
		Integer heal[]=new Integer[Y];
		
		
		for(int k=0;k<X;k++) {
			hp[k]=sc.nextInt();
			minus+=hp[k];
			
		}
		
		for(int l=0;l<Y;l++) {
			heal[l]=sc.nextInt();
			plus+=heal[l];
			
		}
		
		if(10-minus+plus<=0) { //체력+회복힐-잃게되는 체력이 0보다 작으면
			System.out.println(0);
			System.exit(0);
		}
		
		if(X==0) {//X가 0보다 작으면
			for(int k=0;k<Y;k++) {
				System.out.println(k+1);//Y에 해당하는 값만 출력
				if(k==Y-1) {
				System.exit(0);
				}
			}
		}
		
		if(Y==0) {//Y가 0보다 작으면
			for(int k=0;k<X;k++) {
				System.out.println(k+1);//X에 해당하는 값만 출력
				if(k==X-1) {
					System.exit(0);
					}
			}
		}

		
		while(true) {
			
			if(i==X&&j==Y) { //모두와 싸우고 물약을 다 먹으면
				break;
			}
			if(i==X) { //모두와 싸웠지만 먹을 물약이 남았을때
				M+=heal[j];
				System.out.println(j+1);
				j++;
			}
			if(i!=X) { //모두와 싸우지않았을때
				if(M-hp[i]>0) { //i번째 사람과 싸운 후의 체력이 0보다 크다면 
					M-=hp[i]; //i번째 사람과 싸운다
					System.out.println("-"+(i+1));
					i++; //다음사람과 싸워야하므로 i를 증가
				}
				else {//i번째 사람과 싸운 후의 체력이 0보다 작기때문에 
					M+=heal[j]; //물약을 먹는다
					System.out.println(j+1);
					j++; //다음물약으로 넘어간다
				}
			}
			
			
		}
	}

}
