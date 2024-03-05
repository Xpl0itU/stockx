package edu.badpals.stockx.item;

import java.util.ArrayList;
import java.util.List;

public class Sneaker implements Item {
    String style;
    String name;
    int sale;
    int ask;
    int bid;
    List<Offer> offers;

    public Sneaker(String style, String name) {
        this.style = style;
        this.name = name;
        offers = new ArrayList<>();
    }

    public Object getStyle() {
        return style;
    }

    public Object getName() {
        return name;
    }

    public int getSale() {
        return sale;
    }

    public void setSale(int sale) {
        this.sale = sale;
    }

    public int getBid() {
        return bid;
    }

    public void setBid(int bid) {
        this.bid = bid;
    }

    public int getAsk() {
        return ask;
    }

    public void setAsk(int ask) {
        this.ask = ask;
    }

    public void add(Offer offer) {
        offers.add(offer);
    }

    public List<Offer> offers() {
        return offers;
    }

    @Override
    public String toString() {
        return this.name + "\n \t \t" + this.style;
    }
}
