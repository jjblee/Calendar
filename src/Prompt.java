import java.util.Scanner;

public class Prompt {
	
	private static final String PROMPT="cal> ";
	private static final int[] MaxDATE={31,28,31,30,31,30,31,31,30,31,30,31};
	
	public static int MaxDateMonth(int month) {
		return MaxDATE[month-1];
	}
	
	public static void runPrompt() {
		Scanner scanner=new Scanner(System.in);
		int month=1; //while�� �ۿ����� ����ϱ� ����!
		while(true) {
			System.out.println("���� �Է��ϼ���.");
			System.out.print(PROMPT); //�ٹٲ� ����
			month=scanner.nextInt();
			if(month==-1) {
				break;
			} else if(month>12) {
				continue;
			}
			printCalendar(2020, month);
		}
		System.out.println("����");
		scanner.close();
	}
	
	public static void printCalendar(int year, int month) {
		System.out.printf("     <%4d�� %3d��>\n", year, month);
		System.out.println(" ��   ��    ȭ    ��   ��    ��   ��");
		System.out.println("--------------------");

		int maxDate=MaxDateMonth(month);
		for(int i=1; i<=maxDate; i++) {
			System.out.printf("%3d",i);
			if(i%7==0) {
				System.out.printf("\n");
			}
		}
	}
		
	
	public static void main(String[] args) {
		runPrompt();
	}
}
