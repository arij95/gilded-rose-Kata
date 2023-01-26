package com.gildedrose;

import com.gildedrose.strategy.AgedBrieStrategy;
import com.gildedrose.strategy.BackstagePassesStrategy;
import com.gildedrose.strategy.ConjuredStrategy;
import com.gildedrose.strategy.NormalStrategy;

class GildedRose {
    public static final String AGED_BRIE = "Aged Brie";
    public static final String BACKSTAGE_PASSES = "Backstage passes to a TAFKAL80ETC concert";
    public static final String SULFURAS = "Sulfuras, Hand of Ragnaros";
    public static final String CONJURED = "Conjured Mana Cake";

    Item[] items;

    AgedBrieStrategy agedBrieStrategy = new AgedBrieStrategy();
    BackstagePassesStrategy backstagePassesStrategy = new BackstagePassesStrategy();
    ConjuredStrategy conjuredStrategy = new ConjuredStrategy();
    NormalStrategy normalStrategy = new NormalStrategy();

    public GildedRose(Item[] items) {
        this.items = items;
    }

    public void updateQuality() {
        for (Item item : items) {
            switch (item.name) {
                case AGED_BRIE:
                    agedBrieStrategy.updateQuality(item);
                    break;
                case BACKSTAGE_PASSES:
                    backstagePassesStrategy.updateQuality(item);
                    break;
                case CONJURED:
                    conjuredStrategy.updateQuality(item);
                case SULFURAS:
                    break;
                default:
                    normalStrategy.updateQuality(item);
            }
        }
    }
}
