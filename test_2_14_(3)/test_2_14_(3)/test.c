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
void Calc(int(*p)(int, int))
{
	int x = 0;
	int y = 0;
	int ret = 0;
	printf("��������������:>");
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
		printf("������ѡ��:>");
		scanf("%d", &input);
		switch (input)
		{
		case 1:
			Calc(Add);
			break;
		case 2:
			Calc(Sub);
			break;
		case 3:
			Calc(Mul);
			break;
		case 4:
			Calc(Div);
			break;
		case 0:
			printf("�˳���\n");
			break;
		default:
			printf("�������\n");
			break;
		}
	} while (input);
	return 0;
}