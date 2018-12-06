package hshken.com.pokercard;

public class Card {
    char[] suit = {'\u2663','\u2666','\u2665','\u2660'};
    int value;
    public Card(int value){
        this.value = value;
    }
    public String get(){
        return value%13+1 + "" + suit[value/13];
    }
}
