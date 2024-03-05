package edu.badpals.criteria;

import edu.badpals.item.Item;
import edu.badpals.item.Offer;
import edu.badpals.item.Sale;

import java.util.List;

public class Sales implements Criteria {
    public Sales() {
    }

    public List<Offer> checkCriteria(Item item) {
        return item.offers().stream().filter(offer -> offer.getClass().equals(Sale.class)).toList();
    }
}
