import java.util.Scanner;
import java.util.HashMap;

public class Calendar3 {
	private static final String PROMPT="cal> ";
	private static int[] MaxDATE={31,28,31,30,31,30,31,31,30,31,30,31};
	
	public static int MaxDateMonth(int month) {
		return MaxDATE[month-1];
	}
	
	public static void leapYear(int year) {
		if(year%4==0 && (year%100!=0 || year%400==0)) {
			MaxDATE[1]=29;
		}
	}
	
	static int tap=1;
	public static void tapmap(String day) {
		HashMap<String, Integer> map=new HashMap<String, Integer>();
		map.put("��", 0);
		map.put("��", 1);
		map.put("ȭ", 2);
		map.put("��", 3);
		map.put("��", 4);
		map.put("��", 5);
		map.put("��", 6);
		tap=map.get(day);
	}
	
	
	public static void runPrompt() {
		Scanner scanner=new Scanner(System.in);
		int year=1;
		int month=1; //while�� �ۿ����� ����ϱ� ����!
		String day;
		while(true) {
			System.out.println("�⵵�� �Է��ϼ���.");
			System.out.print(PROMPT); //�ٹٲ� ����
			year=scanner.nextInt();
			System.out.println("���� �Է��ϼ���.");
			System.out.print(PROMPT); //�ٹٲ� ����
			month=scanner.nextInt();
			System.out.println("ù��° ������ �Է��ϼ���.");
			System.out.print(PROMPT); //�ٹٲ� ����
			day=scanner.next();
			if(month==-1) {
				break;
			} else if(month>12) {
				continue;
			}
			tapmap(day);
			leapYear(year);
			printCalendar(year, month);
		}
		System.out.println("����");
		scanner.close();
	}
	
	public static void printCalendar(int year, int month) {
		System.out.printf("     <%4d�� %3d��>\n", year, month);
		System.out.println(" ��    ��     ȭ    ��   ��    ��   ��");
		System.out.println("---------------------");

		int maxDate=MaxDateMonth(month);
		for(int j=0; j<tap; j++) {
			System.out.printf("   ");			
		} //��ĭ 0 1 2 3 4 5 6 
		for(int i=1; i<=maxDate; i++) {
			System.out.printf("%3d",i);
			if(i%7==(7-tap)) {
				System.out.printf("\n");
			} else if(tap==0 && i%7==0) {
				System.out.println();
			}
		} //�������� 7 6 5 4 3 2 1
		System.out.println();
	}
		
	
	public static void main(String[] args) {
		runPrompt();		
	}
}
