#define _CRT_SECURE_NO_WARNINGS 1
#include <stdlib.h>
#include <stdio.h>
#include <string.h>

struct Stu 
{
	char name[20];
	int age;
};
int cmp_int(const void * e1, const void * e2)
{
	return *(int *)e1 - *(int *)e2;
}
void print_arr(int * arr, int sz)
{
	int i = 0;
	for (i = 0; i < sz; i++)
	{
		printf("%d ", arr[i]);
	}
}
int cmp_stu_by_name(const void * e1, const void * e2)
{
	return strcmp(((struct Stu*)e1)->name, ((struct Stu*)e2)->name);
}
void test1()
{
	struct Stu s[3] = { { "zhangsan", 20 }, { "lisi", 12 }, { "wangmazi", 19 } };
	int sz = sizeof(s) / sizeof(s[0]);
	qsort(s, sz, sizeof(s[0]), cmp_stu_by_name);
}
int main()
{
	int arr[] = { 9, 8, 7, 6, 5, 4, 3, 2, 1, 0 };
	int sz = sizeof(arr) / sizeof(arr[0]);
	qsort(arr, sz, sizeof(arr[0]), cmp_int);
	print_arr(arr, sz);
	test1();
	system("pause");
	return 0;
}