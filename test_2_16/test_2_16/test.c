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

    printf("%d\n", strlen(arr)); //无'\0'随机数  x
    printf("%d\n", strlen(arr + 0));//x  首元素地址
//	printf("%d\n", strlen(*arr));// × 参数是地址 这个参数是a 97 
//	printf("%d\n", strlen(arr[1]));//×
    printf("%d\n", strlen(&arr)); // 随机数 x  &arr与arr 地址是一样的
    printf("%d\n", strlen(&arr + 1));//x-6 &arr 数组的地址加一
    printf("%d\n", strlen(&arr[0] + 1));//x-1  第一个元素的地址加1
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
//	printf("%d\n", strlen(*brr));// × 参数是地址 这个参数是a 97 
//	printf("%d\n", strlen(brr[1]));//×
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
//	printf("%d\n", strlen(*p));// × 参数是地址 这个参数是a 97 
//	printf("%d\n", strlen(p[1]));//×
	printf("%d\n", strlen(&p)); // 6
	printf("%d\n", strlen(&p + 1));//x
	printf("%d\n", strlen(&p[0] + 1));//5
	printf("********************************\n");
	return 0;
}