#define _CRT_SECURE_NO_WARNINGS 1
#include <stdlib.h>
#include <stdio.h>
#include <string.h>
#include <assert.h>


//输入: s = "abcdefg", k = 2
//输出: "cdefgab"

//char* reverseLeftWords(char* s, int n){
//
//	char* s1 = s;
//	int n1 = n;
//	char* ret = NULL;
//	char* s2 = NULL;
//	while (n1--)
//	{
//		s1++;
//	}
//	ret = s1;
//	while (*s1 != '\0')
//	{
//		s1++;
//	}
//	while (n--)
//	{
//		*s2++ = *s++;
//	}
//	
//	return ret;
//}
//int main()
//{
//	char* ret = reverseLeftWords("abcdefg", 2);
//	printf("%s\n", ret);
//	return 0;
//}


//字符串匹配（abcdeabcbde    abcb）

//char* my_strstr(const char* str1, const char* str2)
//{
//	assert(str1 != NULL);
//	assert(str2 != NULL);
//
//	const char* s1 = str1;
//	const char* s2 = str2;
//	const char* cp = str1;
//
//	while (cp)
//	{
//		s1 = cp;
//		s2 = str2;
//
//		while (*s1 == *s2)
//		{
//			s1++;
//			s2++;
//		}
//		if (*s2 == '\0')
//			return (char*)cp;
//		cp++;
//	}
//	return NULL;
//}
//int main()
//{
//	char* arr = "abcdeabcbde";
//	char* ret = my_strstr(arr, "abcb");
//	printf("%s\n", ret);
//	system("pause");
//	return 0;
//}

//char * my_strncat(char * dest, const char * src, int count)
//{
//	assert(dest != NULL);
//	assert(src != NULL);
//	char* ret = dest;
//	while (*dest != '\0')
//	{
//		dest++;
//	}
//	while (count--)
//	{
//		*dest++ = *src++;
//	}
//	return ret;
//}
//int main()
//{
//	char arr[20] = "abcdewww";
//	my_strncat(arr, "fghijk", 7);
//	printf("%s\n", arr);
//	system("pause");
//	return 0;
//}


//int my_strncmp(const char* str1, const char* str2, int count)
//{
//	assert(str1 != NULL);
//	assert(str2 != NULL);
//	while (*str1 == *str2)
//	{
//		count--;
//		str1++;
//		str2++;
//		if (count == 0)
//		{
//			return 0;
//		}
//	}
//	return *str1 - *str2;
//
//}
//int main()
//{
//	char arr[] = "abcddff";
//	int ret = my_strncmp(arr, "abcdeff", 5);
//	printf("%d\n", ret);
//	system("pause");
//	return 0;
//}


//char* my_strncpy(char* dest, const char* src, int count)
//{
//	assert(dest != NULL);
//	assert(src != NULL);
//	char *ret = dest;
//	while (count--)
//	{
//		*dest = *src;
//		dest++;
//		src++;
//	}
//	return ret;
//}
//int main()
//{
//	char arr[20] = "qqqqqqqqqqqqqq";
//	my_strncpy(arr, "hhhhh", 6);
//	//不烤'\0'  strcpy() 拷'\0'
//	
//	printf("%s\n", arr);
//	system("pause");
//	return 0;
//}



//int my_strcmp(const char* str1, const char* str2)
//{
//	assert(str1 != NULL);
//	assert(str2 != NULL);
//	while (*str1 == *str2)
//	{
//		if (*str1 == '\0')
//			return 0;
//		str1++;
//		str2++;
//	}
//	return *str1 - *str2;
//}
//int main()
//{
//	int ret = my_strcmp("abcdddd", "abbbb");
//	printf("%d\n", ret);
//	system("pause");
//	return 0;
//}



//char* my_strcat(char* dest, const char* src)
//{
//	assert(dest != NULL);
//	assert(src != NULL);
//	char* ret = dest;
//	//1.找到目标空间的第一个'\0'
//	while (*dest != '\0')
//	{
//		dest++;
//	}
//	//2.拷贝
//	while (*dest++ = *src++)
//	{
//		;
//	}
//	return ret;
//}
//int main()
//{
//	char str1[20] = "abcdefg";
//	my_strcat(str1, "hhhhh");
//	printf("%s\n", str1);
//	system("pause");
//	return 0;
//}



//char* my_strcpy(char* dest, const char* src)
//{
//	assert(dest != NULL);
//	assert(src != NULL);
//	char* ret = dest;
//	while (*ret++ = *src++)
//	{
//		;
//	}
//	return dest;
//}
//int main()
//{
//	char str1[20] = { 0 };
//	char* str2 = "abcde";
//	my_strcpy(str1, str2);
//	printf("%s\n", str1);
//	system("pause");
//	return 0;
//}




//指针-指针
//int my_strlen(const char* p)
//{
//	const char* eos = p;
//	while (*p != '\0')
//	{
//		p++;
//	}
//	return p - eos;
//
//}

//递归
//int my_strlen(const char* p)
//{
//	if (*p == '\0')
//	{
//		return 0;
//	}
//	else
//	{
//		return 1 + my_strlen(p+1);
//	}
//}

//int my_strlen(const char* p)
//{
//	assert(p != NULL);
//	int count = 0;
//	while (*p != '\0')
//	{
//		count++;
//		p++;
//	}
//	return count;
//}

//int main()
//{
//	char *p = "abcd";
//	int len = my_strlen(p);
//	printf("%d\n", len);
//	system("pause");
//	return 0;
//}