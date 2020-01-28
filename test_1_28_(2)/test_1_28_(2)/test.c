#define _CRT_SECURE_NO_WARNINGS
#include <stdio.h>

//冒泡排序 ：相邻两个比 
//第一次1，2比，第二次2，3比，....
//最大的就被放到最后面 这是一套冒泡排序，
//对剩下的元素继续进行一套冒泡排序。
//10个数字9套就够了 .
//第一套有9对元素进行比较.

void bubble_sort(int arr[], int sz)
{
	int i = 0;
	//冒泡排序的套数
	for (i = 0; i < sz - 1; i++)
	{
		int flag = 0;
		int j = 0;
		for (j = 0; j < sz - 1 - i; j++)
		{
			//一对元素的比较
			if (arr[j] > arr[j + 1])
			{
				int tmp = arr[j];
				arr[j] = arr[j + 1];
				arr[j + 1] = tmp;
				flag = 1;
			}
		}
		if (flag == 0)
			break;
	}
}
void print_arr(int arr[], int sz)
{
	int i = 0;
	for (i = 0; i < sz; i++)
	{
		printf("%d ", arr[i]);
	}
	printf("\n");
}
int main()
{
	int arr[] = { 9,8,7,6,5,4,3,2,1,0 };
	int sz = sizeof(arr) / sizeof(arr[0]);
	print_arr(arr, sz);
	bubble_sort(arr, sz);
	print_arr(arr, sz);
	return 0;
}