import java.util.Scanner;

public class Sum2 {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("�� ���� �Է��ϼ���.");
		
		String s1=scanner.next();
		String s2=scanner.next();
		
		int a=Integer.parseInt(s1);
		int b=Integer.parseInt(s2);
		
		System.out.println(a+b);
		scanner.close();
	}
}
