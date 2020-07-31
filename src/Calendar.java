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

		System.out.println("�ݺ� Ƚ���� �Է��ϼ���.");
		int repeat=scanner.nextInt();
		
		//static �޼ҵ�� ��ü�� ������ �ʿ� ����
		for(int i=0; i<repeat; i++) {
			System.out.println("���� �Է��ϼ���.");
			int input=scanner.nextInt();	
			System.out.printf("%d���� %d�ϱ��� �ֽ��ϴ�.\n", input, maxDateMonth(input)); //printf�� �ڵ����� �ٹٲ��� ���� ����			
		}
		System.out.println("for�� ����"); 
		
		//non static �޼ҵ带 ����� �� ��ü�� �����ؾ���!
		int input=1;
		Calendar cal=new Calendar();
		while(true) {
			System.out.println("���� �Է��ϼ���.");
			input=scanner.nextInt();
			if(input<1 || input>12) {
				break;
			}
			System.out.printf("%d���� %d�ϱ��� �ֽ��ϴ�.\n", input, cal.maxDateMonth2(input)); 			
		}
		
		System.out.printf("����"); 			
		scanner.close();
	}
}
