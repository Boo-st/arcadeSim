/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arcadetest;

import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author m128155
 * Mitchel King
 * 1/05/1029
 */
public class Terminal {
   Scanner scanner = new Scanner(System.in);
   Prizes prize = new Prizes();
   public void transfer(Cards card1, Cards card2)
   {
       card2.setTbalance(card1.getTbalance());
       card2.setCbalance(card1.getCbalance());
       
       card1.setTbalance(0);
       card1.setCbalance(0);
       
       System.out.println("Your card number is: "+card1.getNumber());
       System.out.println("Your new ticket count is: "+card1.getTbalance());
       System.out.println("Your new credit count is: "+card1.getCbalance());
       
       System.out.println("Your card number is: "+card2.getNumber());
       System.out.println("Your new ticket count is: "+card2.getTbalance());
       System.out.println("Your new credit count is: "+card2.getCbalance());
       
   }
   public static int newCard()
    {
        Random number = new Random();
        int arg = number.nextInt(1000);
        return arg;
    }
    public void Load(int amount, Cards card)
    {
        int credits = amount *2;
        card.setCbalance(credits);
        System.out.println("Balance is now loaded");
        System.out.println("Your balance is now :" + card.getCbalance());
    }
    public void Loadcash(Cards card)
    {           
        System.out.println("Howmuch would you like to deposit?");
        int input = Integer.parseInt(scanner.nextLine());
        //Terminal newTerm = new Terminal();
        Load(input, card);              
    }
    
    public void balance(Cards card)
    {
        System.out.println("Your Credit balance is : " + card.getCbalance()+"\nYour Ticket balance is : " + card.getTbalance());
    }
    
