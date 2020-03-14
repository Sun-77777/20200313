import java.util.Arrays;
public class Day {

	public static String myToString(int[] array) {
		String ret = "[";
		for(int i = 0; i < array.length; i++) {
			ret += array[i];
			if(i != array.length-1) {
				ret += ", ";
			}
		}
		ret += "]";
		return ret;
	}
	public static void main(String[] args) {
		int[] array = {1,2,3,3,2,1};
		String ret = myToString(array);
		System.out.println(Arrays.toString(array));
		System.out.println(ret);
	}	
}