#define _CRT_SECURE_NO_WARNINGS 1
#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include <assert.h>

char* my_strcat(char* dest, const char* src)
{
	assert(dest != NULL);
	assert(src != NULL);
	char* ret = dest;
	//1.找到目标空间的第一个'\0'
	while (*dest != '\0')
	{
		dest++;
	}
	//2.拷贝
	while (*dest++ = *src++)
	{
		;
	}
	return ret;
}
int main()
{
	char str1[20] = "abcdefg";
	my_strcat(str1, "hhhhh");
	printf("%s\n", str1);
	system("pause");
	return 0;
}