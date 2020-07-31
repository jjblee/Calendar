import java.util.Scanner;

public class Calendar {
	public static void main(String[] args) {
		int[] month= new int[] {31,28,31,30,31,30,31,31,30,31,30,31};
		
		Scanner scanner=new Scanner(System.in);
		System.out.println("달을 입력하세요.");
		int input=scanner.nextInt();
		
		System.out.printf("%d월은 %d일까지 있습니다.\n", input, month[input-1]); //printf는 자동으로 줄바꿈이 되지 않음
		System.out.println(input+"월은 "+month[input-1]+"일까지 있습니다.");
		scanner.close();
		
	}
}
