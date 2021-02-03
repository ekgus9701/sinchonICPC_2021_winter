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
				stack.add(s.charAt(i)); //(�߰�
				val*=2; // *2 ���
			}
			if(s.charAt(i)=='[') {
				stack.add(s.charAt(i));//[�߰�
				val*=3;// *3 ���
			}
			if(s.charAt(i)==')') {
				if(stack.empty() || stack.peek()!='(') {//����ų� ���� �ֱٿ� ���ÿ� ������ (�� �ƴ϶��
					check=true; //������ �ִٰ� üũ
					break; 
				}
				if(s.charAt(i-1)=='(')//i-1��° �ְ� (���
					ans+=val; //�信 val�� ������Ʈ
				stack.pop(); //(�� ��
				val/=2; //val *2�ϱ������� ���󺹱�
				
			}
			else if(s.charAt(i)==']') {
				if(stack.empty() || stack.peek()!='[') {//����ų� ���� �ֱٿ� ���ÿ� ������ [�� �ƴ϶��
					check=true;//������ �ִٰ� üũ
					break;
				}
				if(s.charAt(i-1)=='[')//i-1��° �ְ� [���
					ans+=val;//�信 val�� ������Ʈ
				stack.pop();//[�� ��
				val/=3;//val *3�ϱ������� ���󺹱�
			}
		}
		if(check==true || !stack.empty()) { //�������� ��������ʰų� ������ �ִٰ� üũ�� �ص׾��ٸ� 
			System.out.println(0); //0���
		}
		else {
			System.out.println(ans); //�� ���
		}
	}

}

//������� ���� ��ȣ�� �� �����Ǿ��ִ����� ������ �ڷᱸ�� �������� ���� ������ �� �־��µ� 
//*2,*3�� ����� ��� �ؾ��� �� �����ϴ°��� �������.