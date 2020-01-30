#define _CRT_SECURE_NO_WARNINGS

#include "game.h"

void menu()
{
	printf("*********************\n");
	printf("******  1.play ******\n");
	printf("******  0.exit ******\n");
	printf("*********************\n");
}

//ret='Q' 平局
//ret=' '游戏继续
//ret='X'  电脑赢
//ret='0'  玩家赢

void game()
{
	char board[ROW][COL] = { 0 };
	char ret = 0;
	InitBoard(board, ROW, COL);
	DisplayBoard(board, ROW, COL);
	while (1)
	{
		computerMove(board, ROW, COL);
		DisplayBoard(board, ROW, COL);
		ret = iswin(board, ROW, COL);
		if (ret != ' ')
			break;
		playerMove(board, ROW, COL);
		DisplayBoard(board, ROW, COL);
		ret = iswin(board, ROW, COL);
		if (ret != ' ')
			break;
	}
	if (ret == 'X')
	{
		printf("电脑赢\n");
	}
	else if (ret == '0')
	{
		printf("玩家赢\n");
	}
	else 
		printf("平局\n");
}
int main()
{
	int input = 0;
	srand((unsigned int) time(NULL));

	do
	{
		menu();
		printf("请输入你的选择:>");
		scanf("%d", &input);
		switch (input)
		{
		case 1:
			game();
			break;
		case 0:
			break;
		}
	} while (input);
	
	return 0;
}