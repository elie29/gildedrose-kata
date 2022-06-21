package com.gildedrose;

class GildedRose {
   public static final String AGED_BRIE = "Aged Brie";
   public static final String ETC_CONCERT = "Backstage passes to a TAFKAL80ETC concert";
   public static final String RAGNAROS = "Sulfuras, Hand of Ragnaros";

   Item[] items;

   public GildedRose(Item[] items) {
      this.items = items;
   }

   public void updateQuality() {
      for (Item item : items) {
         if (item.name.equals(AGED_BRIE)) {
            if (item.quality < 50) {
               item.quality = item.quality + 1;
            }
         } else if (item.name.equals(ETC_CONCERT)) {
            if (item.quality < 50) {
               item.quality = item.quality + 1;

               if (item.sellIn < 11) {
                  if (item.quality < 50) {
                     item.quality = item.quality + 1;
                  }
               }

               if (item.sellIn < 6) {
                  if (item.quality < 50) {
                     item.quality = item.quality + 1;
                  }
               }
            }
         } else {
            if (item.quality > 0) {
               if (item.name.equals(RAGNAROS)) {
               } else {
                  item.quality = item.quality - 1;
               }
            }
         }

         if (item.name.equals(RAGNAROS)) {
         } else {
            item.sellIn = item.sellIn - 1;
         }

         if (item.sellIn < 0) {
            if (item.name.equals(AGED_BRIE)) {
               if (item.quality < 50) {
                  item.quality = item.quality + 1;
               }
            } else {
               if (item.name.equals(ETC_CONCERT)) {
                  item.quality = 0;
               } else {
                  if (item.quality > 0) {
                     if (item.name.equals(RAGNAROS)) {
                        continue;
                     }
                     item.quality = item.quality - 1;
                  }
               }
            }
         }
      }
   }
}
