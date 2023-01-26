package com.gildedrose.strategy;

import com.gildedrose.Item;

public class NormalStrategy implements CategoryStrategy{

    @Override
    public Item updateQuality(Item item) {
        decreaseSellIn(item);
        if (item.quality > 0) {
            decreaseQuality(item);
            if (isExpired(item)) {
                decreaseQuality(item);
            }
        }
        return item;
    }

}
