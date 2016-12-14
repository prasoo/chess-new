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

   public class queen extends Piece{
       
        public queen(){
         this.type='q';
     }
        
        rook r=new rook();
        bishop b=new bishop();
        
        @Override
     public boolean isValid(int fromX,int fromY,int toX,int toY) {
          if(fromX==toX && fromY==toY)
                return false;
     
      if(toX < 0 || toX > 7 || fromX < 0 || fromX > 7 || toY < 0 || toY > 7 || fromY <0 || fromY > 7)
            return false;
     
        if(r.isValid(fromX,fromY,toX,toY) || b.isValid(fromX,fromY,toX,toY))
          return true;
        return false;
    }
   }