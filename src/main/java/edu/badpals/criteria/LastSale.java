package edu.badpals.criteria;

import edu.badpals.item.Item;
import edu.badpals.item.Offer;

import java.util.List;

public class LastSale implements Criteria {
    public LastSale() {
    }

    public List<Offer> checkCriteria(Item item) {
        Sales sales = new Sales();
        List<Offer> saleOffers = sales.checkCriteria(item);
        if (saleOffers.isEmpty()) {
            return List.of();
        }
        return List.of(saleOffers.getLast());
    }
}
