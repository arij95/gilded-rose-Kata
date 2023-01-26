package com.gildedrose.strategy;

import com.gildedrose.Item;

public interface CategoryStrategy {

    Item updateQuality(Item item);

    default Item decreaseQuality (Item item) {
        if (item.quality > 0) {
            item.quality --;
        }
        return item;
    }

    default Item increaseQuality (Item item) {
        if (item.quality < 50) {
            item.quality ++;
        }
        return item;
    }

    default Item decreaseSellIn (Item item) {
        item.sellIn --;
        return item;
    }

    default boolean isExpired (Item item) {
        return item.sellIn < 0;
    }

}
