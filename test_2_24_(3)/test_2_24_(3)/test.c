#define _CRT_SECURE_NO_WARNINGS 1
#include <stdlib.h>
#include <stdio.h>
#include <assert.h>


//×Ö·û´®Æ¥Åä£¨abcdeabcbde    abcb£©

char* my_strstr(const char* str1, const char* str2)
{
	assert(str1 != NULL);
	assert(str2 != NULL);

	const char* s1 = str1;
	const char* s2 = str2;
	const char* cp = str1;

	while (cp)
	{
		s1 = cp;
		s2 = str2;

		while (*s1 == *s2)
		{
			s1++;
			s2++;
		}
		if (*s2 == '\0')
			return (char*)cp;
		cp++;
	}
	return NULL;
}
int main()
{
	char* arr = "abcdeabcbde";
	char* ret = my_strstr(arr, "abcb");
	printf("%s\n", ret);
	system("pause");
	return 0;
}