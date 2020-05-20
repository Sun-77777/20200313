#define _CRT_SECURE_NO_WARNINGS
#include <stdio.h>
//#define NDEBUG
//#include <assert.h>
#include<windows.h>
#include <string.h>
//char arr[] = { 'a','b','c','d','e','f' };
//printf("%d\n", sizeof(arr));//6
//printf("%d\n", sizeof(arr + 0));//4
//printf("%d\n", sizeof(*arr));//1
//printf("%d\n", sizeof(arr[1]));//1
//printf("%d\n", sizeof(&arr));//4
//printf("%d\n", sizeof(&arr + 1));//4
//printf("%d\n", sizeof(&arr[0] + 1));//4
//
//printf("%d\n", strlen(arr)); //无'\0'随机数  x
//printf("%d\n", strlen(arr + 0));//x  首元素地址
////	printf("%d\n", strlen(*arr));// × 参数是地址 这个参数是a 97 
////	printf("%d\n", strlen(arr[1]));//×
//printf("%d\n", strlen(&arr)); // 随机数 x  &arr与arr 地址是一样的
//printf("%d\n", strlen(&arr + 1));//x-6 &arr 数组的地址加一
//printf("%d\n", strlen(&arr[0] + 1));//x-1  第一个元素的地址加1

//
//void menu()
//{
//	printf("******************************\n");
//	printf("*****  1.add      2.sub  *****\n");
//	printf("*****  3.mul      4.div  *****\n");
//	printf("*****       0.exit       *****\n");
//	printf("******************************\n");
//
//}
//
//int Add(int x, int y)
//{
//	return x + y;
//}
//int Sub(int x, int y)
//{
//	return x - y;
//}
//int Mul(int x, int y)
//{
//	return x * y;
//}
//int Div(int x, int y)
//{
//	return x / y;
//}
//int main()
//{
//	int input = 0;
//	int x = 0;
//	int y = 0;
//	int ret = 0;
//	int(*p[5])(int, int) = {0, Add, Sub, Mul, Div };
//
//	do
//	{
//		menu();
//		printf("请输入选择:>");
//		scanf("%d", &input);
//		if (input >= 1 && input <= 4)
//		{
//			printf("请输入两个数字:>");
//			scanf("%d %d", &x, &y);
//		}
//		ret = p[input](x, y);
//		printf("ret=%d\n", ret);
//		//int(*p)(int, int)[5] = {0, Add,Sub,Mul,Div };
//		/*switch (input)
//		{
//		case 1:
//		    ret = Add(x, y);
//			printf("ret=%d\n", ret);
//			break;
//		case 2:
//			ret = Sub(x, y);
//			printf("ret=%d\n", ret);
//			break;
//		case 3:
//			ret = Mul(x, y);
//			printf("ret=%d\n", ret);
//			break;
//		case 4:
//			ret = Div(x, y);
//			printf("ret=%d\n", ret);
//			break;
//		case 0:
//			printf("退出！\n");
//			break;
//		default:
//			printf("输入错误\n");
//			break;
//		}*/
//	} while (input);
//	return 0;
//}

////函数指针数组
//int(*arr3[10])();

//函数指针
//int Add(int x, int y)
//{
//	return x + y;
//}
//int main()
//{
//	//int arr[10];
//	int (*p)(int, int) = Add;
//	printf("%d\n", p(1, 2));
//	//int(*p2)[10] = &arr;
//	return 0;
//}

//(*(void(*)())0)();
// 这是一个函数调用  是0地址处的无参数无返回类型的函数的调用。

//void(*signal(int, void(*)(int)))(int);
//这是一个函数声明   

//说明signal是一个函数，函数参数是int和函数指针，函数返回类型是函数指针。


