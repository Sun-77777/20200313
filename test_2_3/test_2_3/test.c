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
	printf("����aΪ:>");
	scanf("%d", &a);
	printf("����bΪ:>");
	scanf("%d", &b);
	swap(&a, &b);
	printf("����������a,b:\n");
	printf("a=%d b=%d\n", a, b);
	return 0;
}