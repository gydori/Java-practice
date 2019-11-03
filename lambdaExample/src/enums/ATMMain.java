package enums;

import enums.Card.CardType;

public class ATMMain {
    public static final Card card = new Card("4111111111", "03/22", "123", CardType.VISA);

    public static void main(String[] args) {
        ATM andy = new ATM(1000, "Andy");
        var m = andy.getMoney(card, 200);
    }
}
