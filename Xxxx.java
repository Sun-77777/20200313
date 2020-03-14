import java.util.Arrays;
public class Xxxx {
	//数组的拷贝
	
	public static void main(String[] args) {
		int[] array = {3,3,3,4,4,4};
		int[] ret = Arrays.copyOf(array,array.length);
		System.out.println(Arrays.toString(ret));
	}

	public static void main2(String[] args) {
		int[] array = {2,2,2,6,6,6};
		int[] ret = new int[array.length];
		System.arraycopy(array,0,ret,0,array.length);
		//拷贝的更快一点，native修饰的方法
		System.out.println(Arrays.toString(ret));
	
	}

	public static int[] coppyArray(int[] array) {
		int[] ret = new int[array.length];
		for(int i = 0; i < array.length; i++) {
			ret[i] = array[i];
		}
		return ret;
	}
	public static void main1(String[] args) {
		int[] array = {1,2,3,4,5,6};
		int[] ret = coppyArray(array);
		System.out.println(Arrays.toString(ret));

	}
}
