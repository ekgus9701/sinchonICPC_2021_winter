import java.util.*;

public class boj_15663 {
    static int N, M;
    static int[] nums, answer;
    static boolean[] isused;
    static LinkedHashSet<String> ans;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        M = sc.nextInt();

        nums = new int[N];
        answer = new int[M];
        isused = new boolean[N];
        ans = new LinkedHashSet<>(); //set은 데이터를 중복해서 저장할 수 없다 --> 중복 없애기
        							 //LinkedHashSet은 입력된 순서대로 값을 저장한다.

        for (int i = 0; i < N; i++)
            nums[i] = sc.nextInt();

        Arrays.sort(nums); //사전순 출력 위해 오름차순 정렬
        solve(0);
        ans.forEach(System.out::println);  //println함수를 ans의 요소 각각에 대해 실행
    }

    static void solve(int level) {
    	if (level == M) {
            StringBuilder sb = new StringBuilder();
            for (int p : answer) //answer에서 꺼낼 요소가 없을 때까지 요소를 p에 넣는다
                sb.append(p).append(' ');
            ans.add(sb.toString());
            return;
        }

        for (int i = 0; i < N; i++) {
            if (isused[i])
                continue;
            isused[i] = true;
            answer[level] = nums[i];
            solve(level + 1);
            isused[i] = false;
        }
    }
}