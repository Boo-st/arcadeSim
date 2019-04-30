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
    
   private int mammals =10;
   private int insect =10;
   private int fish =10;
   
   public int getMammals()
   {
       return mammals;
   }
   public void setMammals(int amount)
   {
       mammals = mammals - amount;
   }
   public int getInsects()
   {
       return insect;
   }
   public void setInsect(int amount)
   {
       insect = insect - amount;
   }
   public int getFish()
   {
       return fish;
   }
   public void setFish(int amount)
   {
       fish = fish - amount;
   }
}
