#define _CRT_SECURE_NO_WARNINGS
#include <stdio.h>
#define NDEBUG
#include <assert.h>
char* my_strcpy(char* dest, const char* src)
{
	//if (src == NULL)  //ÿһ�ν�����Ҫ�ж�
	//	return;
	char* ret = dest;
	assert(src != NULL);//����
	assert(dest != NULL);//����
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