package com.gildedrose;

@FunctionalInterface
public interface ItemFunction {

   Item apply(String name, int sellIn, int quality);
}
