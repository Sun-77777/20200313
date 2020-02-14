#define _CRT_SECURE_NO_WARNINGS
#include <stdio.h>

void menu()
{
	printf("******************************\n");
	printf("*****  1.add      2.sub  *****\n");
	printf("*****  3.mul      4.div  *****\n");
	printf("*****       0.exit       *****\n");
	printf("******************************\n");

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
		if (input >= 1 && input <= 4)
		{
			printf("请输入两个数字:>");
			scanf("%d %d", &x, &y);
		}
		switch (input)
		{
		case 1:
			ret = Add(x, y);
			printf("ret=%d\n", ret);
			break;
		case 2:
			ret = Sub(x, y);
			printf("ret=%d\n", ret);
			break;
		case 3:
			ret = Mul(x, y);
			printf("ret=%d\n", ret);
			break;
		case 4:
			ret = Div(x, y);
			printf("ret=%d\n", ret);
			break;
		case 0:
			printf("退出！\n");
			break;
		default:
			printf("输入错误\n");
			break;
		}
	} while (input);
	return 0;
}