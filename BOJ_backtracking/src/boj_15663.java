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
        ans = new LinkedHashSet<>(); //set�� �����͸� �ߺ��ؼ� ������ �� ���� --> �ߺ� ���ֱ�
        							 //LinkedHashSet�� �Էµ� ������� ���� �����Ѵ�.

        for (int i = 0; i < N; i++)
            nums[i] = sc.nextInt();

        Arrays.sort(nums); //������ ��� ���� �������� ����
        solve(0);
        ans.forEach(System.out::println);  //println�Լ��� ans�� ��� ������ ���� ����
    }

    static void solve(int level) {
    	if (level == M) {
            StringBuilder sb = new StringBuilder();
            for (int p : answer) //answer���� ���� ��Ұ� ���� ������ ��Ҹ� p�� �ִ´�
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