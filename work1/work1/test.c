#define _CRT_SECURE_NO_WARNINGS

#include <stdio.h>

void menu()
{
	printf("*******************************\n");
	printf("*******  1.初始化       *******\n");
	printf("*******  2.安全性检测   *******\n");
	printf("*******  3.银行家算法   *******\n");
	printf("*******  0.退出         *******\n");
	printf("*******************************\n");
}
void Init()
{
	int Sumnum = 0;//资源种类的个数
	int pnum = 0;//进程数
	int Sum[10] = { 0 };//资源总数
	int Max[10][10] = { 0 };//最大需求矩阵
	int ALL[10][10] = { 0 };//已分配矩阵
	int AV[10] = { 0 };//剩余资源数
	int Need[10][10] = { 0 };//需求矩阵
	char Rrocess[] = { 0 };//进程名数组
	char Resource[] = { 0 };//资源名数组
	printf("输入进程的总个数:");
	scanf("%d", &pnum);
	printf("输入资源种类的总数:");
	scanf("%d", &Sumnum);
	printf("输入进程的");
}
void secure()
{

}
void bank()
{

}
int main()
{
	int input = 0;
	
	do
	{
		menu();
		printf("请输入你的选择:>");
		scanf("%d", &input);
		switch (input)
		{
		case 1:
			Init();
			break;
		case 2:
			secure();
			break;
		case 3:
			bank();
			break;
		case 0:
			printf("退出程序!\n");
			break;
		default:
			printf("输入错误，请重新输入!\n");
		}
		
	} while (input);
}