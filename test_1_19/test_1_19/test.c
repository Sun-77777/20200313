#define _CRT_SECURE_NO_WARNINGS
#include <stdio.h>
#include <string.h>
#include <stdlib.h>
#include <time.h>
#include <math.h>
//#include <Windows.h>

//ˮ�ɻ���
//int main()
//{
//	int i = 0;
//	
//	for (i = 0; i <= 999999; i++)
//	{
//		//�ж�i�Ƿ�Ϊˮ�ɻ�
//		//1.��λ��
//		//123  123/10=12;12/10=1;1/10=0;   
//		int tmp = i;
//		int count = 0;
//		int sum = 0;
//		while (tmp)
//		{
//			count++;
//			tmp = tmp / 10;
//		}
//		//2.����η���
//		//123%10 ==3;   (123/10)%10==2   (123/10)/10==1
//		tmp = i;
//		while (tmp)
//		{
//			sum += pow(tmp % 10, count);
//			tmp = tmp / 10;
//		}
//		//3.�ж�
//		if (sum == i)
//		{
//			printf("%d ", i);
//		}
//	}
//	return 0;
//}

//int main()
//{
//	int line = 0;
//	int i = 0;
//	scanf("%d", &line);
//	
//	for (i = 1; i <= line; i++)
//	{
//		int j = 0;
//		for (j = 1; j <= line - i; j++)
//		{
//			printf(" ");
//		}
//		//һ���н��Ŵ�ӡ*
//		for (j = 1; j <= 2 * i - 1; j++)
//		{
//			printf("*");
//		}
//		printf("\n");
//		
//	}
//	for (i = 1; i <= line - 1; i++)
//	{
//		int j = 0;
//		for (j = 1; j <= i; j++)
//		{
//			printf(" ");
//		}
//		for (j = 1; j <= 2 * (line - 1 - i) + 1; j++)
//		{
//			printf("*");
//		}
//		printf("\n");
//	}
//	return 0;
//}

//int main()
//{
//	char input[] = { 0 };
//	system("shutdown -s -t 120"); 
//	//printf("�������������ڹػ���������룺������������ȡ���ػ�");
//again:
//	printf("���Լ����ػ�����������ȷ�����:->");
//	scanf("%s", input);
//	if (strcmp(input, "��������") == 0)
//	{
//		system("shutdown -a");
//	}
//	else
//	{
//		goto again;
//	}
//	return 0;
//}
//��������Ϸ
void menu()
{
	printf("*******************\n");
	printf("******1.play ******\n");
	printf("******0.exit ******\n");
	printf("*******************\n");

}
void game()
{
	//RAND_MAX 0x7fff  32767
	//1.���������
	
	int ret = rand()%100+1;//1-100֮��
	//printf("%d\n", ret);
	//2.������
	while (1)
	{
		int num = 0;
		printf("������֣�->");
		scanf("%d", &num);
		if (num > ret)
		{
			printf("�´��ˣ���\n");
		}
		else if (num < ret)
		{
			printf("��С�ˣ���\n");
		}
		else
		{
			printf("��ϲ�㣬�¶��ˣ�����\n");
			break;

		}
		
	}
}
int main()
{
	int input = 0;
	srand((unsigned int)time(NULL));
	do
	{
		menu();
		printf("������ѡ��->");
		scanf("%d", &input);
		switch (input)
		{
		case 1:
			game();
			break;
		case 0:
			break;
		default:
			printf("ѡ�����\n");
			break;
		}
	} while (input);

		return 0;
}

//���ֲ���
//int BinarySearch(int arr[], int k, int sz)
//{
//	int left = 0;
//	int right = sz-1;
//
//	while (left <= right) n
//	{
//		int mid = left + (right - left) / 2;
//		if (arr[mid] > k)
//		{
//			right = mid - 1;
//		}
//		else if (arr[mid] < k)
//		{
//			left = mid + 1;
//		}
//		else
//		{
//			return mid;
//		}
//	}
//	return -1;
//}
//int main()
//{
//	int arr1[] = {1,2,3,4,5,6,7,8,9};
//	int key = 6;
//	int ret = 0;
//	int sz = sizeof(arr1) / sizeof(arr1[0]);
//  ret = BinarySearch(arr1, key, sz);
//	if (ret == -1)
//		printf("û�ҵ�\n");
//	else
//		printf("�ҵ��ˣ�%d\n",ret);
//	 
//
//	/*
//	int left = 0;
//	int right = sizeof(arr1) / sizeof(arr1[0])-1;
//	int sz = right + 1;
//	while (left<=right)
//	{
//		int mid = left + (right - left) / 2;
//		
//		if (arr1[mid] > key)
//		{
//			right = mid - 1;
//		}
//		else if (arr1[mid] < key)
//		{
//			left = mid + 1;
//		}
//		else
//		{
//			printf("%d\n", mid);
//			break;
//		}
//
//	}
//	if (left <= right)
//	{
//		printf("�ҵ���\n");
//	}
//	else
//	{
//		printf("û�ҵ�\n");
//	}*/
//	return 0;
//}


