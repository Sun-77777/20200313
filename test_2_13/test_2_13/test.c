#define _CRT_SECURE_NO_WARNINGS
#include <stdio.h>
//��������
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

//��ά���鴫��
//void test1(int (*arr)[5])
//{}
//int main()
//{
//	int arr[3][5] = { 0 };
//	test1(arr);
//	return 0;
//}

//һά���鴫��
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
//	int arr[5]; //�������� 

//	int *parr1[10]; 
//	//�������ָ������� --��ָ������

//	int(*parr2)[10];
//	//����ָ��  ����һ��ָ�� ָ��һ�����飬������10��Ԫ�أ����������� 

//	int(*parr3[10])[5];
//	//�������ָ������� -- ��ָ������
//	//parr3 ��һ�����飬��ŵ���ָ�������ָ�룬ָ��������5 ��Ԫ�أ�ÿ��Ԫ�������Ρ�

//	return 0;
//}