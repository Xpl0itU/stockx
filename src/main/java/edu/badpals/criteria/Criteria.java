package edu.badpals.criteria;

import edu.badpals.item.Item;
import edu.badpals.item.Offer;

import java.util.List;

public interface Criteria {
    List<Offer> checkCriteria(Item item);
}
