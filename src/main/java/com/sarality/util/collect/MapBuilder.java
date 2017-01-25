package com.sarality.util.collect;

import java.util.HashMap;
import java.util.Map;

/**
 * A Builder for a Map
 *
 * @author abhideep@ (Abhideep Singh)
 */
public class MapBuilder<K, V> {
  private final Map<K, V> builderMap = new HashMap<>();

  MapBuilder() {
  }

  public void put(K key, V value) {
    builderMap.put(key, value);
  }

  public Map<K,V> build() {
    Map<K, V> map = new HashMap<>();
    map.putAll(builderMap);
    return map;
  }
}