//函数传参
//void test()
//{
//	printf("hehe\n");
//}
//int main()
//{
//	printf("%p\n", &test);
//	printf("%p\n", test);
//	test();
//	(*test)();
//	return 0;
//}
////二维数组传参
//void test1(int (*arr)[5])
//{}
//int main()
//{
//	int arr[3][5] = { 0 };
//	test1(arr);
//	return 0;
//}
//一维数组传参
//void test(int arr[])
//{}
//void test(int* arr)
//{}
//void test2(int* arr[20])
//{}
//void test2(int** arr)
//{}
//int main()
//{
//	int arr[10] = { 0 };
//	int *arr2[20] = { 0 };
//	test(arr);
//	test2(arr2);
//	return 0;
//}
//int main()
//{
//	int arr[5]; //整形数组 
//	int *parr1[10]; 
//	//存放整形指针的数组 --即指针数组
//	int(*parr2)[10];
//	//数组指针  它是一个指针 指向一个数组，数组有10个元素，类型是整形 
//	int(*parr3[10])[5];
//	//存放数组指针的数组 -- 即指针数组
//	//parr3 是一个数组，存放的是指向数组的指针，指向数组有5 个元素，每个元素是整形。
//	return 0;
//}
//void print(int arr[3][5], int x, int y)
//{
//	int i = 0;
//	int j = 0;
//	for (i = 0; i < x; i++)
//	{
//		for (j = 0; j < y; j++)
//		{
//			printf("%d ", arr[i][j]);
//		}
//		printf("\n");
//	}
//}
//void print1(int(*arr)[5], int x, int y)
//{
//	int i = 0;
//	int j = 0;
//	for (i = 0; i < x; i++)
//	{
//		for (j = 0; j < y; j++)
//		{
//			printf("%d ", *(*(arr + i) + j));
//		}
//		printf("\n");
//	}
//}
//int main()
//{
//	int arr[3][5] = { 1,2,3,4,5,2,3,4,5,6,3,4,5,6,7 };
//	print(arr, 3, 5);
//	printf("**************\n");
//	print1(arr, 3, 5);
//	return 0;
//}
//int main()
//{
//	char str1[] = "abcdef";
//	char str2[] = "abcdef";
//	char* p1 = "abcdef";
//	char* p2 = "abcdef";
//
//	//创建了两个数组 首地址自然不一样
//	if (str1 == str2)
//		printf("str1 = str2");
//	if (p1 == p2)
//		printf("p1 = p2");
//	
//	return 0;
//}
//int main()
//{
//	/*char ch = 'w';
//	char* pc = &ch;
//	*pc = 'a';*/
//	char *p = "abcdef";
//	printf("%s\n", p);
//	return 0;
//}
//int main()
//{
//	int n = 9;
//	float *pFloat = (float *)&n;
//	printf("n的值为:%d\n", n);//9
//	printf("*pFloat的值为:%f\n", *pFloat);  //0.000000
//	//0000 0000 0000 0000 0000 0000 0000 1001   ->9  按整形来存
//	//0 00000000 00000000000000000001001   <---   9 按浮点数来存
//	//（-1）^0 * 2^(1-127) * 0.00000000000000000001001 = 0.000000
//
//	*pFloat = 9.0;
//	printf("num的值为:%d\n",n);
//	//0 1000 0010 00100000000000000000000  --> 9.0  按浮点数来存
//	//浮点数变整形  （正数） 补码即原码  
//	
//	printf("*pFloat的值为:%f\n", *pFloat);//9.0
//
//	char a[1000];
//	int i;
//	for (i = 0; i < 1000; i++)
//	{
//		a[i] = -1 - i;
//	}
//	//-1 -2 ..-128 127 126 ...4 3 2 1 0 -1 ...
//	//'\0'值是0  a的长度也就是0之前的数
//	printf("%d\n", strlen(a));
//
//	char c = 127;
//	char b = c + 1;
//	printf("%d\n", b);
//	//-128   直接识别为最小值
//
//	short num = 32767;
//	short int aa = num + 1;
//	printf("%d\n", aa);
//
//
//    return 0;
//}
//int main()
//{
//	unsigned char i = 0;
//	for (i = 0; i <= 255; i++)
//	{
//		printf("hello world\n");
//	}
//	return 0;
//}

//int main()
//{
//	unsigned int i;
//	for (i = 9; i >= 0; i--)
//	{
//		Sleep(100);
//		printf("%u\n", i);
//	}
	//9 8 7 6 5 4 3 2 1 0 32个1 --
	//死循环
//	return 0;
//}

//int main()
//{
//	int i = -20;
	//1000 0000 0000 0000 0000 0000 0001 0100  原码
	//1111 1111 1111 1111 1111 1111 1110 1011  反码
	//1111 1111 1111 1111 1111 1111 1110 1100  补码

//	unsigned int j = 10;
	//0000 0000 0000 0000 0000 0000 0000 1010  原码
	//无符号位的整形  补码即原码

	//i+j即补码相加
	//1111 1111 1111 1111 1111 1111 1111 0110  补码
	//1111 1111 1111 1111 1111 1111 1111 0101  反码
	//1000 0000 0000 0000 0000 0000 0000 1010  原码
	//-10

//	printf("%d\n", i + j);
//	return 0;
//}


//int main()
//{
	//有符号位和无符号位是在内存中看补码
