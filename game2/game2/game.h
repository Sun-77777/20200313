#ifndef __GMAE_H__
#define __GAME_H__

#include <stdio.h>
#include <stdlib.h>
#include <time.h>

#define ROW 9
#define COL 9

#define ROWS ROW+2
#define COLS COL+2

#define COUNT_MINE 78

void Initboard(char arr[ROWS][COLS], int rows, int cols, char set);
void Displayboard(char arr[ROWS][COLS], int row, int col);
void Setmine(char arr[ROWS][COLS], int row, int col, int count);
void Findmine(char mine[ROWS][COLS], char show[ROWS][COLS], int row, int col);
int getCountMine(char mine[ROWS][COLS], int x, int y);
#endif //__GAME_H__

