#define _CRT_SECURE_NO_WARNINGS
#include <stdio.h>

int check_sys()
{
	//2
	union Un
	{
		char c;
		int i;
	}un;
	un.i = 1;
	return un.c;
	//1
	/*int a = 1;
	return *(char*)&a;*/
	/*if (*(char*)&a == 1)
		return 1;
	else
		return 0;*/
}
int main()
{
	int ret = check_sys();
	if (ret == 1)
	{
		printf("Ð¡¶Ë\n");
	}
	else
		printf("´ó¶Ë\n");
	return 0;
}