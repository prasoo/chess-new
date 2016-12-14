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
public class bishop extends Piece{
    
     public bishop()
     {
         type='s';
     }
    static int flag;
     static  int i;
      static  int j;
     
     
     
     public  boolean isValid(int fromX, int fromY, int toX, int toY) {
         if(fromX==toX && fromY==toY)
           return false;
     
      if(toX < 0 || toX > 7 || fromX < 0 || fromX > 7 || toY < 0 || toY > 7 || fromY <0 || fromY > 7)
            return false;
     
      if(fromX<toX && fromY<toY){
          i=fromX;
          j=fromY;
          while(i<toX && j<toY){
        
          if(Game.getPiece(i,j)==null)
            flag=0;
          else 
            flag=1;
          i++;
          j++;
        }
      }

         if(fromX>toX && fromY<toY){
        
        i=fromX;
          j=fromY;
          while(i>toX && j<toY){
          if(Game.getPiece(i,j)==null)
            flag=0;
           else 
            flag=1;
          
          i--;
          j++;
        }
      }

         if(fromX<toX && fromY>toY){
             i=fromX;
             j=fromY;
       
       while(i<toX && j>toY){
          if(Game.getPiece(i,j)==null)
            flag=0;
           else 
            flag=1;
          
          i++;
          j--;
        }
      }
         if(fromX>toX && fromY>toY){
             i=fromX;
             j=fromY;
        
        while(i>toX && j>toY){
          if(Game.getPiece(i,j)==null)
            flag=0;
           else 
            flag=1;
          
          i--;
          j--;
        }
      }

    if((Game.getPiece(toX,toY)!=null && Game.getPiece(fromX,fromY).color!= Game.getPiece(toX,toY).color && flag==0) || Game.getPiece(toX,toY)==null && flag==0){
       
            for(i=0;i<8;i++){ 
                
                 if(toX==fromX+i && toY==fromY+i)  
                  return true; 
                 if(toX==fromX-i && toY==fromY+i)
                     return true;           
                   if(toX==fromX+i && toY==fromY-i)  
                     return true;
                   if(toX==fromX-i && toY==fromY-i)
                       return true;
            }

    }
   return false;
  }
}