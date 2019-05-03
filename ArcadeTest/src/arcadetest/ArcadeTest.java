/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arcadetest;

import java.util.Scanner;

/**
 *
 * @author m128155
 */
public class ArcadeTest {

    public void start()
    {
        Cards first = new Cards(Terminal.newCard());
        Cards second = new Cards(Terminal.newCard());
        Terminal term = new Terminal();
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Choose a card to play with, Card 1 or 2");
        int cardOption = Integer.parseInt(scanner.nextLine());
        
        if(cardOption == 1)
        {
            term.swipe(first, second);
        }
        else if(cardOption ==2)
        {
            term.swipe(second, first);
        }
        else
        {
            System.out.println("Please enter either 1 or 2");
            start();
        }
    }
    public static void main(String[] args) {
        ArcadeTest arcadeGame = new ArcadeTest();
        arcadeGame.start();
    }
    
}
