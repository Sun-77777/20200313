import java.util.Scanner;
public class Work {

	public static void print(int n) {
		if(n > 9) {
			print(n/10);
		}
		System.out.println(n%10);		
	}

	public static void main(String[] args) {
		//按顺序打印一个数字的每一位(例如 1234 打印出 1 2 3 4) （递归）
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		print(n);
	}
	//写一个递归方法，输入一个非负整数，返回组成它的数字之和
	public static void main4(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int ret = sum(n);
		System.out.println(ret);
	}
	public static int sum(int n) {
		if(n <= 9) {
			return n;
		}
		return n%10+sum(n/10);
	}
	public static int fac(int n) {
		if(n == 1 || n == 2) {
			return 1;
		}
		return fac(n-1) + fac(n-2);
	}

	public static void main3(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int ret = fac(n);
		System.out.println(ret);
	}

	public static void move(char pos1,char pos3) {
		System.out.print(pos1 + "->" + pos3 + " ");
	}

	public static void hanoi(int n,char pos1,char pos2,char pos3) {
		if(n == 1) {
			move(pos1,pos3);
			return ;
		}
		hanoi(n-1,pos1,pos3,pos2);
		move(pos1,pos3);
		hanoi(n-1,pos2,pos1,pos3);
	}

	public static void main2(String[] args) {
		//递归求解汉诺塔问题
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		hanoi(n,'A','B','C');
		
	}
	
	public static void main1(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int ret = jump(n);
		System.out.println(ret);
	}
	public static int jump(int n) {
		if(n == 1 || n == 2) {
			return n;
		}
		return jump(n-2) + jump(n-1);
	}
}

