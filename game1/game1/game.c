#define _CRT_SECURE_NO_WARNINGS
#include "game.h"

void InitBoard(char board[ROW][COL], int row, int col)
{
	/*int i = 0;
	int j = 0;
	for (i = 0; i < row; i++)
	{
		for (j = 0; j < col; j++)
		{
			board[i][j] = ' ';
		}
	}*/

	memset(&board[0][0], ' ', row*col * sizeof(board[0][0]));

}
void DisplayBoard(char board[ROW][COL], int row, int col)
{
	int i = 0;
	int j = 0;
	for (i = 0; i < row; i++)
	{
		for (j = 0; j < col; j++)
		{
			printf(" %c ", board[i][j]);
			if (j < col - 1)
				printf("|");
		}
		printf("\n");
		
		if (i < row - 1)
		{
			for (j = 0; j < col; j++)
			{
				printf("---");
				if (j < col - 1)
				{
					printf("|");
				}
			}
				
		}
		printf("\n");
	}
}
void computerMove(char board[ROW][COL], int row, int col)
{
	int x = 0;
	int y = 0;
	
	while (1)
	{
		x = rand() % row;
		y = rand() % col;
		
		if (board[x][y] == ' ')
		{
			printf("������:\n");
			board[x][y] = 'X';
			break;
		}
		
	}
}
void playerMove(char board[ROW][COL], int row, int col)
{
	int x = 0;
	int y = 0;
	while (1)
	{
		printf("�����:");
		scanf("%d%d", &x, &y);
		//���ж����������Ƿ���ȷ
		if (x >= 1 && x <= row && y >= 1 && y <= col)
		{
			if (board[x-1][y-1] == ' ')
			{
				board[x-1][y-1] = '0';
				break; 
			}
			else
			{
				printf("�����ѱ�ռ�ã�����������\n");
			}
		}
		else
			printf("��������Ƿ�������������\n");
	}
	
}
char iswin(char board[ROW][COL], int row, int col)
{
	int x = 0;
	int y = 0;
	int count = 0;
	//�ж���
	for (x = 0; x < row; x++)
	{
		for (y = 0; y < col-1; y++)
		{
			if (board[x][y] == board[x][y + 1] && board[x][y] !=' ')
			{
				count++;
			}
			if (count == row - 1)
			{
				return board[x][y];
			}
			
		}
		count = 0;
		/*if (board[x][0] == board[x][1] && board[x][1] == board[x][2] && board[x][0] != ' ')
		{
			return board[x][0];
			break;
		}*/
	}

	//�ж���
	count = 0;
	for (y = 0; y < col; y++)
	{
		for (x = 0; x < row - 1; x++)
		{
			if (board[x][y] == board[x + 1][y] && board[x][y] != ' ')
			{
				count++;
			}
			if (count == col - 1)
			{
				return board[x][y];
			}
		}
		count = 0;
		/*if (board[0][y] == board[1][y] && board[1][y] == board[2][y] && board[0][y] != ' ')
		{
			return board[0][y];
			break;
		}*/
	}

	//�ж϶Խ���
	count = 0;
	for (x = 0; x < row-1; x++)
	{
		y = x;
		if (board[x][y] == board[x + 1][y + 1] && board[x][y] != ' ')
		{
			count++;
		}
	    if (count == row - 1)
		{
			return board[x][y];
		}
		
	}

	//�ж���һ���Խ���
	count = 0;
	for (x = 0; x < row-1; x++)
	{
		y = row - 1 - x;
		if (board[x][y] == board[x + 1][y - 1] && board[x][y] != ' ')
		{
			count++;
		}
		if (count == row - 1)
		{
			return board[x][y];
		}
	}
    /*if (board[0][0] == board[1][1] && board[1][1] == board[2][2] && board[0][0] != ' ')
	{
		return board[0][0];
	}*/

	/*if (board[0][2] == board[1][1] && board[1][1] == board[2][0] && board[0][2] != ' ')
	{
		return board[0][2];
	}*/

	//�ж�ƽ��
	count = 0;
	for (x = 0; x < row; x++)
	{
		for (y = 0; y < col; y++)
		{
			if (board[x][y] != ' ')
			{
				count++;
			}
		}
		if (count == row * col)
		{
			return 'Q';
		}
	}
	return ' ';
}