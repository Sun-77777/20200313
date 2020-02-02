#define _CRT_SECURE_NO_WARNINGS
#include <stdio.h>

int main()
{
	int a = 0;
	int i = 0;
	int b = 0;
	int count = 0;

	printf("请输入一个整数:>");
	scanf("%d", &a);
	for (i = 0; i < 32; i++)
	{
		b = a & 1;
		a = a >> 1;
		if (b == 1)
		{
			count++;
		}
	}
	printf("%d\n", count);

	return 0;
}
