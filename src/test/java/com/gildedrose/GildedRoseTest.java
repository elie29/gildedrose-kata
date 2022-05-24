package com.gildedrose;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class GildedRoseTest {

   @Test
   void testUpdateQuality() {
      Item[] items = new Item[] { new Item("foo", 0, 2) };
      GildedRose app = new GildedRose(items);
      app.updateQuality();
      assertThat(items[0].name).isEqualTo("foo");
   }

}
