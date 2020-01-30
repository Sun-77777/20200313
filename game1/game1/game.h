#ifndef __GAME_H__
#define __GAME_H__

#include <stdio.h>
#include <string.h>
#include <stdlib.h>
#include <time.h>

#define ROW 5
#define COL 5

void InitBoard(char board[ROW][COL], int row, int col);
void DisplayBoard(char board[ROW][COL], int row, int col);
void computerMove(char board[ROW][COL], int row, int col);
void playerMove(char board[ROW][COL], int row, int col);
char iswin(char board[ROW][COL], int row, int col);

#endif //__GAME_H__