package edu.badpals.stockx.item;

public class Sale implements Offer {
    String size;
    Integer price;

    public Sale(String size, Integer price) {
        this.size = size;
        this.price = price;
    }

    public String size() {
        return size;
    }

    public int value() {
        return price;
    }

    public int compareTo(Offer offer) {
        return this.price.compareTo(offer.value());
    }

    @Override
    public String toString() {
        return "\t\t" + this.size() + "\t" + this.value() +"\n";
    }
}
