#define _CRT_SECURE_NO_WARNINGS
#include <stdio.h>
#include <string.h>

int main()
{
	char arr[] = { 'a','b','c','d','e','f' };
    printf("%d\n", sizeof(arr));//6
    printf("%d\n", sizeof(arr + 0));//4
    printf("%d\n", sizeof(*arr));//1
    printf("%d\n", sizeof(arr[1]));//1
    printf("%d\n", sizeof(&arr));//4
    printf("%d\n", sizeof(&arr + 1));//4
    printf("%d\n", sizeof(&arr[0] + 1));//4
	printf("*******************************\n");

    printf("%d\n", strlen(arr)); //��'\0'�����  x
    printf("%d\n", strlen(arr + 0));//x  ��Ԫ�ص�ַ
//	printf("%d\n", strlen(*arr));// �� �����ǵ�ַ ���������a 97 
//	printf("%d\n", strlen(arr[1]));//��
    printf("%d\n", strlen(&arr)); // ����� x  &arr��arr ��ַ��һ����
    printf("%d\n", strlen(&arr + 1));//x-6 &arr ����ĵ�ַ��һ
    printf("%d\n", strlen(&arr[0] + 1));//x-1  ��һ��Ԫ�صĵ�ַ��1
	printf("********************************\n");

	char brr[] = "abcdef";
	printf("%d\n", sizeof(brr));//7
	printf("%d\n", sizeof(brr + 0));//4
	printf("%d\n", sizeof(*brr));//1
	printf("%d\n", sizeof(brr[1]));//1
	printf("%d\n", sizeof(&brr));//4
	printf("%d\n", sizeof(&brr + 1));//4
	printf("%d\n", sizeof(&brr[0] + 1));//4
	printf("*******************************\n");

	printf("%d\n", strlen(brr)); //6
	printf("%d\n", strlen(brr + 0));//6
//	printf("%d\n", strlen(*brr));// �� �����ǵ�ַ ���������a 97 
//	printf("%d\n", strlen(brr[1]));//��
	printf("%d\n", strlen(&brr)); // 6
	printf("%d\n", strlen(&brr + 1));//x
	printf("%d\n", strlen(&brr[0] + 1));//5
	printf("********************************\n");

	char *p = "abcdef";
	printf("%d\n", sizeof(p));//7
	printf("%d\n", sizeof(p + 0));//4
	printf("%d\n", sizeof(*p));//1
	printf("%d\n", sizeof(p[1]));//1
	printf("%d\n", sizeof(&p));//4
	printf("%d\n", sizeof(&p + 1));//4
	printf("%d\n", sizeof(&p[0] + 1));//4
	printf("*******************************\n");

	printf("%d\n", strlen(p)); //6
	printf("%d\n", strlen(p + 0));//6
//	printf("%d\n", strlen(*p));// �� �����ǵ�ַ ���������a 97 
//	printf("%d\n", strlen(p[1]));//��
	printf("%d\n", strlen(&p)); // 6
	printf("%d\n", strlen(&p + 1));//x
	printf("%d\n", strlen(&p[0] + 1));//5
	printf("********************************\n");
	return 0;
}