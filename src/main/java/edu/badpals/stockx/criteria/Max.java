package edu.badpals.stockx.criteria;

import edu.badpals.stockx.item.Item;
import edu.badpals.stockx.item.Offer;

import java.util.List;

public class Max implements Criteria {
    private Criteria criteria;
    private Criteria otherCriteria;

    public Max(Criteria criteria, Criteria otherCriteria) {
        this.criteria = criteria;
        this.otherCriteria = otherCriteria;
    }

    public List<Offer> checkCriteria(Item item) {
        AndCriteria andCriteria = new AndCriteria(criteria, otherCriteria);
        return List.of(andCriteria.checkCriteria(item).stream().max(Offer::compareTo).orElse(null));
    }
}