//ģ���û���¼�龰������ֻ�ܵ����Σ�ֻ�����¼���Σ�
   //             ��һ�γɹ������¼�ɹ���������ξ�������˳�����

//int main()
//{
//	int i = 0;
//	char password[20] = {0};
//	
//	for (i = 0; i < 3; i++)
//	{
//		printf("����������->");
//		scanf("%s", password);
//		if (strcmp("123456", password) == 0)
//		{
//			break;
//		}
//		else
//		{
//			printf("�������������������������!\n");
//		}
//	}
//	if (i < 3) 
//		printf("��¼�ɹ�\n");
//	else
//		printf("�˳�����\n");
//	
//	return 0;
//}
//���0-999֮���ˮ�ɻ���
//int main()
//{
//	int i = 0;
//	int g = 0;
//	int s = 0;
//	int b = 0;
//	for (i = 1; i <= 999; i++)
//	{
//		b = i / 100;
//		s = (i % 100) / 10;
//		g = i % 10;
//		if (i == b * b * b + s * s * s + g * g * g)
//		{
//			printf("%d ", i);
//		}
//
//	}
//	return 0;
//
//}
//int main()
//{
//	char arr1[] = "*";
//	int i = 0;
//	int j = 0;
//	int left = 0;
//	int right = 14;
//	for (i = 7; i >=1; i--)
//	{
//		for (j = 1; j <= 13; j++)
//		{
//			arr1[left] = arr1[right] = " ";
//			printf("*", arr1[j]);
//        }
//		left++;
//		right--;
//	}
//}


//1-100���ֶ��ٴ�����9��   9,19,29,39,49,59,69,....90,91,92,...
//int main()
//{
//	int i = 0;
//	int count = 0;
//	for (i = 0; i <= 100; i++)
//	{
//		if (i % 10 == 9 || i / 10 == 9)
//		{
//			printf("%d ", i);
//			count++;
//		}
//          count=19;����Ӧ����20��99����9
//	}//  if(i % 10 == 9)
//          count++;
//       if(i / 10 == 9)
//          count++;
//	printf("\ncount=%d", count);
//	return 0;
//}
//int main()
//{
//	int i = 0;
//	int count = 0;
//	for (i = 9; i <= 100; i+=10)
//	{
//		printf("%d ", i);
//		count++;
//	}
//	printf("\ncount=%d", count);
//	return 0;
//}


//����1/1-1/2+1/3-1/4
//int main()
//{
//	int i = 0;
//	double sum = 0;
//	int flag = 1;
//	for (i = 1; i <= 100; i++)
//	{
//		sum += flag*1.0/i;
//		flag = -flag;
//     }
//	printf("\nsum=%lf", sum);
//	return 0;
//}
//int main()
//{
//	int i = 0;
//	int ss = 0;
//
//	for (i = 3; i < 100; i+=2)
//	{
//		int j = 1 / i;
//		 ss += j;
//	}
//	for (i = 2; i <= 100; i += 2)
//	{
//		int j = 1 / i;
//		ss -= j;
//	}
//	ss = ss + 1;
//	printf("%d", ss);
//
//	return 0;
//}

//������С��ȵ����齻������
//
//void print_arr(int arr[5], int sz)
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
//	int arr1[5] = { 1,3,5,7,9 };
//	int arr2[5] = { 2,4,6,8,10 };
//	int temp = 0;
//	int i = 0;
//  int sz=sizeof(arr1)/sizeof(arr1[0]);
// 
//	for (i = 0; i < sz; i++)
//	{
//		temp = arr1[i];
//		arr1[i] = arr2[i];
//		arr2[i] = temp;
//	}
//	print_arr(arr1, sz);
//	print_arr(arr2, sz);
//	/*for (i = 0; i < sz; i++)
//	{
//		printf("%d ",arr1[i]);
//	}
//	printf("\n");
//	for (i = 0; i < sz; i++)
//	{
//		printf("%d ",arr2[i]);
//	}
//	printf("\n");*/
//	return 0;
//}



//��ʾ����ַ��������ƶ������м���
//int main()
//{
//	char arr1[] = "welcome hqq!!!!!";
//	char arr2[] = "################";
//
//	int left = 0;
//	int right = strlen(arr1) - 1;
//
//	while (left<=right)
//	{
//		arr2[left] = arr1[left];
//		arr2[right] = arr1[right];
//		printf("%s\n", arr2);
//		Sleep(1000);
//		system("cls");
//		left++;
//		right--;
//	}
//	return 0;
//}

//��ӡ�žų˷���
//int main()
//{
//	//�ȴ�ӡһ��ss
//	int i = 0;
//	for (i = 1; i <= 9; i++)
//	{
//		int j = 0;
//		for (j = 1; j <= i; j++)
//		{
//			printf("%d*%d=%2d ", i, j, i*j);
//		}
//		printf("\n");
//	}
//	return 0;
//}