#include<stdio.h>

int main()
{
	int a[5][5];
	int (*p)[4];
	p = (int(*)[4])a;
	printf("a_ptr=%#p,p_ptr=%#p\n",&a[4][2],&p[4][2]);
	printf("%p,%d\n",&p[4][2]-&a[4][2],&p[4][2]-&a[4][2]);  // FFFFFFFC  -4
	//��a����pָ�� pָ������a��Ԫ�أ�p��ָ��һ��Ԫ��Ϊ4 �����顣

	return 0;
}