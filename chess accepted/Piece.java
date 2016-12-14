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
 abstract class Piece {
   public char type;
  public char color;
  public void setcolor(char c) {
   color=c;
   }
   
  /* public static char getcolor(int x,int y) {
       String str=Game.getPiece(x,y).toString();
       return str.charAt(2);
    }*/
    
   public abstract boolean isValid(int fromX,int fromY,int toX,int toY); 
     
  }
    

