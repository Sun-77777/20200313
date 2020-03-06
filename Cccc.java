import java.util.Scanner;
import java.lang.Math;
import java.util.Random;
import java.util.Scanner;;

public class Cccc {

	public static void main(String[] args) {
		//完成猜数字游戏 ，用户输入数字，
		//判断该数字是大于，小于，还是等于随机生成的数字，等于的时候退出程序。
		
		Random random = new Random(); // 默认随机种子是系统时间
		Scanner sc = new Scanner(System.in);
		int toGuess = random.nextInt(100);
		
		while (true) {
			System.out.println("请输入要输入的数字: (1-100)");
			int num = sc.nextInt();
			if (num < toGuess) {
				System.out.println("低了");
			} else if (num > toGuess) {
				System.out.println("高了");
			} else {
				System.out.println("猜对了");
				break;
			}
		}
		sc.close();
	}
	//求一个整数，在内存当中存储时，二进制1的个数。

	public static void main9(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int count = 0;
		int a = n;
		while (a != 0) {
			int b = a & 1;
			if(b == 1) {
				count++;
			}
			a = a>>>1;
		}
		System.out.println(count);

	}


	public static void main8(String[] args) {
		//求两个正整数的最大公约数
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();

		int n = a > b ? b : a;//小
		int m = a > b ? a : b;//大
		int x = 0;
		for(int i = 1; i <= n; i++) {
			if(m%i == 0 && n%i ==0) {
 				x = i;
			}
		}
		System.out.println(x);
	}

	public static void main7(String[] args) {
		//计算1/1-1/2+1/3-1/4+1/5 …… + 1/99 - 1/100 的值 。
		int i = 1;
		int sum1 = 0;
		int sum2 = 0;
		int sum = 0;
		while(i <= 100) {
			sum1 = sum1 + 1/i;
			i += 2;
		}
		i = 2;
		while(i <=100) {
			sum2 = sum2 + 1/i;
			i +=2;
		}
		sum = sum1 - sum2;
		System.out.println(sum);

	}

	public static void main5(String[] args) {
		//水仙花数
		int i = 0;
		for(i = 100; i <= 999; i++) {
			int tmp = i;
			int sum = 0;
			while(tmp != 0) {
				int a = tmp % 10;
			    tmp = tmp/10;
			    sum += a*a*a;
			}
			if(sum == i) {
				System.out.println(i);
			}
		}
	}

	public static void main6(String[] args) {
		//输出 1000 - 2000 之间所有的闰年
		int i = 0;
		for(i = 1000; i <= 2000; i++) {
			if(((i%4 ==0) && (i%100 != 0)) ||(i%400 == 0)) {
				System.out.print(i + " ");
			}
		}
		
	}
	
	public static void main4(String[] args) {
		//1到 100 的所有整数中出现多少个数字9
		int i = 0;
		for(i = 1; i <= 100; i++) {
			if(i%10 == 9) {
				System.out.print(i + " ");
			}  
			if(i/10 == 9) {
				System.out.print(i + " ");
			}
		}
	}


	public static void main3(String[] args) {
		//打印 1 - 100 之间所有的素数
		int j = 0;
		for(int i = 2; i <= 100; i++) {
			int count = 0;
			for(j = 2; j <= Math.sqrt(i); j++) {
				if(i%j == 0) {
					count++;
				}
			}
			if(count == 0) {
				System.out.print(i + " ");
			}
		}
	}



	public static void main2(String[] args) {
		//判定一个数字是否是素数
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int count = 0;
		for(int i = 2; i <= Math.sqrt(n); i++) {
			if(n%i == 0) {
				count++;
				System.out.println("不是素数！");
				break;
			}
		}
		if(count == 0) {
			System.out.println("是素数！");
		}
	}


	public static void main1(String[] args) {
		//根据年龄, 来打印出当前年龄的人是少年(低于18), 青年(19-28), 中年(29-55), 老年(56以上)
		Scanner scan = new Scanner(System.in);
		int age = scan.nextInt();
		if(age <= 18) {
			System.out.println("是少年！");
		}else if(age>18 && age<=28) {
			System.out.println("是青年！");
		}else if(age>28 && age<=55) {
			System.out.println("是中年！");
		}else {
			System.out.println("是老年！");
		}

	}
}