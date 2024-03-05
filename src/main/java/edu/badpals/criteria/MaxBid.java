package edu.badpals.criteria;

import edu.badpals.item.Bid;
import edu.badpals.item.Item;
import edu.badpals.item.Offer;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class MaxBid implements Criteria {
    public MaxBid() {
    }

    public List<Offer> checkCriteria(Item item) {
        Bids bids = new Bids();
        List<Offer> bidOffers = bids.checkCriteria(item);
        return List.of(bidOffers.stream().max(new Comparator<Offer>() {
            @Override
            public int compare(Offer o1, Offer o2) {
                return o1.compareTo(o2);
            }
        }).orElseGet(null));
    }
}
