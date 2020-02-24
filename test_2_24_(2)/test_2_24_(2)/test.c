#define _CRT_SECURE_NO_WARNINGS 1
#include <stdlib.h>
#include <stdio.h>
#include <stddef.h>

struct S1
{
	char c1;
	int i;
	char c2;
};

struct S2
{
	char c1;
	char c2;
	int i;
};
int main()
{
	printf("%d\n", offsetof(struct S2, c1)); //0  第一个字节相对于起始位置的偏移量 
	printf("%d\n", offsetof(struct S2, c2));//1
	printf("%d\n", offsetof(struct S2, i));//4

	//struct S1 s = { 0 };
	printf("%d\n", sizeof(struct S1));//12
	system("pause");
	return 0;
}