package edu.badpals.item;

public class Bid implements Offer {
    String size;
    Integer bid;

    public Bid(String size, Integer bid) {
        this.size = size;
        this.bid = bid;
    }

    public String size() {
        return size;
    }

    public int value() {
        return bid;
    }

    public int compareTo(Offer offer) {
        return this.bid.compareTo(offer.value());
    }

    @Override
    public String toString() {
        return "\t\t" + this.size() + "\t" + this.value() +"\n";
    }
}
