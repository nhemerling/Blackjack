package com.thinkful.blackjack;

import java.util.List;
import java.util.ArrayList;

public class Hand {

    private List<Card> cards;

    public List<Card> getCards() {
        return cards;
    }

    public Hand() {
        this.cards = new ArrayList<>();
    }

    public void addCard(Card card) {
        this.getCards().add(card);
    }

    public int getValue() {
        int total = 0;
        for(Card card: this.getCards()) {
            total += card.getValue();
        }
        return total;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        sb.append("[");
        for (Card c: this.getCards()) {
            sb.append(String.format("%s", c));
        }
        if (this.getCards().size() > 0) {
            sb.deleteCharAt(sb.length() - 1); // remove the extraneous comma
        }
        sb.append("]");

        return String.format("Value=%d, %s", this.getValue(), sb.toString());
    }

}
