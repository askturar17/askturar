/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tictactoe;

/**
 *
 * @author PC
 */
public class TicTac {
    public int turncounter=0;
    public int [] board;
    public  void board(int i){
     board=new int[i];
    for(int a=0; a<i; a++){
    board[a]=3;
    }
    
    }
    public void ChangePlayer(){
    turncounter++;
    }
    public String CurrentPlayer(){
    if(turncounter%2==0)
        return "player1";
    else
        return "player2";
        
    }
    public void MakeMove(int x){
        board[x]=turncounter%2;
        
    
    }
   public String SpaceInUse(int x){
   if(board[x]==3)
       return "Space is not occupied";
   else
       return "Space is occupied";
   }
}
