import java.util.Scanner;

public class Calendar {
	
	private static final int[] maxDate={31,28,31,30,31,30,31,31,30,31,30,31};
	
	//static �޼ҵ��� ��� 
	public static int maxDateMonth(int input) {
		return maxDate[input-1];
	}
	//staic�� ���� ���
	public int maxDateMonth2(int input) {
		return maxDate[input-1];
	}
	
	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		System.out.println("���� �Է��ϼ���.");
		int input=scanner.nextInt();
		
		//static �޼ҵ�� ��ü�� ������ �ʿ� ����
		System.out.printf("%d���� %d�ϱ��� �ֽ��ϴ�.\n", input, maxDateMonth(input)); //printf�� �ڵ����� �ٹٲ��� ���� ����
		//non static �޼ҵ带 ����� �� ��ü�� �����ؾ���!
		Calendar cal=new Calendar();
		System.out.printf("%d���� %d�ϱ��� �ֽ��ϴ�.\n", input, cal.maxDateMonth2(input)); 
		
		scanner.close();
	}
}
