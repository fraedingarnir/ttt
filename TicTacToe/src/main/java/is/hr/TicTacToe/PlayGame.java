package is.hr.TicTacToe;

public class PlayGame {
	
	public static void main(String[] args)
	{
		Player player1 = new Player('X');
		Player player2 = new Player('O');
		
		Board board = new Board();
		printBoard(board);
/*
		while(!board.hasWon())
		{
			printBoard(board);
		}
		*/
	}

	private static void printBoard(Board board)
	{
		int line = 0;
        for(int row = 0; row < 3; row++)
        {
                for(int col = line; col < line+3; col++)
                {
                        System.out.print(" " + board.getSquareElement(col));
                        if(col != 2 && col != 5 && col != 8 || col == 0)
                                System.out.print(" |");
                }

                if(row != 2)
                        System.out.println("\n---|---|---");
                line += 3;
        }
        System.out.println();
	}


}
