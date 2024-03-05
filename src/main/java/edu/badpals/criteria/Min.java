package edu.badpals.criteria;

import edu.badpals.item.Item;
import edu.badpals.item.Offer;

import java.util.List;

public class Min implements Criteria {
    private Criteria criteria;
    private Criteria otherCriteria;

    public Min(Criteria criteria, Criteria otherCriteria) {
        this.criteria = criteria;
        this.otherCriteria = otherCriteria;
    }

    public List<Offer> checkCriteria(Item item) {
        AndCriteria andCriteria = new AndCriteria(criteria, otherCriteria);
        return List.of(andCriteria.checkCriteria(item).stream().min(Offer::compareTo).orElse(null));
    }
}
