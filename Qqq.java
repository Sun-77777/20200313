import java.util.Arrays;
public class Qqq {
    //5.创建一个 int 类型的数组, 元素个数为 100, 
    //并把每个元素依次设置为 1 - 100

	public static void main(String[] args) {
		int[] array = new int[100];
		int[] ret = set(array);
		System.out.println(Arrays.toString(ret));
	}
	public static int[] set(int[] array) {
		for(int i = 0; i < array.length; i++) {
			array[i] = i+1;
		}
		return array;
	}

	//4.实现一个方法 printArray, 以数组为参数, 
	//循环访问数组中的每个元素, 打印每个元素的值.

	public static void main1(String[] args) {
		int[] array = {1,2,3,4,5};
		printArray(array);
	}
	public static void printArray(int[] array) {
		for(int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
	}


	//3.实现一个方法 transform, 以数组为参数, 
	//循环将数组中的每个元素 乘以 2 , 并设置到对应的数组元素上.
	// 例如 原数组为 {1, 2, 3}, 修改之后为 {2, 4, 6}
	public static void main4(String[] args) {
		int[] array = {1,2,3};
		transform(array);
	}
	public static void transform(int[] array) {
		for(int i = 0; i < array.length; i++) {
			array[i] = array[i] * 2;
		}
		for (int i : array ) {
			System.out.print(i + " ");
		}
	}


	public static void main3(String[] args) {
    //2.实现一个方法 sum, 以数组为参数, 求数组所有元素之和.
    	int[] array = {1,2,3,4,5,6,7,8,9,10};
    	int ret = sum(array);
    	System.out.println(ret);
		
	}
	public static int sum(int[] array) {
		int ret = 0;
		for(int i : array) {
			ret = ret + i;
		}
		return ret;
	}


	//1.实现一个方法 avg, 以数组为参数, 
	//求数组中所有元素的平均值(注意方法的返回值类型).

	public static void main2(String[] args) {
		int[] array = {1,2,3,4,5,6,7,8,9,10};
		double ret = avg(array);
		System.out.println(ret);
	}
	public static double avg(int[] array) {
		double ret = 0;
		for(int i = 0; i < array.length; i++) {
			ret = ret + array[i];
		}
		ret = ret/array.length;
		return ret;
	}
}









