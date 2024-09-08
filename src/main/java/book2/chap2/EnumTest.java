
package book2.chap2;

/**
 * @author thamsanqa 2024
 **/
public class EnumTest {
    public enum CardSuit {HEARTS, SPADES, CLUBS, DIAMONDS};
    
    public static void main(String[] args) {
        CardSuit suit;
        //choosing value
        suit = CardSuit.HEARTS;
        System.out.println("The suit is " + suit);
    }
}
