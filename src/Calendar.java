import java.util.Scanner;

public class Calendar {
	
	private static final int[] maxDate={31,28,31,30,31,30,31,31,30,31,30,31};
	
	public int maxDateMonth(int input) {
		return maxDate[input-1];
	}
	
	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		Calendar cal=new Calendar();
		System.out.println("���� �Է��ϼ���.");
		int input=scanner.nextInt();
		
		System.out.printf("%d���� %d�ϱ��� �ֽ��ϴ�.\n", input, cal.maxDateMonth(input)); //printf�� �ڵ����� �ٹٲ��� ���� ����
		//System.out.println(input+"���� "+month[input-1]+"�ϱ��� �ֽ��ϴ�.");
		scanner.close();
		
	}
}
