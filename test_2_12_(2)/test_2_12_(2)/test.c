#define _CRT_SECURE_NO_WARNINGS
#include <stdio.h>

int main()
{
	char str1[] = "abcdef";
	char str2[] = "abcdef";
	char* p1 = "abcdef";
	char* p2 = "abcdef";

	//创建了两个数组 首地址自然不一样
	if (str1 == str2)
		printf("str1 = str2");
	if (p1 == p2)
		printf("p1 = p2");
	
	return 0;
}