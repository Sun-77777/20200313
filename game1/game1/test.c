#define _CRT_SECURE_NO_WARNINGS

#include "game.h"

void menu()
{
	printf("*********************\n");
	printf("******  1.play ******\n");
	printf("******  0.exit ******\n");
	printf("*********************\n");
}

//ret='Q' ƽ��
//ret=' '��Ϸ����
//ret='X'  ����Ӯ
//ret='0'  ���Ӯ

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
		printf("����Ӯ\n");
	}
	else if (ret == '0')
	{
		printf("���Ӯ\n");
	}
	else 
		printf("ƽ��\n");
}
int main()
{
	int input = 0;
	srand((unsigned int) time(NULL));

	do
	{
		menu();
		printf("���������ѡ��:>");
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