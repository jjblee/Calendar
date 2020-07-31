import java.util.Scanner;

public class Calendar {
	
	private static final int[] maxDate={31,28,31,30,31,30,31,31,30,31,30,31};
	
	//static 메소드인 경우 
	public static int maxDateMonth(int input) {
		return maxDate[input-1];
	}
	//staic이 없는 경우
	public int maxDateMonth2(int input) {
		return maxDate[input-1];
	}
	
	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);

		System.out.println("반복 횟수를 입력하세요.");
		int repeat=scanner.nextInt();
		
		//static 메소드는 객체를 생성할 필요 없음
		for(int i=0; i<repeat; i++) {
			System.out.println("달을 입력하세요.");
			int input=scanner.nextInt();	
			System.out.printf("%d월은 %d일까지 있습니다.\n", input, maxDateMonth(input)); //printf는 자동으로 줄바꿈이 되지 않음			
		}
		System.out.println("for문 종료"); 
		
		//non static 메소드를 사용할 땐 객체를 생성해야함!
		int input=1;
		Calendar cal=new Calendar();
		while(true) {
			System.out.println("달을 입력하세요.");
			input=scanner.nextInt();
			if(input<1 || input>12) {
				break;
			}
			System.out.printf("%d월은 %d일까지 있습니다.\n", input, cal.maxDateMonth2(input)); 			
		}
		
		System.out.printf("종료"); 			
		scanner.close();
	}
}
