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
public class king extends Piece{
   
     public king()
     {
         type='k';
     }
     
   public boolean isValid(int fromX,int fromY,int toX,int toY) {
    if(fromX==toX && fromY==toY)
     return false;
     
      if(toX < 0 || toX > 7 || fromX < 0 || fromX > 7 || toY < 0 || toY > 7 || fromY <0 || fromY > 7)
            return false;
     
     if(Game.getPiece(toX,toY)!=null  && (Game.getPiece(toX,toY).color!= Game.getPiece(fromX,fromY).color)){
     if((toX==fromX+1 || toX==fromX-1) && (toY==fromY+1 || toY==fromY-1))
      return true;
     }
    
  if(Game.getPiece(toX,toY)==null)
  {
     if((toX==fromX+1 || toX==fromX-1 || toX==fromX) && (toY==fromY+1 || toY==fromY-1 || toY==fromY))
      return true;
  }
  return false;  
  }
}
