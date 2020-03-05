#define _CRT_SECURE_NO_WARNINGS 1
#include <stdio.h>

#define MON 1
//枚举
enum Day
{
	Mon = 1,//0
	Tues,//1
	Wed,//2
	Thur,//3
	Fri,
	Sat,
	Sun
};
int main()
{
	enum Day day = Mon;
	return 0;
}
//struct Node
//{
//	int data;//4
//	struct Node* next;//4
//};
//#pragma pack(4)
//struct S
//{
//	double d;//0-7
//	char c;//8
//};
//#pragma pack()  //改变取消
//
//struct s
//{
//	char _a : 3;
//	char _b : 4;
//	char _c : 5;
//	char _d : 4;
//};
//
//int main()
//{
//	printf("%d\n", sizeof(struct S));
//	printf("%d\n", sizeof(struct s));
//	return 0;
//}
