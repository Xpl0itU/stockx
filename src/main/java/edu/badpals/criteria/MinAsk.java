package edu.badpals.criteria;

import edu.badpals.item.Ask;
import edu.badpals.item.Item;
import edu.badpals.item.Offer;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class MinAsk implements Criteria {
    public MinAsk() {
    }

    public List<Offer> checkCriteria(Item item) {
        Asks asks = new Asks();
        List<Offer> askOffers = asks.checkCriteria(item);
        return List.of(askOffers.stream().min(new Comparator<Offer>() {
            @Override
            public int compare(Offer o1, Offer o2) {
                return o1.compareTo(o2);
            }
        }).orElseGet(null));
    }
}
