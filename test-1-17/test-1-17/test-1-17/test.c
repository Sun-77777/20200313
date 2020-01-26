#define _CRT_SECURE_NO_WARNINGS
#include<stdio.h>

int main()
{
	//输出1~100的奇数
	int i = 0;
	for (i = 1; i <= 100; i++)
	{
		if (i%2 != 0)
		{
			printf("%d ", i);

		}
	}
	return 0;



//	int age = 0;
//	scanf("%d", &age);
//	if (age<18)
//		printf("未成年\n");
	//else if (age >= 18 && age <= 30)
		//printf("成年");
//	else if (age > 30 && age <= 50)
	//	printf("壮年");
//	else
//   	printf("老年");
//	return 0;
}

//代码块{}
//int age = 20;
//int main()
//{
//	int age = 10;
//    printf("age=%d\n", age);
//	return 0;
//}
//int  main()
//{
//	printf("hehe\n");
//	return 0;
//}