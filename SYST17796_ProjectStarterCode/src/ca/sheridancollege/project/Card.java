/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.sheridancollege.project;


public class Card {
    public enum Color { YELLOW, BLUE, GREEN, RED; }
 
    public enum CardValue { ZERO,ONE,TWO, THREE, FOUR, FIVE, SIX, SEVEN, EIGHT, 
                       NINE, PICK_TWO, REVERSE, SKIP, WILD, WILD_FOUR; }
     
    CardValue cardValue;
    Color color;
    
 
    public Card ( CardValue cardValue, Color color) {
        this.cardValue = cardValue;
        this.color = color;
        
    }
     
    public String toString(){
        if(cardValue.equals(CardValue.WILD)||cardValue.equals(CardValue.WILD_FOUR)){
            return cardValue.name();
        }
        else{
        return cardValue.name()+"-"+color.name();
        }
        }
     
    public boolean canPlay(Card otherCard) {
         
        return this.cardValue == otherCard.cardValue || this.color == otherCard.color;
    }
     
  public boolean canPlayColor(Card otherCard) {
         
        return this.color == otherCard.color;
    }
     
} 
