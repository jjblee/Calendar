import java.util.Scanner;
public class Sum {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("�� ���� �Է��ϼ���.");
		String inputValue=scanner.nextLine();
		
		String[] splitedValue=inputValue.split(",");
		int first=Integer.parseInt(splitedValue[0]);
		int second=Integer.parseInt(splitedValue[1]);
		
		System.out.println("�� ���� ����"+(first+second)+"�Դϴ�.");
		
		scanner.close();
	}
}
