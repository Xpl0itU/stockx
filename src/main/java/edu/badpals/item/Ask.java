package edu.badpals.item;

public class Ask implements Offer {
    String size;
    Integer ask;

    public Ask(String size, Integer ask) {
        this.size = size;
        this.ask = ask;
    }

    public String size() {
        return size;
    }

    public int value() {
        return ask;
    }

    public int compareTo(Offer offer) {
        return this.ask.compareTo(offer.value());
    }

    @Override
    public String toString() {
        return "\t\t" + this.size() + "\t" + this.value() +"\n";
    }
}
