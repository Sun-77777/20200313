#include <stdio.h>
int main()
{
	//a �����������ַ�ָ�룬Ҳ����work�ĵ�ַ����w�ĵ�ַ
	char *a[] = {"work","at","alibaba"};
	char ** pa = a;
	pa++;
	printf("%s\n",*pa);
	return 0;
}