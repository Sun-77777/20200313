#include <stdio.h>
#include <string.h>
#include <assert.h>

char * my_strstr(const char *str1,const char *str2)
{
	const char *s1 = str1;
	const char *s2 = str2;
	const char *cp = str1;
	assert(str1 != NULL);
	assert(str2 != NULL);

	if(*str2 == '\0')
		return (char *)str1;
	while(*cp)
	{
		s1 = cp;
		s2 = str2;
		while(*s1 && *s2 && *s1 == *s2)
		{
			s1++;
			s2++;
		}
		if(*s2 == '\0')
		{
			return (char *)cp;
		}
		cp++;
	}
	return NULL;
}
int main()
{
	char *p1 = "abcdef";
	char *p2 = "abccabcdfghiabcdefg";
	char *ret = my_strstr(p2,p1);
	printf("%s\n",ret);
	return 0;
}