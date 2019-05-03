/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arcadetest;

/**
 *
 * @author m128155
 */
public class Prizes {
  
   private int mammals;
   private int insect;
   private int fish;
   //constructor for each new object of Prizes,
   public Prizes()
   {
        mammals =10;
        insect =10;
        fish =10;
   }
     
   public int getMammals()
   {
       return mammals;
   }
   public void setMammals(int amount)
   {
       mammals = amount -1;
   }
   public int getInsects()
   {
       return insect;
   }
   public void setInsect(int amount)
   {
       insect = amount -1;
   }
   public int getFish()
   {
       return fish;
   }
   public void setFish(int amount)
   {
       fish = amount -1;
   }
}
