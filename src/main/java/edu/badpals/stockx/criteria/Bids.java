package edu.badpals.stockx.criteria;

import edu.badpals.stockx.item.Bid;
import edu.badpals.stockx.item.Item;
import edu.badpals.stockx.item.Offer;

import java.util.List;

public class Bids implements Criteria {
    public Bids() {
    }

    public List<Offer> checkCriteria(Item item) {
        return item.offers().stream().filter(offer -> offer.getClass().equals(Bid.class)).toList();
    }
}
