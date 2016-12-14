/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//package chess;
package chess;



/**
 *
 * @author prasu
 */
public class Game{
           int k11,k22,k12,k21;
       static  Piece board[][]=new Piece[8][8];
         Game()
                 {
                    rook r1w=new rook();
                   rook r2w=new rook();
                   rook r1b=new rook();
                   rook r2b=new rook();

                    bishop b1w=new bishop();
                    bishop b2w=new bishop();
                    bishop  b1b=new bishop();
                    bishop   b2b=new bishop();

                        knight n1w=new knight();
                         knight n2w=new knight();
                          knight n1b=new knight();
                           knight n2b=new knight();

               queen qw=new queen();
                queen qb=new queen();

                king kw=new king();
                king kb=new king();

                pawn p1w=new pawn();
                pawn p2w=new pawn();
                pawn p3w=new pawn();
                pawn p4w=new pawn();
                pawn p5w=new pawn();
                pawn p6w=new pawn();
                pawn p7w=new pawn();
                pawn p8w=new pawn();

                  pawn p1b=new pawn();
                  pawn p2b=new pawn();
                  pawn p3b=new pawn();
                  pawn p4b=new pawn();
                  pawn p5b=new pawn();
                  pawn p6b=new pawn();
                  pawn p7b=new pawn();
                  pawn p8b=new pawn();
                  
                  
  
       board[1][0]= p1w;
       board[1][1]= p2w;
       board[1][2]= p3w;
       board[1][3]= p4w;
       board[1][4]= p5w;
       board[1][5]= p6w;
       board[1][6]= p7w;
       board[1][7]= p8w; 
       
       board[0][0]=r1w;
       board[0][1]=n1w;
       board[0][2]=b1w;
       board[0][3]=qw;
       board[0][4]=kw;
       k11=0;
       k12=4;
       board[0][7]=r2w;
       board[0][6]=n2w;
       board[0][5]=b2w;
      
       board[6][0]= p1b;
       board[6][1]= p2b;
       board[6][2]= p3b;
       board[6][3]= p4b;
       board[6][4]= p5b;
       board[6][5]= p6b;
       board[6][6]= p7b;
       board[6][7]= p8b;  
       
       board[7][0]=r1b;
       board[7][1]=n1b;
       board[7][2]=b1b;
       board[7][3]=qb;
       board[7][4]=kb;
       k21=7;
       k22=4;
       board[7][7]=r2b;
       board[7][6]=n2b;
       board[7][5]=b2b;

                

        for(int i=0;i<2;i++){
            for(int j=0;j<8;j++){
              board[i][j].setcolor('w');
         }
        }

             for(int i=6;i<8;i++){
                for(int j=0;j<8;j++){
                  board[i][j].setcolor('b');
              }
            }
    }
        public static Piece getPiece(int x,int y){
                 return board[x][y];
             }


         public static void update(int fromX,int fromY,int toX,int toY){
                board[toX][toY]=board[fromX][fromY];
                board[fromX][fromY]=null;
               }
         
  public static void display(Piece p){
     
      if(p.color=='w')
          System.out.print("w");
      
     if(p.color=='b')
          System.out.print("b");
     
     if(p.type=='r')
         System.out.print("r");
     
     if(p.type=='n')
         System.out.print("n");
     
     if(p.type=='p')
         System.out.print("p");
     
     if(p.type=='q')
         System.out.print("q");
     
     if(p.type=='s')
         System.out.print("s");
     
     if(p.type=='k')
         System.out.print("k");
  }
  
  public static void wCheck(int k11,int k12){
      for(int z=0;z<8;z++){
          for(int a=0;a<8;a++){
              if(board[z][a]!=null){
              if(board[z][a].color=='b')
              {
                 int fromX=z;
                 int fromY=a;
                 int toX=k11;
                 int toY=k12;
                 if(getPiece(fromX,fromY).isValid(fromX,fromY,toX,toY)==true)
                     System.out.println("check");
              }
          }
              }
          }
      }
  
  
  public static void bCheck(int k21,int k22){
      for(int z=0;z<8;z++){
          for(int a=0;a<8;a++){
             if(board[z][a]!=null){
              if(board[z][a].color=='w')
              {
                 int fromX=z;
                 int fromY=a;
                 int toX=k21;
                 int toY=k22;
                 if(getPiece(fromX,fromY).isValid(fromX,fromY,toX,toY)==true)
                     System.out.println("check");
              }
             }
              }
          }
      }
  }
           


  
