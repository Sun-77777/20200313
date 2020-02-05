#define _CRT_SECURE_NO_WARNINGS
#include <stdio.h>

void print(int* arr, int sz)
{
	int i = 0;
	for (i = 0; i < sz; i++)
	{
		printf("%d ", *(arr + i));
//	    printf("%d ", *arr++);
	}
}
int main()
{
	int arr[10] = { 0 };
	int* p = arr;
	int sz = sizeof(arr) / sizeof(arr[0]);
	int i = 0;
	for (i = 0; i < sz; i++)
	{
		*(p + i) = 9;
	}
	print(arr, sz);
	
	return 0;
}