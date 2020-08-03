import java.util.Scanner;

public class Calendar4 {
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
	
	//A�� B����ϴ� �޼ҵ�
	static int remainder;
	public static void dDay(int year, int month) {
		int count=0;
		for(int i=1583; i<year; i++) {
			if(i%4==0 && (i%100!=0 || i%400==0)) {
				count=count+1;
			}
		}
		int a=(year-1583)*365+count;
		
		leapYear(year);
		int b=0;
		for(int i=1; i<month; i++) {
			b=b+MaxDATE[i-1];
		}
		
		if(year==1583&&month==1) {
			remainder=6;
		} else {
			remainder=(a+b-1)%7;			
		}
	}
	
	
	
	
	public static void runPrompt() {
		Scanner scanner=new Scanner(System.in);
		int year=1;
		int month=1; //while�� �ۿ����� ����ϱ� ����!
		while(true) {
			System.out.println("�⵵�� �Է��ϼ���(1583�� ���ķ� �Է� ����).");
			System.out.print(PROMPT); //�ٹٲ� ����
			year=scanner.nextInt();
			System.out.println("���� �Է��ϼ���.");
			System.out.print(PROMPT); //�ٹٲ� ����
			month=scanner.nextInt();
			
			if(month==-1) {
				break;
			} else if(month>12) {
				continue;
			}
			dDay(year, month);
			leapYear(year);
			printCalendar(year, month);
		}
		System.out.println("����");
		scanner.close();
	}
	
	public static void printCalendar(int year, int month) {
		System.out.printf("     <%4d�� %3d��>\n", year, month); //year, month�� ���� ���� �ƴѰ�?
		System.out.println(" ��    ��     ȭ    ��   ��    ��   ��");
		System.out.println("---------------------");

		int maxDate=MaxDateMonth(month);
		for(int j=0; j<remainder; j++) {
			System.out.printf("   ");			
		} //��ĭ 0 1 2 3 4 5 6 
		for(int i=1; i<=maxDate; i++) {
			System.out.printf("%3d",i);
			if(i%7==(7-remainder)) {
				System.out.printf("\n");
			} else if(remainder==0 && i%7==0) {
				System.out.println();
			}
		} //�������� 7 6 5 4 3 2 1
		System.out.println();
	}
		
	
	public static void main(String[] args) {
		runPrompt();		
	}
}
