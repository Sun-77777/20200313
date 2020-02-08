#define _CRT_SECURE_NO_WARNINGS
#include <stdio.h>
#define NDEBUG
#include <assert.h>
char* my_strcpy(char* dest, const char* src)
{
	//if (src == NULL)  //每一次进来都要判断
	//	return;
	char* ret = dest;
	assert(src != NULL);//断言
	assert(dest != NULL);//断言
	while (*dest++ = *src++)
	{
		;
	}
	return ret;
	/*while (*src != '\0')
	{
		*dest = *src;
		src++;
		dest++;

	}
	*dest = *src;*/
}
int main()
{
	char arr[20] = { 0 };
	char* p = "hello";
	my_strcpy(arr, p);
	printf("%s\n", arr);
	return 0;
}