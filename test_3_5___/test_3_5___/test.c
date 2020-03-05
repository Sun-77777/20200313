#define _CRT_SECURE_NO_WARNINGS 1
#include <stdio.h>

int findNumbers(int* nums, int numsSize){
	int count = 0;
	int c = 0;
	int i = 0;

	for (int i = 0; i < numsSize; i++)
	{
		c = 0;
		while (nums[i])
		{
			nums[i] = nums[i] / 10;
			c++;
		}
		if ((c > 0) && (c % 2 == 0))
		{
			count++;
		}
	}
	return count;
}
int main()
{
	int num[] = { 18853, 98579, 84784, 79454, 10299, 58256, 96202 };
	int numsSize = sizeof(num) / sizeof(num[0]);
	int ret = findNumbers(num, numsSize);
	printf("%d\n", ret);
	return 0;
}