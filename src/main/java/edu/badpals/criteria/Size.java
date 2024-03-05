package edu.badpals.criteria;

import edu.badpals.item.Item;
import edu.badpals.item.Offer;

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
