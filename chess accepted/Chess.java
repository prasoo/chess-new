/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chess;
import java.util.*;
/**
 *
 * @author prasu
 */
public class Chess {
        static Game g=new Game();
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
         //static Game g=new Game();

          int fromX=0;
          int fromY=0;
          int toX;
          int toY;
          int i,j;
          int f=1;
          Scanner scan=new Scanner(System.in);
          
           for(j=0;j<8;j++){
                 System.out.print("  "+j+"  ");
           }
           System.out.println();
           
          for(i=0;i<8;i++){
              System.out.print(i);
             for(j=0;j<8;j++){
                if(g.board[i][j]==null)
                    System.out.print(" --  ");
                else{
                 System.out.print(" "); 
                Game.display(g.getPiece(i,j));
                System.out.print("  ");
                }
            }
             System.out.println();
        }   
    
          int count=0;
          
          
  while(f!=0) {
      int ch=0;
      System.out.println("enter the coordinates from which you wanted the piece to move:");
      
    while(ch==0){
     fromX=scan.nextInt();
     fromY=scan.nextInt();

      if(Game.getPiece(fromX,fromY)==null){
      System.out.println("there is no piece in the position that you have entered,please enter the correct coordinates:");
      ch=0;
      continue;
     }
      else{
       if(count%2==0 && g.board[fromX][fromY].color=='b'){
         System.out.println("This is not your turn.Please move the white piece!");
         ch=0;
         continue;
       }
       
         if(count%2==1 && g.board[fromX][fromY].color=='w'){
            System.out.println("This is not your turn.Please move the black piece");
            ch=0;
            continue;
         } 
         else 
             ch=1;      
      }
    }

   System.out.println("enter the coordinates to which you wanted the piece to move:");

     toX=scan.nextInt();
     toY=scan.nextInt();

  

   if(Game.getPiece(fromX,fromY).isValid(fromX,fromY,toX,toY)==true)
   {
       if(Game.getPiece(toX,toY)!=null){
       if(Game.getPiece(toX,toY).type=='k'){
           f=0;
           System.out.println("Game is Over!");
           //break;
       }
      
       else{
           if(g.board[fromX][fromY].type=='k' && g.board[fromX][fromY].color=='w' ){
              g.k11=toX;
              g.k12=toY;
              
           }
           if(g.board[fromX][fromY].type=='k' && g.board[fromX][fromY].color=='b' ){
              g.k21=toX;
              g.k22=toY;
              
           }
       
          Game.update(fromX,fromY,toX,toY);
          count++;
          if(Game.getPiece(toX,toY).color=='w')
              Game.wCheck(g.k11,g.k12);
          else
              Game.bCheck(g.k21,g.k22);
       }
      }
       else{
          if(g.board[fromX][fromY].type=='k' && g.board[fromX][fromY].color=='w' ){
              g.k11=toX;
              g.k12=toY;
              
           }
           if(g.board[fromX][fromY].type=='k' && g.board[fromX][fromY].color=='b' ){
              g.k21=toX;
              g.k22=toY;
              
           }
       
          Game.update(fromX,fromY,toX,toY);
          count++;
          if(Game.getPiece(toX,toY).color=='w')
              Game.wCheck(g.k11,g.k12);
          else
              Game.bCheck(g.k21,g.k22);
       }
     }
   
   else{
      System.out.println("it is not the valid move for the piece which you wanted to move");
      System.out.println();
   }
   
        for(j=0;j<8;j++){
                 System.out.print("  "+j+"  ");
           }
           System.out.println();
           
          for(i=0;i<8;i++){
              System.out.print(i);
             for(j=0;j<8;j++){
                if(g.board[i][j]==null)
                    System.out.print(" --  ");
                else{
                 System.out.print(" "); 
                Game.display(g.getPiece(i,j));
                System.out.print("  ");
                }
            }
             System.out.println();
        }   
  }
 }
}
