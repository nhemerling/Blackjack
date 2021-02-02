package com.thinkful.blackjack;

public class TryItOut {
    public static void main(String args[]) {
        Card c1 = new Card(Face.ACE, Suit.CLUBS);
        Card c2 = new Card(Face.ACE, Suit.CLUBS);
        Card c3 = c1;
        Card c4 = new Card(Face.FOUR, Suit.CLUBS);

        System.out.println(c1 == c2); // false
        System.out.println(c1 == c3); // true
        System.out.println(c2 == c3); // false
        System.out.println(c1 == c4); // false

        System.out.println(c1.equals(c2)); // true
        System.out.println(c1.equals(c3)); // true
        System.out.println(c2.equals(c3)); // true
        System.out.println(c1.equals(c4)); // false
    }
}
