package com.sarality.util.collect;

/**
 * Utility class to create Maps.
 *
 * @author abhideep@ (Abhideep Singh)
 */
public class Maps {

  static <K, V> MapBuilder<K, V> builder() {
    return new MapBuilder<>();
  }
}
