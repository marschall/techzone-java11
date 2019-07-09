package com.github.marschall.techzone.java11;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Objects;

import org.junit.jupiter.api.Test;

/**
 * Tests showing the new methods on {@link Objects}.
 */
class ObjectsTests {

  @Test
  void requireNonNullElse() {
    assertEquals("default", Objects.requireNonNullElse(null, "default"));
    assertEquals("value", Objects.requireNonNullElse("value", "default"));
  }

  @Test
  void requireNonNullElseGet() {
    assertEquals("default", Objects.requireNonNullElseGet(null, () -> "default"));
    assertEquals("value", Objects.requireNonNullElseGet("value", () -> "default"));
  }
  
}