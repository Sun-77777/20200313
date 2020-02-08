#define _CRT_SECURE_NO_WARNINGS
#include <stdio.h>
#define NDEBUG
#include <assert.h>

int my_strlen(const char* str)
{
	int count = 0;
	assert(str != NULL);
	while (*str != '\0')
	{
		count++;
		str++;
	}
	return count;
}
int main()
{
	char* p = "abcdefg";
	//char arr[]="abcdefg";
	int len = my_strlen(p);
	printf("%d", len);
	return 0;
}