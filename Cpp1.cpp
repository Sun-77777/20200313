#include <stdio.h>

int my_strcmp(const char *str1,const char *str2)
{
	while(*str1 == *str2)
	{
		if(*str1 =='\0')
		{
			return 0;
		}
		str1++;
		str2++;
	}
	return *str1 - *str2;

}

int main()
{
	int ret=my_strcmp("abcde","abcdfdd");
	printf("%d\n",ret);
	return 0;
}