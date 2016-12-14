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
public class pawn extends Piece
  {
    
     public pawn()
     {
         type='p';
     }
     
    public  boolean isValid(int fromX, int fromY, int toX, int toY) {
         if(fromX==toX && fromY==toY)
            return false;
     
      if(toX < 0 || toX > 7 || fromX < 0 || fromX > 7 || toY < 0 || toY > 7 || fromY <0 || fromY > 7)
            return false;
     
     if(Game.getPiece(toX,toY)==null)
     {
         if(Game.getPiece(fromX,fromY).color=='w'){
       if(toX==fromX+1 && toY==fromY)
        return true;
       if(toX==fromX+2 && fromX==1)
        return true;
         }
         
       if(Game.getPiece(fromX,fromY).color=='b'){
       if(toX==fromX-1 && toY==fromY)
        return true;
       if(toX==fromX-2 && fromX==6)
        return true;
         }
     }
     
      
       if(Game.getPiece(toX,toY)!=null  && Game.getPiece(toX,toY).color!=Game.getPiece(fromX,fromY).color)
       {
         
        if(Game.getPiece(fromX,fromY).color=='w'){
            if(toX==fromX+1 && toY==fromY+1)
            {
               
                return true;
            }
        }
        if(Game.getPiece(fromX,fromY).color=='b'){
            if(toX==fromX-1 && toY==fromY-1)
            {
               
                    return true;
          }
         }
        }
       
        return false;
    }
}
