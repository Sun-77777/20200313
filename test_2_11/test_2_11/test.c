#define _CRT_SECURE_NO_WARNINGS
#include <stdio.h>
#include <string.h>
int main()
{
	int n = 9;
	float *pFloat = (float *)&n;
	printf("n��ֵΪ:%d\n", n);//9
	printf("*pFloat��ֵΪ:%f\n", *pFloat);  //0.000000
	//0000 0000 0000 0000 0000 0000 0000 1001   ->9  ����������
	//0 00000000 00000000000000000001001   <---   9 ������������
	//��-1��^0 * 2^(1-127) * 0.00000000000000000001001 = 0.000000

	*pFloat = 9.0;
	printf("num��ֵΪ:%d\n", n);
	//0 1000 0010 00100000000000000000000  --> 9.0  ������������
	//������������  �������� ���뼴ԭ��  

	printf("*pFloat��ֵΪ:%f\n", *pFloat);//9.0

	char a[1000];
	int i;
	for (i = 0; i < 1000; i++)
	{
		a[i] = -1 - i;
	}
	//-1 -2 ..-128 127 126 ...4 3 2 1 0 -1 ...
	//'\0'ֵ��0  a�ĳ���Ҳ����0֮ǰ����
	printf("%d\n", strlen(a));

	char c = 127;
	char b = c + 1;
	printf("%d\n", b);
	//-128   ֱ��ʶ��Ϊ��Сֵ

	short num = 32767;
	short int aa = num + 1;
	printf("%d\n", aa);


	return 0;
}