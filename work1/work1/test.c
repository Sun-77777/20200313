#define _CRT_SECURE_NO_WARNINGS

#include <stdio.h>

void menu()
{
	printf("*******************************\n");
	printf("*******  1.��ʼ��       *******\n");
	printf("*******  2.��ȫ�Լ��   *******\n");
	printf("*******  3.���м��㷨   *******\n");
	printf("*******  0.�˳�         *******\n");
	printf("*******************************\n");
}
void Init()
{
	int Sumnum = 0;//��Դ����ĸ���
	int pnum = 0;//������
	int Sum[10] = { 0 };//��Դ����
	int Max[10][10] = { 0 };//����������
	int ALL[10][10] = { 0 };//�ѷ������
	int AV[10] = { 0 };//ʣ����Դ��
	int Need[10][10] = { 0 };//�������
	char Rrocess[] = { 0 };//����������
	char Resource[] = { 0 };//��Դ������
	printf("������̵��ܸ���:");
	scanf("%d", &pnum);
	printf("������Դ���������:");
	scanf("%d", &Sumnum);
	printf("������̵�");
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
		printf("���������ѡ��:>");
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
			printf("�˳�����!\n");
			break;
		default:
			printf("�����������������!\n");
		}
		
	} while (input);
}