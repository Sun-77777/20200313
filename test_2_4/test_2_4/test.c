#define _CRT_SECURE_NO_WARNINGS
#include <stdio.h>

//int my_strlen(char *str)
//{
//	int count = 0;
//	while (*str != '\0')
//	{
//		count++;
//		str++;
//	}
//	return count;
//}

//µİ¹é
//int my_strlen(char *str)
//{
//	if (*str == '\0')
//		return 0;
//	else
//		return 1 + my_strlen(str + 1);
//}

//Ö¸ÕëÔËËã
int my_strlen(char *str)
{
	char *eos = str;
	while (*str != '\0')
	{
		str++;
	}
	return str - eos;
}
int main()
{
	char *p = "abcdef";
	int len = my_strlen(p);
	printf("%d\n", len);
	return 0;
}