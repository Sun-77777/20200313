#define _CRT_SECURE_NO_WARNINGS
#include <stdio.h>
//µÝ¹é
//int fib(int n)
//{
//	if (n == 1 || n == 2)
//		return 1;
//	else
//		return fib(n - 1) + fib(n - 2);
//}

//·ÇµÝ¹é
int fib(int n)
{
	int a = 1;
	int b = 1;
	int c = 1;
	int i = 0;
	for (i = 2; i < n; i++)
	{
	    c = a + b;
		a = b;
		b = c;
	}
	return c;
}
int main()
{
	int n = 0;
	scanf("%d", &n);
	int ret = fib(n);
	printf("%d\n", ret);

}