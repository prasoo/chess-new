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
 public class rook extends Piece{
     
      public rook()
     {
         type='r';
     }
      
     static int i;
     static int flag;
     
     
      @Override
     public  boolean isValid(int fromX,int fromY,int toX,int toY) {
         
         if(fromX==toX && fromY==toY)
            return false;
     
      if(toX < 0 || toX > 7 || fromX < 0 || fromX > 7 || toY < 0 || toY > 7 || fromY <0 || fromY > 7)
            return false;
        
            if(fromX==toX)
            {
              for(i=fromY;i<toY;i++){
              if(Game.getPiece(toX,i)!=null)
                flag=1;
              else 
                flag=0;
            }
          }

            if(fromY==toY){            
            for(i=fromX;i<toX;i++){
              if(Game.getPiece(i,toY)!=null)
                flag=1;
              else 
                flag=0;
            }
          }

          if((Game.getPiece(toX,toY)!=null && Game.getPiece(toX,toY).color!= Game.getPiece(fromX,fromY).color && flag==0) || (Game.getPiece(toX,toY)==null && flag==0)){
            
            for(i=0;i<8;i++){              
                 if(toX==fromX+i && toY==fromY)
                  return true; 
                 if( toX==fromX-i && toY==fromY)
                     return true;
                      
                 if(toY==fromY+i  && toX==fromX)                                    
                     return true; 
                 if(toY==fromY-i && toX==fromX)
                     return true;
            }            
      }
          return false;
    }
  }

