package hshken.com.pokercard;

import java.util.Random;

public class Poker {
    Card[] cards = new  Card[52];
    public Poker(){
        for (int i = 0; i < 52; i++){
            cards[i] = new Card(i);
        }
    }
    public void shuffle(){
        for (int i = 0 ; i<52; i++){
            int j = new Random().nextInt(52);
            Card tmp = cards[i];
            cards[i] = cards[j];
            cards[j] = tmp;
        }
    }
}
