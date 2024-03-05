package edu.badpals.stockx.criteria;

import edu.badpals.stockx.item.Ask;
import edu.badpals.stockx.item.Item;
import edu.badpals.stockx.item.Offer;

import java.util.List;

public class Asks implements Criteria {
    public Asks() {
    }

    public List<Offer> checkCriteria(Item item) {
        return item.offers().stream().filter(offer -> offer.getClass().equals(Ask.class)).toList();
    }
}
