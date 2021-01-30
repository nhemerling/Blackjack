package com.thinkful.blackjack;

import java.util.List;
import java.util.ArrayList;

public class Hand {
    private List<Card> cards;
    private HandStatus status;

    public Hand() {
        this.cards = new ArrayList<>();
        setStatus(HandStatus.OPEN);
    }

    public void addCard(Card card) {
        this.getCards().add(card);
        if (getValue() > 21) {
            setStatus(HandStatus.BUST);
        }
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

    public List<Card> getCards() {
        return cards;
    }

    public HandStatus getStatus() {
        return status;
    }

    public void setStatus(HandStatus status) {
        this.status = status;
    }

}
