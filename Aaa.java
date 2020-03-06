import java.util.Scanner;
public class Aaa {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int j = 1;
		int sum = 0;
        while(j <= n) {
            int i = 1;
			int ret = 1;
			while(i <= j) {
				ret = ret * i;
				i++;
			}
			sum = sum + ret;
			j++;
        }
        System.out.println(sum);
	}



    public static void main1(String[] args) {
		int i = 1;
		int sum = 0;
		while (i <= 100) {
			sum += i;//sum = sum+i;
			i++;
		}
		System.out.println(sum);

		//计算1-100偶数的和
		i = 2;
		sum = 0;
		while(i <= 100) {
			sum += i;
			i += 2;
		}
		System.out.println(sum);
		
		//计算1-100奇数的和
	    i = 1;
		sum = 0;
		while(i <= 100) {
			sum += i;
			i += 2;
		}
		System.out.println(sum);
	}
}
