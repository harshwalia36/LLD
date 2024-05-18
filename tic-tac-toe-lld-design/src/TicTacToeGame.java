import java.util.Deque;
import java.util.List;
import java.util.Scanner;
import java.util.LinkedList;

import Model.Player;
import Model.Board;
import Model.Pair;
import Model.PlayingPieceO;
import Model.PlayingPieceX;
import Model.PieceType;

public class TicTacToeGame {

    Deque<Player> players;
    Board gameboard;

    public void InitializeGame() {
        // 2 Players Game
        players = new LinkedList<>();
        PlayingPieceX crossPiece = new PlayingPieceX(null);
        Player player1 = new Player("Player1", crossPiece);

        PlayingPieceO noughtPiece = new PlayingPieceO(null);
        Player player2 = new Player("Player2", noughtPiece);

        players.add(player1);
        players.add(player2);

        // initialize Board
        gameboard = new Board(3); // 3*3
    }

    public String startGame() {
        boolean noWinner = true;
        while (noWinner) {
            Player playerTurn = players.removeFirst();

            gameboard.printBoard();
            List<Pair<Integer, Integer>> freeSpaces = gameboard.getFreeCells();
            if (freeSpaces.isEmpty()) {
                noWinner = false;
                continue;
            }

            System.out.print("Player:" + playerTurn.name + " Enter row,column: ");
            Scanner inputScanner = new Scanner(System.in);
            String s = inputScanner.nextLine();
            String[] values = s.split(",");
            int inputRow = Integer.valueOf(values[0]);
            int inputColumn = Integer.valueOf(values[1]);

            boolean pieceAddedSuccessfully = gameboard.AddPiece(inputRow, inputColumn, playerTurn.piece);
            if (!pieceAddedSuccessfully) {
                // player can not insert the piece into this cell, player has to choose another
                // cell
                System.out.println("Incorredt possition chosen, try again");
                players.addFirst(playerTurn);
                continue;
            }
            players.addLast(playerTurn);

            boolean winner = isThereWinner(inputRow, inputColumn, playerTurn.piece.pieceType);
            if (winner) {
                return playerTurn.name;
            }

        }
        return "tie";
    }

    public boolean isThereWinner(int row, int column, PieceType pieceType) {

        boolean rowMatch = true;
        boolean columnMatch = true;
        boolean diagonalMatch = true;
        boolean antiDiagonalMatch = true;

        // need to check in row
        for (int i = 0; i < gameboard.size; i++) {

            if (gameboard.board[row][i] == null || gameboard.board[row][i].pieceType != pieceType) {
                rowMatch = false;
            }
        }

        // need to check in column
        for (int i = 0; i < gameboard.size; i++) {

            if (gameboard.board[i][column] == null || gameboard.board[i][column].pieceType != pieceType) {
                columnMatch = false;
            }
        }

        // need to check diagonals
        for (int i = 0, j = 0; i < gameboard.size; i++, j++) {
            if (gameboard.board[i][j] == null || gameboard.board[i][j].pieceType != pieceType) {
                diagonalMatch = false;
            }
        }

        // need to check anti-diagonals
        for (int i = 0, j = gameboard.size - 1; i < gameboard.size; i++, j--) {
            if (gameboard.board[i][j] == null || gameboard.board[i][j].pieceType != pieceType) {
                antiDiagonalMatch = false;
            }
        }

        return rowMatch || columnMatch || diagonalMatch || antiDiagonalMatch;
    }

}
