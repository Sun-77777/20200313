#define _CRT_SECURE_NO_WARNINGS
#include <stdio.h>

//ð������ ������������ 
//��һ��1��2�ȣ��ڶ���2��3�ȣ�....
//���ľͱ��ŵ������ ����һ��ð������
//��ʣ�µ�Ԫ�ؼ�������һ��ð������
//10������9�׾͹��� .
//��һ����9��Ԫ�ؽ��бȽ�.

void bubble_sort(int arr[], int sz)
{
	int i = 0;
	//ð�����������
	for (i = 0; i < sz - 1; i++)
	{
		int flag = 0;
		int j = 0;
		for (j = 0; j < sz - 1 - i; j++)
		{
			//һ��Ԫ�صıȽ�
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