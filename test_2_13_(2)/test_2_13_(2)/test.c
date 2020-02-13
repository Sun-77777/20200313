#define _CRT_SECURE_NO_WARNINGS
#include <stdio.h>

//º¯ÊıÖ¸Õë
int Add(int x, int y)
{
	return x + y;
}
int main()
{
	//int arr[10];
	int(*p)(int, int) = Add;
	printf("%d\n", p(1, 2));
	//int(*p2)[10] = &arr;
	return 0;
}