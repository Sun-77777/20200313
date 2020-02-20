#include <stdio.h>
#include <string.h>

int main()
{
	char *str = "zpengwei@yeah.net";
	char arr[20] = {0};
	char *ret = NULL;
	char *p = "@.";

	strcpy(arr,str);

	for(ret = strtok(arr,p);ret!=NULL;ret = strtok(NULL,p))
	{
		printf("%s\n",ret);
	}
	return 0;
}