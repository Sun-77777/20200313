#define _CRT_SECURE_NO_WARNINGS

#include <stdio.h>
#include <math.h>
//sn=a+aa+aaa+aaaa

int main()
{
	int a = 0;   
	int n = 0;  //Î»Êý
	scanf("%d%d", &n, &a);
	int i = 0;
	int nn = 0;
	int sum = 0;
	for (i = 0; i < n; i++)
	{
		nn = nn + pow(10, i)*a;
		sum = sum + nn;
	}
	printf("%d\n", sum);
	return 0;
 }