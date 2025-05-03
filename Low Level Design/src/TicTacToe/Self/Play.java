package TicTacToe.Self;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Play {

    public static void main(String args[]){
        Queue<Player>move=new LinkedList<>();
        move.add(new PlayerX());
        move.add(new PlayerO());
        int n;
        Scanner scanner=new Scanner(System.in);
        n= scanner.nextInt();
        Board board=new Board(n);
        int t=n*n;
        boolean check=true;
        while(check){
            int x,y;
            Scanner scanner1=new Scanner(System.in);
            System.out.print("Player "+move.peek().pieces()+" Value of x,y:");
            x=scanner1.nextInt();
            y=scanner1.nextInt();
            System.out.println();
            if(board.board[x-1][y-1]!=null){
                System.out.println("Position is already filled, please select empty cell");
                continue;
            }
            if(x>n || y>n || x<=0 || y <= 0){
                System.out.println("Invalid Argument");
                continue;
            }
            Player playing =move.poll();
            if (playing == null) {
                System.out.println("No players in queue!");
                continue;
            }
            board.board[x-1][y-1]=playing.pieces();
            move.add(playing);
            for(int i=0;i<n;i++){
                Pieces temp=board.board[i][0];
                boolean f=true;
                for(int j=1;j<n;j++){
                    if(board.board[i][j]==null || temp!=board.board[i][j]){
                        f=false;
                        break;
                    }
                }
                if(f){
                    System.out.println("Player "+playing.pieces()+" won the game :)");
                    Play play=new Play();
                    play.print(board.board,n);
                    return;
                }
            }
            for(int i=0;i<n;i++){
                Pieces temp=board.board[0][i];
                boolean f=true;
                for(int j=1;j<n;j++){
                    if(board.board[j][i]==null || temp!=board.board[j][i]){
                        f=false;
                        break;
                    }
                }
                if(f){
                    System.out.println("Player "+playing.pieces()+" won the game :)");
                    Play play=new Play();
                    play.print(board.board,n);
                    return;
                }
            }
            int i=0,j=0;
            Pieces temp=board.board[i][j];
            while(board.board[i][j]!=null && i<n && j<n && i==j && temp==board.board[i][j]) {
                       i++;
                       j++;
           }
            if(i==n && j==n){
                System.out.println("Player "+playing.pieces()+" won the game :)");
                Play play=new Play();
                play.print(board.board,n);
                return;
            }
            i=0;
            j=n-1;
            temp=board.board[i][j];
            while(null != board.board[i][j] && (i < n) && (j >= 0) && (i == j) && (temp == board.board[i][j])) {
                i++;
                j--;
            }
            if(i>=n && j<0){
                System.out.println("Player "+playing.pieces()+" won the game :)");
                Play play=new Play();
                play.print(board.board,n);
                return;
            }
            t--;
            if(t<0){
                check=false;
            }
        }
        System.out.println("Game is Draw");
        Play play=new Play();
        play.print(board.board,n);
        return;
    }
    public void print(Pieces[][]pieces,int n){
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(pieces[i][j]==null){
                    System.out.println("B");
                }else {
                    System.out.print(pieces[i][j] + " ");
                }
            }
            System.out.println();
        }
    }
}
