package com.gildedrose.strategy;

import com.gildedrose.Item;

public class ConjuredStrategy implements CategoryStrategy{

    NormalStrategy normalStrategy = new NormalStrategy();

    @Override
    public Item updateQuality(Item item) {
        normalStrategy.updateQuality(item);
        if (item.quality > 0) {
            decreaseQuality(item);
            if (isExpired(item)) {
                decreaseQuality(item);
            }
        }
        return item;
    }
}
