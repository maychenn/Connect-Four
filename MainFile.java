import java.util.*;
public class MainFile
{
    public static void main(String[] args)
    {
    	Scanner keyboard = new Scanner(System.in);

    	/*

    	ConnectFourGame cfg = new ConnectFourGame();

    	boolean place = false;
    	do
    	{
    		//draws the board
    		cfg.draw();

    		do
    		{
	    		//RED enter column
	    		System.out.println("Red, enter a column for your move (0-6): ");
	    		int column = keyboard.nextInt();
	    		char player = 'R';
	    		if(cfg.columnFull(column) == false)
                {
                    cfg.dropPiece(column, player);
                    System.out.println(cfg.status());
                    break;
                }
                else if(cfg.columnFull(column) == true)
                {
                	System.out.println("That column is full, try again.");
                }
                else
                {
                    System.out.println("That column is invalid, try again.");
                }
    		}while(true);

			cfg.draw();

			//RED_WINS
    		if(cfg.status() == 1)
    		{
    			System.out.println("RED WINS!");
    			break;
    		}

			do
    		{
	    		//BLACK enter column
	    		System.out.println("Black, enter a column for your move (0-6): ");
	    		int column = keyboard.nextInt();
	    		char player = 'B';
	    		if(cfg.columnFull(column) == false)
                {
                    cfg.dropPiece(column, player);
                    place = true;
                }
                else if(cfg.columnFull(column) == true)
                {
                	System.out.println("That column is full, try again.");
                    place = false;
                }
                else
                {
                    System.out.println("That column is invalid, try again.");
                    place = false;
                }
                //BLACK_WINS
    			if(cfg.status() == 2)
    			{
    				cfg.draw();
    				System.out.println("BLACK WINS!");
    				break;
    			}
    		}while(place == false);

    		//DRAW
    		if(cfg.status() == 3)
    		{
    			cfg.draw();
    			System.out.println("DRAW!");
    		}
    	}while(cfg.status() == 0);


		*/
    }
}
