#define _CRT_SECURE_NO_WARNINGS
#include <stdio.h>
#include <string.h>
#define NDEBUG
#include <assert.h>

int main()
{
	int a[] = { 1,2,3,4 };
	printf("%d\n", sizeof(a));//16
	printf("%d\n", sizeof(a+0));//��Ԫ�ص�ַ�Ĵ�С---�ֽ� 4
	printf("%d\n", sizeof(*a));//4 
	printf("%d\n", sizeof(a+1));//4
	printf("%d\n", sizeof(a[1]));//4
	printf("%d\n", sizeof(&a));//4 �����ַ 4��8
	printf("%d\n", sizeof(*&a));//16
	printf("%d\n", sizeof(&a+1));//4
	printf("%d\n", sizeof(&a[0]));//4
	printf("%d\n", sizeof(&a[0]+1));//4
    return 0;
}

//enum Option
//{
//	EXIT,//0
//	ADD,//1
//	SUB,//2
//	MUL,//3
//	DIV //4
//};
//void menu()
//{
//	printf("******************************\n");
//	printf("*****  1.add      2.sub  *****\n");
//	printf("*****  3.mul      4.div  *****\n");
//	printf("*****       0.exit       *****\n");
//	printf("******************************\n");
//
//}
//void Calc(int (*p)(int,int))
//{
//	int x = 0;
//	int y = 0;
//	int ret = 0;
//	printf("��������������:>");
//	scanf("%d %d", &x, &y);
//	//ret = Add(x, y);
//	ret = p(x, y);
//	printf("ret=%d\n", ret);
//}
//int Add(int x, int y)
//{
//	return x + y;
//}
//int Sub(int x, int y)
//{
//	return x - y;
//}
//int Mul(int x, int y)
//{
//	return x * y;
//}
//int Div(int x, int y)
//{
//	return x / y;
//}
//int main()
//{
//	int input = 0;
//	int x = 0;
//	int y = 0;
//	int ret = 0;
//	do
//	{
//		menu();
//		printf("������ѡ��:>");
//		scanf("%d", &input);
//		switch (input)
//		{
//		case ADD:
//			Calc(Add);
//			break;
//		case SUB:
//			Calc(Sub);
//			break;
//		case MUL:
//			Calc(Mul);
//			break;
//		case DIV:
//			Calc(Div);
//			break;
//		case EXIT:
//			printf("�˳���\n");
//			break;
//		default:
//			printf("�������\n");
//			break;
//		}
//	} while (input);
//	return 0;
//}


//int check_sys()
//{
//	//2
//	union Un
//	{
//		char c;
//		int i;
//	}un;
//	un.i = 1;
//	return un.c;
//	//1
//	/*int a = 1;
//	return *(char*)&a;*/
//	/*if (*(char*)&a == 1)
//		return 1;
//	else
//		return 0;*/
//}
//int main()
//{
//	int ret = check_sys();
//	if (ret == 1)
//	{
//		printf("С��\n");
//	}
//	else
//		printf("���\n");
//	return 0;
//}

//int my_strlen(char* str)
//{
//	//ָ���ָ��
//	char* eos = str;
//	while (*str != '\0')
//	{
//		str++;
//	}
//	int end = str - eos;
//	return end;
//	//return str-eos;
//	//�ݹ�
//	/*assert(str != NULL);
//	return 1 + my_strlen(str + 1);*/
//	/*if (*str == '\0')
//		return 0;
//	else
//		return 1 + my_strlen(str + 1);
//	*/
//	/*int count = 0;
//	assert(str != NULL);
//	while (*str != '\0')
//	{
//		count++;
//		str++;
//	}
//	return count;*/
//}
//int main()
//{
//	char *p = "abcd";
//	int len = my_strlen(p);
//	printf("%d", len);
//	return 0;
//}
//char* my_strcpy(char* dest, const char* src)
//{
//	assert(dest != NULL);
//	assert(src != NULL);
//	char* ret = dest;
//	while (*ret++ = *src++)
//	{
//		;
//	}
//	return dest;
//}
//int main()
//{
//	char arr[10] = { 0 };
//	char* p = "abc";
//	my_strcpy(arr, p);
//	printf("%s", arr);
//	return 0;
//}