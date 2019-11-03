package enums;

public class ATM {
    private long moneyStash;
    private String name;

    public ATM(final long moneyStash, final String name) {
        this.moneyStash = moneyStash;
        this.name = name;
    }

    public long getMoney(Card card, long much) {
        if (moneyStash - much < 0) {
            throw new RuntimeException(":(");
        }
        this.moneyStash -= much;
        System.out.println(this.toString());
        return much;
    }

    @Override
    public String toString() {
        return "ATM{" +
                "moneyStash=" + moneyStash +
                ", name='" + name + '\'' +
                '}';
    }
}

class Card {
    String number;
    String exprDate;
    String CVV;
    CardType type;

    public Card(String number, String exprDate, String CVV, CardType type) {
        this.number = number;
        this.exprDate = exprDate;
        this.CVV = CVV;
        this.type = type;
    }

    enum CardType {
        VISA, MASTERCARD, AMEX, DINERS;
    }
}