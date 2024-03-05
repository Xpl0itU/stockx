package edu.badpals.criteria;

import edu.badpals.item.Item;
import edu.badpals.item.Offer;

import java.util.List;

public class AndCriteria implements Criteria {
    private Criteria criteria;
    private Criteria otherCriteria;

    public AndCriteria(Criteria criteria, Criteria otherCriteria) {
        this.criteria = criteria;
        this.otherCriteria = otherCriteria;
    }

    public List<Offer> checkCriteria(Item item) {
        List<Offer> firstCriteriaItems = criteria.checkCriteria(item);
        return otherCriteria.checkCriteria(item).stream().filter(firstCriteriaItems::contains).toList();
    }
}
