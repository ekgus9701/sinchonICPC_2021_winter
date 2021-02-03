import java.io.*;
import java.util.Stack;

public class boj_2504 {

	public static Stack<Character> stack=new Stack<Character>();
	public static void main(String[] args) throws Exception{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String s=br.readLine();
		boolean check=false;
		long ans=0;
		int val=1;
		for(int i=0; i<s.length(); i++) {
			if(s.charAt(i)=='(') {
				stack.add(s.charAt(i)); //(추가
				val*=2; // *2 계산
			}
			if(s.charAt(i)=='[') {
				stack.add(s.charAt(i));//[추가
				val*=3;// *3 계산
			}
			if(s.charAt(i)==')') {
				if(stack.empty() || stack.peek()!='(') {//비었거나 가장 최근에 스택에 넣은게 (가 아니라면
					check=true; //문제가 있다고 체크
					break; 
				}
				if(s.charAt(i-1)=='(')//i-1번째 애가 (라면
					ans+=val; //답에 val을 업데이트
				stack.pop(); //(을 뺌
				val/=2; //val *2하기전으로 원상복구
				
			}
			else if(s.charAt(i)==']') {
				if(stack.empty() || stack.peek()!='[') {//비었거나 가장 최근에 스택에 넣은게 [가 아니라면
					check=true;//문제가 있다고 체크
					break;
				}
				if(s.charAt(i-1)=='[')//i-1번째 애가 [라면
					ans+=val;//답에 val을 업데이트
				stack.pop();//[를 뺌
				val/=3;//val *3하기전으로 원상복구
			}
		}
		if(check==true || !stack.empty()) { //마지막에 비어있지않거나 문제가 있다고 체크를 해뒀었다면 
			System.out.println(0); //0출력
		}
		else {
			System.out.println(ans); //답 출력
		}
	}

}

//어려웠던 점은 괄호가 잘 구성되어있는지는 이전에 자료구조 수업에서 배웠어서 생각할 수 있었는데 
//*2,*3등 계산을 어떻게 해야할 지 생각하는것이 어려웠다.