#define _CRT_SECURE_NO_WARNINGS
#include <stdio.h>
#include <math.h>

int main()
{
	int n = 0;
	scanf("%d", &n);
	int ret = judgesushu(n);
	if (ret == 1)
		printf("是素数\n", ret);
	else if (ret == 0)
		printf("不是素数\n", ret);
	return 0;
}
int judgesushu(int x)
{
	int i = 0;
	for (i = 2; i <= sqrt(x); i++)
	{
		if (x%i == 0)
		{
			return 0;
		}
		else
		{
			return 1;
		}
	}
}