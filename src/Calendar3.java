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
		map.put("일", 0);
		map.put("월", 1);
		map.put("화", 2);
		map.put("수", 3);
		map.put("목", 4);
		map.put("금", 5);
		map.put("토", 6);
		tap=map.get(day);
	}
	
	
	public static void runPrompt() {
		Scanner scanner=new Scanner(System.in);
		int year=1;
		int month=1; //while문 밖에서도 사용하기 위함!
		String day;
		while(true) {
			System.out.println("년도를 입력하세요.");
			System.out.print(PROMPT); //줄바꿈 없음
			year=scanner.nextInt();
			System.out.println("월을 입력하세요.");
			System.out.print(PROMPT); //줄바꿈 없음
			month=scanner.nextInt();
			System.out.println("첫번째 요일을 입력하세요.");
			System.out.print(PROMPT); //줄바꿈 없음
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
		System.out.println("종료");
		scanner.close();
	}
	
	public static void printCalendar(int year, int month) {
		System.out.printf("     <%4d년 %3d월>\n", year, month);
		System.out.println(" 일    월     화    수   목    금   토");
		System.out.println("---------------------");

		int maxDate=MaxDateMonth(month);
		for(int j=0; j<tap; j++) {
			System.out.printf("   ");			
		} //빈칸 0 1 2 3 4 5 6 
		for(int i=1; i<=maxDate; i++) {
			System.out.printf("%3d",i);
			if(i%7==(7-tap)) {
				System.out.printf("\n");
			} else if(tap==0 && i%7==0) {
				System.out.println();
			}
		} //나머지가 7 6 5 4 3 2 1
		System.out.println();
	}
		
	
	public static void main(String[] args) {
		runPrompt();		
	}
}
