#define _CRT_SECURE_NO_WARNINGS
#include <stdio.h>
#include <string.h>
int main()
{
	int n = 9;
	float *pFloat = (float *)&n;
	printf("n的值为:%d\n", n);//9
	printf("*pFloat的值为:%f\n", *pFloat);  //0.000000
	//0000 0000 0000 0000 0000 0000 0000 1001   ->9  按整形来存
	//0 00000000 00000000000000000001001   <---   9 按浮点数来存
	//（-1）^0 * 2^(1-127) * 0.00000000000000000001001 = 0.000000

	*pFloat = 9.0;
	printf("num的值为:%d\n", n);
	//0 1000 0010 00100000000000000000000  --> 9.0  按浮点数来存
	//浮点数变整形  （正数） 补码即原码  

	printf("*pFloat的值为:%f\n", *pFloat);//9.0

	char a[1000];
	int i;
	for (i = 0; i < 1000; i++)
	{
		a[i] = -1 - i;
	}
	//-1 -2 ..-128 127 126 ...4 3 2 1 0 -1 ...
	//'\0'值是0  a的长度也就是0之前的数
	printf("%d\n", strlen(a));

	char c = 127;
	char b = c + 1;
	printf("%d\n", b);
	//-128   直接识别为最小值

	short num = 32767;
	short int aa = num + 1;
	printf("%d\n", aa);


	return 0;
}