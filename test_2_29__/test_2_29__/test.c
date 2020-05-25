#define _CRT_SECURE_NO_WARNINGS 1
#include <stdlib.h>
#include <stdio.h>

int repeatedSubstringPattern(char * s){
	char *s1 = s;
	char *s2 = s + 1;
	while (s1)
	{
		//abab
		while (*s1 == *s2)
		{
			s2++;
		}
		s2++;
		
	}
	return 0;
}
int main()
{
	char* s = "abab";
	int ret = repeatedSubstringPattern(s);
	printf("%d\n", ret);
	system("pause");
	return 0;
}