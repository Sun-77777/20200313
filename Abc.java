public class Abc {
	public static void main(String[] args) {
		int a = 30;
		int b = 20;
		int c = 15;
		int tmp = 0;

		if(a > b)
		{
			tmp = a;
			a = b;
			b = tmp;
		}
	
		if(a > c)
		{
			tmp = a;
			a = c;
			c = tmp;
		}
		if(b > c)
		{
			tmp = b;
			b = c;
			c = tmp;
		}

		System.out.println("min = " + a);
		System.out.println("max = " + c);
		

	}
}