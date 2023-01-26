package com.gildedrose;

class GildedRose {
    Item[] items;

    public GildedRose(Item[] items) {
        this.items = items;
    }

    public void updateQuality() {
        for (int i = 0; i < items.length; i++) {
            // If item name equals to Aged Brie or Backstage passes and quantity < 50 quantity will increase
            if (items[i].name.equals("Aged Brie")
                || items[i].name.equals("Backstage passes to a TAFKAL80ETC concert")) {
                if (items[i].quality < 50) {
                    items[i].quality = items[i].quality + 1;
                    if (items[i].name.equals("Backstage passes to a TAFKAL80ETC concert")) {
                        // If item name equals to Backstage passes and quantity < 50 and sellIn < 11 quantity will increase again
                        if (items[i].sellIn < 11) {
                            if (items[i].quality < 50) {
                                items[i].quality = items[i].quality + 1;
                            }
                        }
                        // If item name equals to Backstage passes and quantity < 50 and sellIn < 6 quantity will increase again
                        if (items[i].sellIn < 6) {
                            if (items[i].quality < 50) {
                                items[i].quality = items[i].quality + 1;
                            }
                        }
                    }
                }
            } else {
                if (items[i].quality > 0) {
                    // if item name equals to sulfuras nothing happens
                    if (items[i].name.equals("Sulfuras, Hand of Ragnaros")) {
                    } else {
                        // if quantity is positive it decreases by 1
                        items[i].quality = items[i].quality - 1;
                    }
                }
            }
            // if item name equals to sulfuras nothing happens
            if (items[i].name.equals("Sulfuras, Hand of Ragnaros")) {
            } else {
                // sellIn decreases by 1
                items[i].sellIn = items[i].sellIn - 1;
            }

            if (items[i].sellIn < 0) {
                // if sellIn is negative, quantity < 50 and item name equals to Aged Brie quantity increase again
                if (items[i].name.equals("Aged Brie")) {
                    if (items[i].quality < 50) {
                        items[i].quality = items[i].quality + 1;
                    }
                } else {
                    // if sellIn is negative and item name equals to Backstage passes quantity increase again
                    if (items[i].name.equals("Backstage passes to a TAFKAL80ETC concert")) {
                        items[i].quality = items[i].quality - items[i].quality;
                    } else {
                        if (items[i].quality > 0) {
                            if (items[i].name.equals("Sulfuras, Hand of Ragnaros")) {
                                continue;
                            }
                            // if sellIn is negative, quality is positive and item name is not equal to Sulfuras quantity decreases again
                            items[i].quality = items[i].quality - 1;
                        }
                    }
                }
            }
        }
    }
}
