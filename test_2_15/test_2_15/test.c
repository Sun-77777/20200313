#define _CRT_SECURE_NO_WARNINGS
#include <stdio.h>

enum Option
{
	EXIT,//0
	ADD,//1
	SUB,//2
	MUL,//3
	DIV //4
};
void menu()
{
	printf("******************************\n");
	printf("*****  1.add      2.sub  *****\n");
	printf("*****  3.mul      4.div  *****\n");
	printf("*****       0.exit       *****\n");
	printf("******************************\n");

}
void Calc(int(*p)(int, int))
{
	int x = 0;
	int y = 0;
	int ret = 0;
	printf("请输入两个数字:>");
	scanf("%d %d", &x, &y);
	//ret = Add(x, y);
	ret = p(x, y);
	printf("ret=%d\n", ret);
}
int Add(int x, int y)
{
	return x + y;
}
int Sub(int x, int y)
{
	return x - y;
}
int Mul(int x, int y)
{
	return x * y;
}
int Div(int x, int y)
{
	return x / y;
}
int main()
{
	int input = 0;
	int x = 0;
	int y = 0;
	int ret = 0;
	do
	{
		menu();
		printf("请输入选择:>");
		scanf("%d", &input);
		switch (input)
		{
		case ADD:
			Calc(Add);
			break;
		case SUB:
			Calc(Sub);
			break;
		case MUL:
			Calc(Mul);
			break;
		case DIV:
			Calc(Div);
			break;
		case EXIT:
			printf("退出！\n");
			break;
		default:
			printf("输入错误\n");
			break;
		}
	} while (input);
	return 0;
}