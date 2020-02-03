#define _CRT_SECURE_NO_WARNINGS
#include <stdio.h>
void swap(int* a,int* b)
{
	*a = *a ^ *b;
	*b = *a ^ *b;
	*a = *a ^ *b;
}
int main()
{
	int a = 0;
	int b = 0;
	printf("输入a为:>");
	scanf("%d", &a);
	printf("输入b为:>");
	scanf("%d", &b);
	swap(&a, &b);
	printf("输出交换后的a,b:\n");
	printf("a=%d b=%d\n", a, b);
	return 0;
}