//	char a = -1;
	//1111 1111  有符号位的char 高位补1
	//1111 1111 1111 1111 1111 1111 1111 1111  补码
	//1111 1111 1111 1111 1111 1111 1111 1110  反码
	//1000 0000 0000 0000 0000 0000 0000 0001  原码
	//-1
//	signed char b = -1;
	//1111 1111  有符号位的char 高位补1
	//1111 1111 1111 1111 1111 1111 1111 1111  补码
	//1111 1111 1111 1111 1111 1111 1111 1110  反码
	//1000 0000 0000 0000 0000 0000 0000 0001  原码
	//-1
//	unsigned char c = -1;
	//1111 1111  无符号位的char 高位补0
	//0000 0000 0000 0000 0000 0000 1111 1111  补码
	//补码即原码  255

//	char d = -128;
//	//1000 0000 0000 0000 0000 0000 1000 0000  char有符号位高位补1
//	//1111 1111 1111 1111 1111 1111 0111 1111  反码
//	//1111 1111 1111 1111 1111 1111 1000 0000  补码
//	//1000 0000  只能存8位-->整形提升
//	//1111 1111 1111 1111 1111 1111 1000 0000  高位补1
//	//无符号输出  补码即原码
//	printf("d=%u\n", d);
//
//	char e = 128;
//	//0000 0000 0000 0000 0000 0000 1000 0000
//	//1000 0000 -->整形提升
//	//1111 1111 1111 1111 1111 1111 1000 0000
//	printf("e=%u\n", e);
//
//	printf("a=%d b=%d c=%d\n", a, b, c);
//	return 0;
//}

//int main()
//{
//	int a = 1;
//	int* p = &a;
//	printf("%p\n", p);
//	printf("%d\n", sizeof(p));//4
//	printf("%d\n", sizeof(*(char*)p));//1
//	printf("%d\n", sizeof(* p));//4
//
//	/*printf("%d\n", sizeof(int*));
//	printf("%d\n", sizeof(char*));
//	printf("%d\n", sizeof(short*));
//	printf("%d\n", sizeof(int*));
//	printf("%d\n", sizeof(int*));*/
//
//
//	return 0;
//}
//int main()
//{
//	int *p1;
//	void* p2 = p1;
//	return 0;
//}
//void test()
//{
//	printf("hehe\n");
//}
//void test2(void)
//{
//	printf("test2\n");
//}
//int main()
//{
//	test2(2);
//	return 0;
//}
//int main()
//{
//	int a = 0;
//	int arr[10] = { 0 };
//
//	printf("%d\n", sizeof(a));
//	printf("%d\n", sizeof(int));
//
//	printf("%d\n", sizeof(arr));
//	printf("%d\n", sizeof(int[10]));
//
//	return 0;
//}
//int main()
//{
//	short a;//2个字节
//	unsigned short a;
//	char c;
//	signed char c1;//有符号的
//	unsigned char c2;//无符号的
//	return 0;
//}
//int my_strlen(const char* str)
//{
//	int count = 0;
//	assert(str != NULL);
//	while(*str != '\0')
//	{
//		count++;
//		str++;
//	}
//	return count;
//}
//int main()
//{
//	char* p = "abcdefg";
//	//char arr[]="abcdefg";
//	int len = my_strlen(p);
//	printf("%d\n", len);
//    return 0;
//}
//char* my_strcpy(char* dest, const char* src)
//{
//	//if (src == NULL)  //每一次进来都要判断
//	//	return;
//	char* ret = dest;
//	assert(src != NULL);//断言
//	assert(dest != NULL);//断言
//	while (*dest++ = *src++)
//	{
//	    ;
//	}
//	return ret;
//	/*while (*src != '\0')
//	{
//		*dest = *src;
//		src++;
//		dest++;
//
//	}
//	*dest = *src;*/
//}
//int main()
//{
//	char arr[20] = { 0 };
//	char* p = NULL;
//	my_strcpy(arr, p);
//	printf("%s\n", arr);
//	return 0;
//}
//int main()
//{
//	int i = 0;
//	int arr[10] = { 1,2,3,4,5,6,7,8,9,10 };
//
//	for (i = 0; i <= 11; i++)
//	{
//		printf("hehe\n");
//		arr[i] = 0;
//	}
//	return 0;
//}
//int main()
//{
//	int i = 0;
//	int n = 0;
//	int s = 1;
//	int sum = 0;
//	scanf("%d", &n);
//	for (i = 1; i <= n; i++)
//	{
//		s = s * i;
//		sum = sum + s;
//	}
//	printf("%d", sum);
//	return 0;
//}
//#include <windows.h>
//
//struct S
//{
//	char data[1000];
//	int n;
//};
//void print1(struct S ss)
//{
//	printf("%s %d\n", ss.data, ss.n);
//}
//void print2(struct S* ps)
//{
//	printf("%s %d\n", ps->data, ps->n);
//}
//int main()
//{
//	struct S s = { "zhangsan",100 };
//	print1(s);
//	print2(&s);
//	return 0;
//}
//struct Student
//{
//	char name[20];
//	int age;
//	char sex[5];
//};
//int main()
//{
//	struct Student s = {"zhangsan",20,"男"};
//	printf("%s %d %s", s.name, s.age, s.sex);
//
//	return 0;
//}
//int main()
//{
//	int arr1[] = { 1,2,3,4,5 };
//	int arr2[] = { 2,3,4,5,6 };
//	int arr3[] = { 3,4,5,6,7 };
//	int arr4[] = { 4,5,6,7,8 };
//
//	int* arr[4] = { arr1,arr2,arr3,arr4 };
//
//	int i = 0;
//	int j = 0;
//	for (i = 0; i < 4; i++)
//	{
//		for (j = 0; j < 5; j++)
//		{
//			//printf("%d ", arr[i][j]);
//			printf("%d ", *(*(arr + i) + j));
//		}
//		printf("\n");
//	}
//	return 0;
//}