    public void swipe(Cards card, Cards card1)
    {
            System.out.println("Your card number is: "+card.getNumber()+"\n");
            System.out.println("Welcome, What would you like to do?");
            System.out.println("1: Load credits\n2: Play game\n3: Request prize\n4: View balance\n5: Transfer credits\n6: Exit");
            String start = scanner.nextLine();
            
            switch (start)
            {
            case "1":
                Loadcash(card);
                swipe(card, card1);
                break;
            case "2":
                Games game = new Games();
                System.out.println("Which game would you like to play");
                System.out.println("1: Shooting\n2: Wack a mole\n3: Mortal Kombat");
                String whichGame = scanner.nextLine();
                //get rid of int parse and empty string check for better error handling, change to string check
                //which handles incorrect numbers and also letter input, disabled for all input testing options below
                //if((!"NumberFormatException".equals(errorTest)))
                //if((!"".equals(errorTest)))
                {
                    //int whichGame = Integer.parseInt(errorTest);
                    switch (whichGame) 
                    {
                        case "1":
                            game.playShooting(card, card1);
                            break;
                        case "2":
                            game.playWackamole(card, card1);
                            break;
                        case "3":
                            game.playMortalkombat(card, card1);
                            break;
                        default:
                            System.out.println("Please make a selection");
                            swipe(card, card1);
                            break;
                    }                 
                }
//                else
//                {
//                    System.out.println("Please make a selection");
//                    swipe(card, card1);
//                }
                break;
            case "3":
//                Prizes prize = new Prizes();
                System.out.println("We have a variety of plush toys to chose from, please make your selection");
                System.out.println("1: Mammal - 20 tickets\n2: Insect - 50 tickets \n3: Fish - 100 tickets");
                String prizeChoice = scanner.nextLine();
                //if(!"".equals(errorTest))
                {
                    //int prizeChoice = Integer.parseInt(errorTest);
                
                    switch(prizeChoice)
                    {
                        case "1":
                            //check balance
                            if(card.getTbalance()>20)
                            {
                                System.out.println("You have enough tickets, enhoy your prize!");
                                //remove tickets from card, remove item from prize stock
                                card.setTbalance(card.getTbalance()-20);
                                prize.setMammals(prize.getMammals());

                                //printing card data
                                System.out.println("Your card number is: "+card.getNumber());
                                System.out.println("Your new ticket count is: "+card.getTbalance());
                                System.out.println("There are "+prize.getMammals()+" Mammals left");

                                try 
                                {
                                    //delay and then repeat menu
                                    TimeUnit.SECONDS.sleep(3);
                                } 
                                catch (InterruptedException ex) 
                                {
                                    Logger.getLogger(Games.class.getName()).log(Level.SEVERE, null, ex);
                                }
                                swipe(card, card1);
                            }
                            else
                            {
                                System.out.println("You do not have enough tickets for this game");
                                swipe(card, card1);
                            }
                            break;
                        case "2":
                            if(card.getTbalance()>50)
                            {
                                System.out.println("You have enough tickets, enhoy your prize!");
                                //remove tickets from card, remove item from prize stock
                                card.setTbalance(card.getTbalance()-50);
                                prize.setInsect(prize.getInsects());

                                //printing card data
                                System.out.println("Your card number is: "+card.getNumber());
                                System.out.println("Your new ticket count is: "+card.getTbalance());
                                System.out.println("There are "+prize.getInsects()+" Insects left");

                                try 
                                {
                                    //delay and then repeat menu
                                    TimeUnit.SECONDS.sleep(3);
                                } 
                                catch (InterruptedException ex) 
                                {
                                    Logger.getLogger(Games.class.getName()).log(Level.SEVERE, null, ex);
                                }
                                swipe(card, card1);
                            }
                            else
                            {
                                System.out.println("You do not have enough tickets for this game");
                                swipe(card, card1);
                            }
                            break;
                        case "3":
                            if(card.getTbalance()>100)
                            {
                                System.out.println("You have enough tickets, enhoy your prize!");
                                //remove tickets from card, remove item from prize stock
                                card.setTbalance(card.getTbalance()-100);
                                prize.setFish(prize.getFish());

                                //printing card data
                                System.out.println("Your card number is: "+card.getNumber());
                                System.out.println("Your new ticket count is: "+card.getTbalance());
                                System.out.println("There are "+prize.getFish()+" Fish left");

                                try 
                                {
                                    //delay and then repeat menu
                                    TimeUnit.SECONDS.sleep(3);
                                } 
                                catch (InterruptedException ex) 
                                {
                                    Logger.getLogger(Games.class.getName()).log(Level.SEVERE, null, ex);
                                }
                                swipe(card, card1);
                            }
                            else
                            {
                                System.out.println("You do not have enough tickets for this prize");
                                swipe(card, card1);
                            }
                            break;
                        default:
                            System.out.println("Please make a selection");
                            swipe(card, card1);
                    }
                }
//                else
//                {
//                    System.out.println("Please make a selection");
//                    swipe(card, card1);
//                }
                
            case "4":
                balance(card);
                swipe(card, card1);
                break;
                
            case "5":
                System.out.println("Transferring the contents of your active card, to the second card");
                //String transferAnswer = scanner.nextLine();
                //if(!"".equals(errorTest))
                {                          
                    //int transferAnswer = Integer.parseInt(errorTest);
                    //comment out un neccessary code, transfer will transfer active card to non active card
                    //switch(transferAnswer)
                    {
                        //case "1":
                            System.out.println("Your card number is: "+card.getNumber());
                            System.out.println("Your current ticket count is: "+card.getTbalance());
                            System.out.println("Your current credit count is: "+card.getCbalance());

                            transfer(card, card1);
                            swipe(card, card1);
//                            break;
//
//                        case "2":
//                            System.out.println("Your card number is: "+card.getNumber());
//                            System.out.println("Your current ticket count is: "+card.getTbalance());
//                            System.out.println("Your current credit count is: "+card.getCbalance());
//
//                            transfer(card, card1);
//                            swipe(card, card1);
//                            break;
//                        default:
//                            System.out.println("Please make a selection");
//                            swipe(card, card1);
                    }            
                }
//                else
//                {
//                    System.out.println("Please make a selection");
//                    swipe(card, card1);
//                }
                         
            case "6":
                System.out.println("Thank you for playing, closing application");
                System.exit(0);
                //close pls
                break;
            default:
                System.out.println("Please make a selection");
                swipe(card, card);
                break;
        }       
    }
}
