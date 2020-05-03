#define _CRT_SECURE_NO_WARNINGS 1
#include <stdlib.h>
#include <stdio.h>
#include <stddef.h>

/*
考点：如何计算？掌握结构体的对齐规则
1.第一个成员永远都放在结构体起始位置的0偏移处。
2.从第二个成员开始，每个成员都要放在某个对齐数的整数倍的偏移处。
  对齐数：
     成员自身的大小和默认对齐数的较小值
	 VS 2013 2018 默认对齐数是8  Linux gcc：4
3.结构体的总大小 必须是所有成员的对齐数中最大对齐数的整数倍
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
	printf("%d\n", offsetof(struct S2, c1)); //0  第一个字节相对于起始位置的偏移量 
	printf("%d\n", offsetof(struct S2, c2));//1
	printf("%d\n", offsetof(struct S2, i));//4
	
	//struct S1 s = { 0 };
	printf("%d\n", sizeof(struct S1));//12
	system("pause");
	return 0;
}