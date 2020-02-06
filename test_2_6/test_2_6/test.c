#define _CRT_SECURE_NO_WARNINGS
#include <stdio.h>

struct S
{
	char data[1000];
	int n;
};
void print1(struct S ss)
{
	printf("%s %d\n", ss.data, ss.n);
}
void print2(struct S* ps)
{
	printf("%s %d\n", ps->data, ps->n);
}
int main()
{
	struct S s = { "zhangsan",100 };
	print1(s);
	print2(&s);
	return 0;
}