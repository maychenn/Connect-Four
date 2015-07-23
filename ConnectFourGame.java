import java.util.*;
public class ConnectFourGame
{
	//attributes
	public char[][] board = new char[6][7];
	public static int PLAYING = 0;
	public static int RED_WINS = 1;
	public static int BLACK_WINS = 2;
	public static int DRAW = 3;
	public static int RED = 4;
	public static int BLACK = 5;
	public static int EMPTY = 6;



	//constructor
	public ConnectFourGame()
	{

		for(int c = 0; c <= 6; c++)
		{
			for(int r = 0; r <= 5; r++)
			{
				board[r][c] = ' ';
			}
		}
	}
	//methods
	public boolean dropPiece(int column, char player)
	{
		if(columnFull(column) == false)
		{
			for(int y = board.length-1; y >= 0; y--)
			{
				if(board[y][column] == ' ')
				{
					board[y][column] = player;
					return true;
				}
			}
		}

		return false;
	}
	public int status()
	{
		for(int r = 0; r < board.length; r++)
		{
			for(int c = 0; c < board[0].length-3; c++)
			{
				//horizontal
				if(board[r][c] == 'R' && board[r][c+1] == 'R' && board[r][c+2] == 'R' && board[r][c+3] == 'R')
				{
					return RED_WINS;
				}
				if(board[r][c] == 'B' && board[r][c+1] == 'B' && board[r][c+2] == 'B' && board[r][c+3] == 'B')
				{
					return BLACK_WINS;
				}
			}
		}

		for(int c = 0; c < board[0].length; c++)
		{
			for(int r = 0; r < board.length-3; r++)
			{
				//vertical
				if(board[r][c] == 'R' && board[r+1][c] == 'R' && board[r+2][c] == 'R' && board[r+3][c] == 'R')
				{
					return RED_WINS;
				}
				if(board[r][c] == 'B' && board[r+1][c] == 'B' && board[r+2][c] == 'B' && board[r+3][c] == 'B')
				{
					return BLACK_WINS;
				}
			}
		}

		for(int r = 0; r < board.length-3; r++)
		{
			for(int c = 0; c < board[0].length-3; c++)
			{
				//diagonal left		\
				if(board[r+3][c+3] == 'R' && board[r+2][c+2] == 'R' && board[r+1][c+1] == 'R' && board[r][c] == 'R')
				{
					return RED_WINS;
				}
				if(board[r+3][c+3] == 'B' && board[r+2][c+1] == 'B' && board[r+1][c+1] == 'B' && board[r][c] == 'B')
				{
					return BLACK_WINS;
				}
			}
		}

		for(int r = 0; r < board.length-3; r++)
		{
			for(int c = 0; c < board[0].length; c++)
			{
				//diagonal left
				if(board[r][c] == 'R' && board[r+1][c-1] == 'R' && board[r+2][c-2] == 'R' && board[r+3][c-3] == 'R')
				{
					return RED_WINS;
				}
				if(c > 2 && board[r][c] == 'B' && board[r+1][c-1] == 'B' && board[r+2][c-2] == 'B' && board[r+3][c-3] == 'B')
				{
					return BLACK_WINS;
				}
			}
		}
		for(int r = 0; r < board.length; r++)
		{
			for(int c = 0; c < board[0].length; c++)
			{
				//draw
				if(board[r][c] == ' ')
				{
					return PLAYING;
				}
			}
		}

		return DRAW;
	}
	public boolean columnFull(int column)
	{
			if(board[0][column] == ' ')
			{
				return false;
			}
			else
				return true;
	}
	public void draw()
	{
		System.out.println("| "+board[0][0]+" | "+board[0][1]+" | "+board[0][2]+" | "+board[0][3]+" | "+board[0][4]+" | "+board[0][5]+" | "+board[0][6]+" |");
		System.out.println("| "+board[1][0]+" | "+board[1][1]+" | "+board[1][2]+" | "+board[1][3]+" | "+board[1][4]+" | "+board[1][5]+" | "+board[1][6]+" |");
		System.out.println("| "+board[2][0]+" | "+board[2][1]+" | "+board[2][2]+" | "+board[2][3]+" | "+board[2][4]+" | "+board[2][5]+" | "+board[2][6]+" |");
		System.out.println("| "+board[3][0]+" | "+board[3][1]+" | "+board[3][2]+" | "+board[3][3]+" | "+board[3][4]+" | "+board[3][5]+" | "+board[3][6]+" |");
		System.out.println("| "+board[4][0]+" | "+board[4][1]+" | "+board[4][2]+" | "+board[4][3]+" | "+board[4][4]+" | "+board[4][5]+" | "+board[4][6]+" |");
		System.out.println("| "+board[5][0]+" | "+board[5][1]+" | "+board[5][2]+" | "+board[5][3]+" | "+board[5][4]+" | "+board[5][5]+" | "+board[5][6]+" |");
	}
	public int getSpot(int row, int column)
	{
		if(row > 5 || row < 0 || column > 6 || column < 0)
		{
			return -1;
		}
		else if(board[row][column] == 'R')
		{
			return RED;
		}
		else if(board[row][column] == 'B')
		{
			return BLACK;
		}
		else
		{
			return EMPTY;
		}
	}
}
