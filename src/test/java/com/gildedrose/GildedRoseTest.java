package com.gildedrose;

import org.approvaltests.combinations.CombinationApprovals;
import org.approvaltests.reporters.ClipboardReporter;
import org.approvaltests.reporters.UseReporter;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

@UseReporter(ClipboardReporter.class)
class GildedRoseTest {

   @Test
   void testUpdateQuality() {
      CombinationApprovals.verifyAllCombinations(
         this::doUpdate,
         new String[] { "foo", "Aged Brie", "Backstage passes to a TAFKAL80ETC concert", "Sulfuras, Hand of Ragnaros" },
         new Integer[] { -1, 0, 5, 6, 7, 10, 11, 12 },
         new Integer[] { -1, 0, 1, 2, 48, 49, 50, 51 }
      );
   }

   private String doUpdate(String name, int sellIn, int quality) {
      Item[] items = new Item[] { ItemFactory.of(name, sellIn, quality) };
      GildedRose app = new GildedRose(items);
      app.updateQuality();

      return Arrays.toString(items);
   }

}
