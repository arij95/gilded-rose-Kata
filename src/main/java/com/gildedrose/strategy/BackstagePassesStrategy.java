package com.gildedrose.strategy;

import com.gildedrose.Item;

public class BackstagePassesStrategy implements CategoryStrategy{

    @Override
    public Item updateQuality(Item item) {
        increaseQuality(item);
        if (item.sellIn < 11) {
            increaseQuality(item);
        }
        if (item.sellIn < 6) {
            increaseQuality(item);
        }
        decreaseSellIn(item);
        if (isExpired(item)) {
            item.quality = 0;
        }

        return item;
    }

}
