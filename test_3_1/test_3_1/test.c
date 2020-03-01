#define _CRT_SECURE_NO_WARNINGS 1
#include <stdlib.h>
#include <stdio.h>
#include <string.h>

//Æ½ºâ·Ö¸î×Ö·û´®
int balancedStringSplit(char * s)
{
	int count = 0;
	int c = 0;
	int i = 0;
	for (i = 0; i < strlen(s); i++)
	{
		if (s[i] == 'R')
		{
			c++;
		}
		else
		{
			c--;
		}
		if (c == 0)
			count++;
	}
	return count;
}
int main()
{
	char * s = "RRLLRLRRRLLL";
	int ret = balancedStringSplit(s);
	printf("%d\n", ret);
	system("pause");
	return 0;
}