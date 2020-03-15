import java.util.Arrays;
public class Qqqq {

	public static void main(String[] args) {
		int[] array = {2,4,5,6,7,10};
		System.out.println(isSorted(array));
	}
	public static boolean isSorted(int[] array) {
		for(int i = 0; i < array.length-1; i++) {
			if(array[i] > array[i+1]) {
				return false;
			}
		}
		return true;
	}
	public static void main2(String[] args) {
		int[] array = {10,9,8,2,3,4,5};
		bubble(array);
		System.out.println(Arrays.toString(array));

	}
	
	public static void bubble(int[] array) {	
		for(int i = 0; i < array.length-1; i++) {
			boolean flg = true;		
			for(int j = 0; j < array.length-1-i; j++) {
				if(array[j] > array[j+1]) {
					int tmp = array[j];
					array[j] = array[j+1];
					array[j+1] = tmp;
					flg = false;
				}
			}
			if(flg) {
				break;
			}

		}
	}		
}