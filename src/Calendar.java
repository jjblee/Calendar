import java.util.Scanner;

public class Calendar {
	public static void main(String[] args) {
		int[] month= new int[] {31,28,31,30,31,30,31,31,30,31,30,31};
		
		Scanner scanner=new Scanner(System.in);
		System.out.println("���� �Է��ϼ���.");
		int input=scanner.nextInt();
		
		System.out.printf("%d���� %d�ϱ��� �ֽ��ϴ�.\n", input, month[input-1]); //printf�� �ڵ����� �ٹٲ��� ���� ����
		System.out.println(input+"���� "+month[input-1]+"�ϱ��� �ֽ��ϴ�.");
		scanner.close();
		
	}
}
