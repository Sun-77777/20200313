#define _CRT_SECURE_NO_WARNINGS
#include <stdio.h>

//int get_max(int x, int y)
//{
//	return x > y ? x : y;
//}
void swap(int *px, int *py)
{
	int tmp = *px;  
	*px = *py;
	*py = tmp;
}

int main()
{
	int a = 10;
	int b = 20;
	printf("a=%d b=%d\n", a, b);
	swap(&a, &b);
	printf("a=%d b=%d\n", a, b);
	/*int max = get_max(a, b);
	printf("max=%d\n",max);*/
	return 0;
}