#define _CRT_SECURE_NO_WARNINGS 1
#include <stdlib.h>
#include <stdio.h>

/*
考点：如何计算？掌握结构体的对齐规则
1.第一个成员永远都放在结构体起始位置的0偏移处。
2.从第二个成员开始，每个成员都要放在某个对齐数的整数倍的偏移处。
对齐数：
成员自身的大小和默认对齐数的较小值
VS 2013 2018 默认对齐数是8  Linux gcc：4
3.结构体的总大小 必须是所有成员的对齐数中最大对齐数的整数倍
4.如果结构体中嵌套了结构体，嵌套的结构体要对齐到自身最大对齐数的
  整数倍处，结构体的整体大小就是所有对齐数（含嵌套结构体的对齐数）的整数倍。
*/

struct S3
{
	double d; //0-7
	char c;//8
	int i;//12-15
};
struct S4
{
	char c1;//0
	struct S3 s3;//8-23
	double d;//24-31
};
int main()
{
	printf("%d\n", sizeof(struct S3));//16
	printf("%d\n", sizeof(struct S4));//32
	system("pause");
	return 0;
}