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
	//1.�ҵ�Ŀ��ռ�ĵ�һ��'\0'
	while (*dest != '\0')
	{
		dest++;
	}
	//2.����
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