package TicTacToe.Self;

public class Board {
    int size;
    Pieces [][]board;
    public Board(int n){
        this.size=n;
        board=new Pieces[n][n];
    }
}
