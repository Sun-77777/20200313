#define _CRT_SECURE_NO_WARNINGS 1
#include <stdlib.h>
#include <stdio.h>
#include <stddef.h>

/*
���㣺��μ��㣿���սṹ��Ķ������
1.��һ����Ա��Զ�����ڽṹ����ʼλ�õ�0ƫ�ƴ���
2.�ӵڶ�����Ա��ʼ��ÿ����Ա��Ҫ����ĳ������������������ƫ�ƴ���
  ��������
     ��Ա����Ĵ�С��Ĭ�϶������Ľ�Сֵ
	 VS 2013 2018 Ĭ�϶�������8  Linux gcc��4
3.�ṹ����ܴ�С ���������г�Ա�Ķ�����������������������
*/
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
struct S3
{
	double d; //0-7
	char c;//8
	int i;//12-15
};
struct S4
{
	char c1;//0
	struct S3 s3;//8-15
	double d;//16-31

};
int main()
{
	printf("%d\n", offsetof(struct S2, c1)); //0  ��һ���ֽ��������ʼλ�õ�ƫ���� 
	printf("%d\n", offsetof(struct S2, c2));//1
	printf("%d\n", offsetof(struct S2, i));//4
	
	//struct S1 s = { 0 };
	printf("%d\n", sizeof(struct S1));//12
	system("pause");
	return 0;
}