//void print(char* arr[], int sz)
//{
//	int i = 0;
//	for (i = 0; i < sz; i++)
//	{
//		printf("%s\n", arr[i]);
//	}
//}
//void print(char **arr, int sz)
//{
//	int i = 0;
//	for (i = 0; i < sz; i++)
//	{
//		printf("%s\n", arr[i]);
//		//printf("%s\n",*(arr+i));
//	}
//}
//int main()
//{
//	char* arr[3] = { "zhangsan","lisi","wangmazi" };
//	int i = 0;
//	int sz = sizeof(arr) / sizeof(arr[0]);
//	print(arr, sz);
//	/*for (i = 0; i < 3; i++)
//	{
//		printf("%s\n", arr[i]);
//	}*/
//	return 0;
//}
//void print(int* arr,int sz)
//{
//	int i = 0;
//	for (i = 0; i < sz; i++)
//	{
//		printf("%d ", *(arr + i));
////	    printf("%d ", *arr++);
//	}
//}
//int main()
//{
//	int arr[10] = { 0 };
//	int* p = arr;
//	int sz = sizeof(arr) / sizeof(arr[0]);
//	int i = 0;
//	for (i = 0; i < sz; i++)
//	{
//		*(p + i) = 9;
//	}
//	print(arr, sz);
//	return 0;
//}
//int my_strlen(char *str)
//{
//	int count = 0;
//	while (*str != '\0')
//	{
//		count++;
//		str++;
//	}
//	return count;
//}
//递归
//int my_strlen(char *str)
//{
//	if (*str == '\0')
//		return 0;
//	else
//		return 1 + my_strlen(str + 1);
//}
//指针运算
//int my_strlen(char *str)
//{
//	char *eos = str;
//	while (*str != '\0')
//	{
//		str++;
//	}
//	return str - eos;
//}
//
//
//int main()
//{
//	char *p = "abcdef";
//	int len = my_strlen(p);
//	printf("%d\n", len);
//	return 0;
//}
//int main()
//{
//	int arr[10] = { 0 };
//	printf("%p\n", arr);//数组首元素的地址
//	printf("%p\n", arr + 1);
//	printf("%d\n", sizeof(*arr));
//	printf("*****************************\n");
//	printf("%p\n", &arr[0]);//数组首元素的地址
//	printf("%p\n", &arr[0] + 1);
//	printf("%d\n", sizeof(*&arr[0]));
//	printf("*****************************\n");
//	printf("%p\n", &arr);//数组的地址
//	printf("%p\n", &arr + 1);
//	printf("%d\n", sizeof(*&arr));
//	return 0;
//}
//int main()
//{
//	int arr[10] = { 0 };
//	char *p = arr;
//	int i = 0;
//	for (i = 0; i < 40; i+=4)
//	{
//		*(p + i) = 1;
//	}
//	for (i = 0; i < 10; i++)
//	{
//		printf("%d ", arr[i]);
//	}
//	return 0;
//}
//int main()
//{
//	int a = 10;
//	int * p = &a;
//	return 0;
//
//}
//int main()
//{
//	int i = 1;
//	int ret = (++i) + (++i) + (++i);
//	printf("%d\n", ret);
//	
//	return 0;
//}
//int main()
//{
//	int a = 0;
//	int i = 0;
//	int b = 0;
//	int count = 0;
//	
//    printf("请输入一个整数:>");
//	scanf("%d", &a);
//	for (i = 0; i < 32; i++)
//	{
//		b = a & 1;
//		a = a >> 1;
//		if (b == 1)
//		{
//			count++;
//		}
//	}
//	printf("%d\n", count);
//	
//	return 0;
//}

