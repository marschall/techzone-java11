package com.github.marschall.techzone.java11;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.contains;
import static org.hamcrest.Matchers.containsInAnyOrder;
import static org.hamcrest.Matchers.empty;
import static org.hamcrest.Matchers.hasEntry;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.util.List;
import java.util.Map;
import java.util.Set;

import org.junit.jupiter.api.Test;

/**
 * Tests showing the new collection factory methods.
 */
class CollectionsTests {

  @Test
  void setOf() {
    assertThat(Set.of(1, 2, 3), containsInAnyOrder(1, 2, 3));
    assertThrows(UnsupportedOperationException.class, () -> Set.of(1).add(2));
  }

  @Test
  void listOf() {
    assertThat(List.of(1, 2, 3), contains(1, 2, 3));
  }

  @Test
  void listOfOne() {
    assertThat(List.of(1), contains(1));
    assertThrows(UnsupportedOperationException.class, () -> List.of(1).add(2));
  }
  
  @Test
  void listOfEmpty() {
    assertThat(List.of(), empty());
  }

  @Test
  void listOfArray() {
    Integer[] array = {1, 2, 3};
    assertThat(List.of(array), contains(1, 2, 3));
  }

  @Test
  void listOfNull() {
    assertThrows(NullPointerException.class, () -> List.of(1, null));
  }

  @Test
  void mapOf() {
    assertThat(Map.of(1, 'A', 2, 'B'), hasEntry(1, 'A'));
    assertThrows(UnsupportedOperationException.class, () -> Map.of(1, 'A').put(2, 'B'));
  }

  @Test
  void mapOfEntries() {
    assertThat(Map.ofEntries(Map.entry(1, 'A'), Map.entry(2, 'B')), hasEntry(1, 'A'));
    assertThrows(UnsupportedOperationException.class, () -> Map.ofEntries(Map.entry(1, 'A')).put(2, 'B'));
  }
}
