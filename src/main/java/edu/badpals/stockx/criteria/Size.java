package edu.badpals.stockx.criteria;

import edu.badpals.stockx.item.Item;
import edu.badpals.stockx.item.Offer;

import java.util.List;

public class Size implements Criteria {
    public final String size;

    public Size(String size) {
        this.size = size;
    }

    public List<Offer> checkCriteria(Item item) {
        return item.offers().stream().filter(offer -> offer.size().equals(size)).toList();
    }
}
