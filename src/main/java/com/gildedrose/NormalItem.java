package com.gildedrose;

public class NormalItem extends Item {

   public NormalItem(String name, int sellIn, int quality) {
      super(name, sellIn, quality);
   }

   @Override
   public void updateQuality() {
      if (quality > 0) {
         quality = quality - 1;
      }
      sellIn = sellIn - 1;
      if (sellIn < 0) {
         if (quality > 0) {
            quality = quality - 1;
         }
      }
   }
}
