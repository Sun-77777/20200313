import java.util.Scanner;
public class Dddd {
	public static int prime(int n) {
		int i = 0;
		for(i = 2; i <= Math.sqrt(n); i++) {
			if(n % i == 0) {
				break;
			}
		}
		if(i > Math.sqrt(n)) {
			return 1;
		}
		return 0;
	}
	public static void print(int n) {
		for(int i = 1; i <= n; i++) {
			for(int j = 1; j <= i; j++) {
				System.out.print(i + "*" + j + "=" + i*j +" ");
			}
			System.out.println();
		}
	}
	public static int common(int x,int y) {
		int c = x % y;
		while(c != 0) {
			x = y;
			y = c;
			c = x % y;
		}
		return y;
	}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt(); 
		int ret = common(a,b);
		System.out.println("最大公约数：" + ret);
		//print(n);
		/*int ret = prime(n);
		if(ret == 1) {
			System.out.println("是素数！");
		}else {
			System.out.println("不是素数！");
		}*/
	}
}