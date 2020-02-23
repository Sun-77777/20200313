#define _CRT_SECURE_NO_WARNINGS 1
#include <stdlib.h>
#include <stdio.h>
#include <assert.h>

char* my_strncpy(char* dest, const char* src, int count)
{
	assert(dest != NULL);
	assert(src != NULL);
	char *ret = dest;
	while (count--)
	{
		*dest = *src;
		dest++;
		src++;
	}
	return ret;
}
int main()
{
	char arr[20] = "qq";
	my_strncpy(arr, "hhhhh", 4);
	//²»¿¾'\0'  strcpy() ¿½'\0'
	
	printf("%s\n", arr);
	system("pause");
	return 0;
}