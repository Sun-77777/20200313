#define _CRT_SECURE_NO_WARNINGS
#include <stdio.h>

#define NDEBUG
#include <assert.h>

int my_strlen(char* str)
{
	//÷∏’Îºı÷∏’Î
	char* eos = str;
	while (*str != '\0')
	{
		str++;
	}
	int end = str - eos;
	return end;
	//return str-eos;
	//µ›πÈ
	/*assert(str != NULL);
	return 1 + my_strlen(str + 1);*/
	/*if (*str == '\0')
		return 0;
	else
		return 1 + my_strlen(str + 1);
	*/
	/*int count = 0;
	assert(str != NULL);
	while (*str != '\0')
	{
		count++;
		str++;
	}
	return count;*/
}
int main()
{
	char *p = "abcd";
	int len = my_strlen(p);
	printf("%d", len);
	return 0;
}
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