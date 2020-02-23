#define _CRT_SECURE_NO_WARNINGS 1
#include <stdlib.h>
#include <stdio.h>
#include <string.h>
#include <assert.h>

int my_strncmp(const char* str1, const char* str2, int count)
{
	assert(str1 != NULL);
	assert(str2 != NULL);
	while (*str1 == *str2)
	{
		count--;
		str1++;
		str2++;
		if (count == 0)
		{
			return 0;
		}
	}
	return *str1 - *str2;

}
int main()
{
	char arr[] = "abcddff";
	int ret = my_strncmp(arr, "abcdeff", 5);
	printf("%d\n", ret);
	system("pause");
	return 0;
}