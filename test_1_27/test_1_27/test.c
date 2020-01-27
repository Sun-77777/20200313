#define _CRT_SECURE_NO_WARNINGS
#include <stdio.h>

//菜单
void menu()
{
	printf("********************\n");
	printf("***** 1.初始化 *****\n");
	printf("***** 2. 清空  *****\n");
	printf("***** 3. 逆置  *****\n");
	printf("***** 0. 退出  *****\n");
	printf("********************\n");

}
//初始化数组
void init(int arr[],int sz,int set)
{
	int i = 0;
	for (i = 0; i < sz; i++)
	{
		arr[i] = set;
	}
}
//清空数组
void empty(int arr[],int sz)
{
	int i = 0;
	for (i = 0; i < sz; i++)
	{
		arr[i] = 0;
	}

}
//数组逆置
void reverse(int* arr, int sz)
{
	int i = 0;
	int tmp = 0;
	for (i = 0; i < sz / 2; i++)
	{
		tmp = arr[i];
		arr[i] = arr[sz - 1 - i];
		arr[sz - 1 - i] = tmp;
	}
}
void print(int* arr, int sz)
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
	int arr1[9] = { 2,5,6,7,3,1,8,9,0 };
	int input = 0;
	int i = 0;
	int sz = sizeof(arr1) / sizeof(arr1[0]);
	do
	{
		menu();
		scanf("%d", &input);
		switch (input)
		{
		case 1:
			init(arr1,sz,1);
			print(arr1, sz);
			break;
		case 2:
			empty(arr1,sz);
			print(arr1, sz);
			break;
		case 3:
			print(arr1, sz);
			reverse(arr1, sz);
			print(arr1,sz);
			break;
		case 0:
			break;
		}
	} while (input);

	return 0;
}