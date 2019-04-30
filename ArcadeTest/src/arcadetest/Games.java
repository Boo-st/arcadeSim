/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arcadetest;

import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author m128155
 */
public class Games {
    Terminal term = new Terminal();
   
    public void playShooting(Cards card, Cards card1)
    {
        //check balance
        if(card.getCbalance()>3)
        {
            System.out.println("Welcome to the shooting game, enjoy!");
            card.setCbalance(card.getCbalance()-3);
            
            //random number for ticket prize
            int ticketInt = Terminal.newCard();
            card.setTbalance(card.getTbalance()+ticketInt);
            
            //printing card data
            System.out.println("Your card number is: "+card.getNumber());
            System.out.println("You have won "+ticketInt+ " tickets, your new total is: "+card.getTbalance());
            
            try 
            {
                //delay and then repeat menu
                TimeUnit.SECONDS.sleep(3);
            } 
            catch (InterruptedException ex) 
            {
                Logger.getLogger(Games.class.getName()).log(Level.SEVERE, null, ex);
            }
            term.swipe(card, card1);
        }
        else
        {
            System.out.println("You do not have enough credits to play this game, this game cost 3 credits");
        }
    }
    
    public void playWackamole(Cards card, Cards card1)
    {
        if(card.getCbalance()>1)
        {
            System.out.println("Welcome to the Wack a mole, enjoy!");
            card.setCbalance(card.getCbalance()-1);
            
            int ticketInt = Terminal.newCard();
            card.setTbalance(card.getTbalance()+ticketInt);
            
            System.out.println("Your card number is: "+card.getNumber());
            System.out.println("You have won "+ticketInt+ " tickets, your new total is: "+card.getTbalance());
            
            try 
            {
                //delay and then repeat menu
                TimeUnit.SECONDS.sleep(3);
            } 
            catch (InterruptedException ex) 
            {
                Logger.getLogger(Games.class.getName()).log(Level.SEVERE, null, ex);
            }
            term.swipe(card, card1);
        }
        else
        {
            System.out.println("You do not have enough credits to play this game, this game costs 1 credit");
        }
    }
    
    public void playMortalkombat(Cards card, Cards card1)
    {
        if(card.getCbalance()>2)
        {
            System.out.println("Welcome to the Wack a mole, enjoy!");
            card.setCbalance(card.getCbalance()-2);
            
            int ticketInt = Terminal.newCard();
            card.setTbalance(card.getTbalance()+ticketInt);
            
            System.out.println("Your card number is: "+card.getNumber());
            System.out.println("You have won "+ticketInt+ " tickets, your new total is: "+card.getTbalance());
            
             try 
            {
                //delay and then repeat menu
                TimeUnit.SECONDS.sleep(3);
            } 
            catch (InterruptedException ex) 
            {
                Logger.getLogger(Games.class.getName()).log(Level.SEVERE, null, ex);
            }
            term.swipe(card, card1);
        }
        else
        {
            System.out.println("You do not have enough credits to play this game, this game cost 2 credits");
        }
    }
}
