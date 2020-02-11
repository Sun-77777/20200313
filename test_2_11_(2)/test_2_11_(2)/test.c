#define _CRT_SECURE_NO_WARNINGS
#include <stdio.h>
#include <windows.h>
int main()
{
	unsigned int i;
	for (i = 9; i >= 0; i--)
	{
		Sleep(100);
		printf("%u\n", i);
	}
	//9 8 7 6 5 4 3 2 1 0 32¸ö1 --
	//ËÀÑ­»·
	return 0;
}
//int main()
//{
//	unsigned char i = 0;
//	for (i = 0; i <= 255; i++)
//	{
//		printf("hello world\n");
//	}
//	return 0;
//}