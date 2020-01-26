#define _CRT_SECURE_NO_WARNINGS
#include <stdio.h>

void chengfabiao(int x)
{
	int i = 0;
	for (i = 1; i <= x; i++)
	{
		int j = 0;
		for (j = 1; j <= i; j++)
		{
			printf("%d*%d=%2d ", i, j, i*j);
		}
		printf("\n");
	}
}
int main()
{
	int n = 0;
	scanf("%d", &n);
	chengfabiao(n);
	return 0;
}

