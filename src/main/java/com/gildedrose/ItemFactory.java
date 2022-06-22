package com.gildedrose;

import java.util.HashMap;
import java.util.Map;

public class ItemFactory {

   public static final String AGED_BRIE = "Aged Brie";
   public static final String ETC_CONCERT = "Backstage passes to a TAFKAL80ETC concert";
   public static final String RAGNAROS = "Sulfuras, Hand of Ragnaros";

   static Map<String, ItemFunction> items = new HashMap<>();

   static {
      items.put(AGED_BRIE, AgedBrie::new);
      items.put(ETC_CONCERT, EtcConcert::new);
      items.put(RAGNAROS, Ragnaros::new);
   }

   // Switch Complexity O(n); complexity hashmap O(1)
   public static Item of(String name, int sellIn, int quality) {
      if (items.containsKey(name)) {
         return items.get(name).apply(name, sellIn, quality);
      }
      return new NormalItem(name, sellIn, quality);
   }
}
