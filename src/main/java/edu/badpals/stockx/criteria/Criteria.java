package edu.badpals.stockx.criteria;

import edu.badpals.stockx.item.Item;
import edu.badpals.stockx.item.Offer;

import java.util.List;

public interface Criteria {
    List<Offer> checkCriteria(Item item);
}
