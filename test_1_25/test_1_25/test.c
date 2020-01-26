#define _CRT_SECURE_NO_WARNINGS
#include <stdio.h>
#include <math.h>

int judgesushu(int x)
{
	int i = 0;
	for (i = 2; i <= sqrt(x); i++)
	{
		if (x%i == 0)
		{
			return 1;
		}
	}
	return 0;
}

int main()
{
	int n = 0;
	int ret = 0;
	scanf("%d", &n);
	ret = judgesushu(n);
	if (ret == 0)
		printf("是素数\n");
	else 
		printf("不是素数\n");
	return 0;
}

