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

}
