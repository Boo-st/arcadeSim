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
public class Cards {
    private double cBalance;
    private double tBalance;
    private int cardNumber;
    //constructor which takes 1 argument, randomly generated number
    public Cards(int number)
    {
        cardNumber = number;
    }   
    public int getCard()
    {
        return cardNumber;
    }
    public double getCbalance()
    {
        return cBalance;
    }
    public void setCbalance(double x)
    {
        cBalance = x;
    }   
    public double getTbalance()
    {
        return tBalance;
    }
    public void setTbalance(double x)
    {
        tBalance = x;
    }    
    public int getNumber()
    {
        return cardNumber;
    }   
}
