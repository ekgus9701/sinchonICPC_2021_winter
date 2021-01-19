import java.util.*;
public class boj_15649 {
   static int N,M,MAX=10;
   static int answer[]=new int [MAX];
   static boolean isused[]=new boolean[MAX];
   
   public static void solve(int depth) {
      
      if(depth==M) {
         for(int i=0;i<M;i++) 
            System.out.print(answer[i]+" ");
         System.out.println();
         return;
         
      }
      
      for(int i=1;i<=N;i++) {
         if(isused[i]) continue;
         isused[i]=true;
         answer[depth]=i;
         solve(depth+1);
         isused[i]=false;
      }
   }
   
   public static void main(String[] args) {
      // TODO Auto-generated method stub
      Scanner sc = new Scanner(System.in);
      
       N=sc.nextInt();
       M=sc.nextInt();
      
      solve(0);
      sc.close();

   }

}