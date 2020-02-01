#define _CRT_SECURE_NO_WARNINGS 1

#include "game.h"

void Initboard(char arr[ROWS][COLS], int rows, int cols, char set)
{
	int i = 0;
	for (i = 0; i < rows; i++)
	{
		int j = 0;
		for (j = 0; j < cols; j++)
		{
			arr[i][j] = set;
		}
	}
}
void Displayboard(char arr[ROWS][COLS], int row, int col)
{
	int i = 0;
	int j = 0;
	for (i = 0; i <= row; i++)
	{
		printf("%d ", i);
	}
	printf("\n");
	for (i = 1; i <= row; i++)
	{
		printf("%d ", i);
		for (j = 1; j <= col; j++)
		{
			printf("%c ", arr[i][j]);
		}
		printf("\n");

	}
}
void Setmine(char arr[ROWS][COLS], int row, int col, int count)
{
	int x = 0;
	int y = 0;

	while (count)
	{
		x = rand() % row + 1;
		y = rand() % col + 1;
		if (arr[x][y] == '0') {
			count--;
			arr[x][y] = '1';
		}
	}
}
void Findmine(char mine[ROWS][COLS], char show[ROWS][COLS], int row, int col)
{
	int x = 0;
	int y = 0;
	int cc = 0;
	while (1)
	{
		printf("����������:>");
		scanf("%d%d", &x, &y);
		if (x >= 1 && x <= 9 && y >= 1 && y <= 9)
		{
			if (mine[x][y] == '0')
			{
				
				//���Ա�λ�õ���ͳ�Ƶ�[x][y]��
				int count = getCountMine(mine, x, y);
				show[x][y] = count + '0';
				Displayboard(show, row, col);
				cc++;
				if (cc == row * col - COUNT_MINE)
				{
					printf("��ϲ�㣬���׳ɹ�!!\n");
					Displayboard(mine, row, col);
					break;
				}
			}
			else if(cc == 0)          //��һ�����ײ���ը��
			{
				mine[x][y] = '0';
				Setmine(mine, row, col,1);
				int count = getCountMine(mine, x, y);
				show[x][y] = count + '0';
				Displayboard(show, row, col);
				cc++;
			}
			else
			{
				printf("���ź����㱻ը����!\n");
				Displayboard(mine, row, col);
				break;
			}
		}
		else
		{
			printf("����Ƿ�������������!\n");
		}
	}
}
int getCountMine(char mine[ROWS][COLS], int x, int y)
{
	return mine[x - 1][y] +
		mine[x - 1][y - 1] +
		mine[x][y - 1] +
		mine[x + 1][y - 1] +
		mine[x + 1][y] +
		mine[x + 1][y + 1] +
		mine[x][y + 1] +
		mine[x - 1][y + 1] - 8 * '0';
}
