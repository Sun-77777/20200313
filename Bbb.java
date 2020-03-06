import java.util.Scanner;

public class Bbb {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();

		int max = (a >= b ? a : b) >= c ? (a >= b ? a : b) : c;
		int min = (a >= b ? b : a) >= c ? c : (a >= b ? b : a);
		System.out.println(max);
		System.out.println(min);
	}
}