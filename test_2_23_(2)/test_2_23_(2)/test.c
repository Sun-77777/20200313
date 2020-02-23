#define _CRT_SECURE_NO_WARNINGS 1
#include <stdlib.h>
#include <stdio.h>
#include <string.h>
#include <assert.h>

char * my_strncat(char * dest, const char * src, int count)
{
	assert(dest != NULL);
	assert(src != NULL);
	char* ret = dest;
	while (*dest != '\0')
	{
		dest++;
	}
	while (count--)
	{
		*dest++ = *src++;
	}
	return ret;
}
int main()
{
	char arr[20] = "abcdewww";
	my_strncat(arr, "fghijk", 5);
	printf("%s\n", arr);
	system("pause");
	return 0;
}