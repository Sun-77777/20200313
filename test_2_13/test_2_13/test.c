#define _CRT_SECURE_NO_WARNINGS
#include <stdio.h>
//函数传参
void test()
{
	printf("hehe\n");
}
int main()
{
	printf("%p\n", &test);
	printf("%p\n", test);
	test();
	(*test)();
	return 0;
}

//二维数组传参
//void test1(int (*arr)[5])
//{}
//int main()
//{
//	int arr[3][5] = { 0 };
//	test1(arr);
//	return 0;
//}

//一维数组传参
//void test(int arr[])
//{}
//void test(int* arr)
//{}
//void test2(int* arr[20])
//{}
//void test2(int** arr)
//{}
//int main()
//{
//	int arr[10] = { 0 };
//	int *arr2[20] = { 0 };
//	test(arr);
//	test2(arr2);
//	return 0;
//}

//int main()
//{
//	int arr[5]; //整形数组 

//	int *parr1[10]; 
//	//存放整形指针的数组 --即指针数组

//	int(*parr2)[10];
//	//数组指针  它是一个指针 指向一个数组，数组有10个元素，类型是整形 

//	int(*parr3[10])[5];
//	//存放数组指针的数组 -- 即指针数组
//	//parr3 是一个数组，存放的是指向数组的指针，指向数组有5 个元素，每个元素是整形。

//	return 0;
//}