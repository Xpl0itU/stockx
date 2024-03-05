package edu.badpals.criteria;

import edu.badpals.item.Ask;
import edu.badpals.item.Item;
import edu.badpals.item.Offer;

import java.util.List;

public class Asks implements Criteria {
    public Asks() {
    }

    public List<Offer> checkCriteria(Item item) {
        return item.offers().stream().filter(offer -> offer.getClass().equals(Ask.class)).toList();
    }
}
