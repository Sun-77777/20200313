#define _CRT_SECURE_NO_WARNINGS 1
#include <stdlib.h>
#include <stdio.h>
int game(int* guess, int guessSize, int* answer, int answerSize){
	int count = 0;
	while (guessSize--)
	{
		if (*guess == *answer)
		{
			count++;
		}
		guess++;
		answer++;
	}
	return count;
}
int main()
{
	int guess[3] = { 1, 2, 3 };
	int answer[3] = { 1, 3, 3 };
	int guessSize = sizeof(guess) / sizeof(guess[0]);
	int answerSize = sizeof(answer) / sizeof(answer[0]);
	int ret = game(guess, guessSize, answer, answerSize);
	printf("%d\n", ret);
	system("pause");
	return 0;
}