package com.gildedrose.strategy;

import com.gildedrose.Item;

public class AgedBrieStrategy implements CategoryStrategy{

    @Override
    public Item updateQuality(Item item) {
        increaseQuality(item);
        decreaseSellIn(item);
        if (isExpired(item)) {
            increaseQuality(item);
        }
        return item;
    }

}
