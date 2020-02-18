#include <stdio.h>
int main()
{
	//a 数组里存的是字符指针，也就是work的地址，即w的地址
	char *a[] = {"work","at","alibaba"};
	char ** pa = a;
	pa++;
	printf("%s\n",*pa);
	return 0;
}