#define _CRT_SECURE_NO_WARNINGS
#include <stdio.h>

int main()
{
	int a = 0;
	int arr[10] = { 0 };

	printf("%d\n", sizeof(a));
	printf("%d\n", sizeof(int));

	printf("%d\n", sizeof(arr));
	printf("%d\n", sizeof(int[10]));

	return 0;
}
//int main()
//{
//	int *p1;
//	void* p2 = p1;
//	return 0;
//}
//void test()
//{
//	printf("hehe\n");
//}
//void test2(void)
//{
//	printf("test2\n");
//}
//int main()
//{
//	test2(2);
//	return 0;
//}

//int main()
//{
//	short a;//2个字节
//	unsigned short a;
//	char c;
//	signed char c1;//有符号的
//	unsigned char c2;//无符号的
//	return 0;
//}