//冒泡排序 ：相邻两个比 
//第一次1，2比，第二次2，3比，....
//最大的就被放到最后面 这是一套冒泡排序，
//对剩下的元素继续进行一套冒泡排序。
//10个数字9套就够了 .
//第一套有9对元素进行比较.

//void bubble_sort(int arr[], int sz)
//{
//	int i = 0;
//	//冒泡排序的套数
//	for (i = 0; i < sz - 1; i++)
//	{
//		int flag = 0;
//		int j = 0;
//		for (j = 0; j < sz - 1 - i; j++)
//		{
//			//一对元素的比较
//			if (arr[j] > arr[j + 1])
//			{
//				int tmp = arr[j];
//				arr[j] = arr[j + 1];
//				arr[j + 1] = tmp;
//				flag = 1;
//			}
//		}
//		if (flag == 0)
//			break;
//	}
//}
//void print_arr(int arr[], int sz)
//{
//	int i = 0;
//	for (i = 0; i < sz; i++)
//	{
//		printf("%d ", arr[i]);
//	}
//	printf("\n");
//}
//int main()
//{
//	int arr[] = { 9,8,7,6,5,4,3,2,1,0 };
//	int sz = sizeof(arr) / sizeof(arr[0]);
//	print_arr(arr, sz);
//	bubble_sort(arr, sz);
//	print_arr(arr, sz);
//	return 0;
//}
//int main()
//{
//	int arr[3][4] = { 0 };
//	int i = 0;
//	int j = 0;
//	for (i = 0; i < 3; i++)
//	{
//		for (j = 0; j < 4; j++)
//		{
//			printf("&arr[%d][%d]==%p\n", i, j, &arr[i][j]);
//		}
//	}
//	return 0;
//}
//int main()
//{
//	int arr[3][4] = {0};
//	int i = 0;
//	int j = 0;
//	int* p = &arr[0][0];
//	for (i = 0; i < 3; i++)
//	{
//		for (j = 0; j < 4; j++)
//		{
//			arr[i][j] = i * 4 + j + 1;
//		}
//	}
//	for (i = 0; i < 12; i++)
//	{
//		printf("%d ", * (p + i));
//	}
//	for (i = 0; i < 3; i++)
//	{
//		for (j = 0; j < 4; j++)
//		{
//			printf("%d ", arr[i][j]);
//		}
//		printf("\n");
//	}
//
// 	return 0;
//}

//int main()
//{
//	int arr[3][4] = { 0 };
//	return 0;
//}
//int main()
//{
//	int arr[10] = { 0 };
//	//&arr[i]
//	int i = 0;
//	int* p = arr;
//	int sz = sizeof(arr) / aizeof(arr[0]);
//	for (i = 0; i < sz; i++)
//	{
//		arr[i] = i;
//	}
//	for (i = 0; i < sz; i++)
//	{
//		printf("%d ", *(p + i));
//	}
//	/*for (i = 0; i < sz; i++)
//	{
//		printf("%d ", *(arr + i));
//	}*/
//	/*for (i = 0; i < sizeof(arr) / sizeof(arr[0]); i++)
//	{
//		printf("&arr[%d] = %p <==> arr+%d = %p\n", i, &arr[i], i, arr+i); 
//	}*/
//
//	return 0;
//}

//int main()
//{
//	int arr[15] = { 0 };
//	int i = 0;
//	int sz = sizeof(arr) / sizeof(arr[0]);
//	for (i = 0; i < sz; i++)
//	{
//		arr[i] = i;
//	}
//	for (i = 0; i < sz; i++)
//	{
//		printf("%d ", arr[i]);
//	}
//	return 0;
//}
//int main()
//{
//	char arr1[] = "abcdef";
//	char arr2[] = { 'a','b','c','d','e','f'};
//	printf("%d\n", strlen(arr1));  //6
//	printf("%d\n", strlen(arr2));  //无\0 无法判断长度
//	printf("%s\n", arr1);
//	printf("%s\n", arr2);
//	return 0;
//}