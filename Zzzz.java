import java.util.Scanner;
public class Zzzz {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();

		int ret = add(a,b);
		System.out.println(ret);

		double c = scan.nextDouble();
		double d = scan.nextDouble();
		double ret2 = add(c,d);
		System.out.println(ret2);
	}
	/**
	 * 方法的重载
	 * 方法名相同
	 * 返回类型无要求
	 * 参数不同表现在参数个数不同或者参数类型不同
	 * @param  x [description]
	 * @param  y [description]
	 * @return   [description]
	 */
	public static int add(int x, int y) {
		return x+y;
	}
	public static double add(double x,double y) {
		return x+y;
	}
	public static int add(int x,int y,int z) {
		return x+y+z;
	}
	

}