package edu.badpals.criteria;

import edu.badpals.item.Bid;
import edu.badpals.item.Item;
import edu.badpals.item.Offer;

import java.util.List;

public class Bids implements Criteria {
    public Bids() {
    }

    public List<Offer> checkCriteria(Item item) {
        return item.offers().stream().filter(offer -> offer.getClass().equals(Bid.class)).toList();
    }
}
