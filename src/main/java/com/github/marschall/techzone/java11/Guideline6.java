package com.github.marschall.techzone.java11;

import java.math.BigInteger;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;

public class Guideline6 {

  public void original() {
    PriorityQueue<Item> itemQueue = new PriorityQueue<Item>();
  }

  public void ok() {
    // OK: both declare variables of type PriorityQueue<Item>
    PriorityQueue<Item> itemQueue1 = new PriorityQueue<>();
    var itemQueue2 = new PriorityQueue<Item>();

    // OK: itemQueue infers as PriorityQueue<String>
    Comparator<String> compareToIgnoreCase = String::compareToIgnoreCase;
    var stringItemQueue = new PriorityQueue<>(compareToIgnoreCase);

    // OK: infers as List<BigInteger>
    var list = List.of(BigInteger.ZERO);
  }

  public void dangerous() {
    // DANGEROUS: infers as PriorityQueue<Object>
    var itemQueue = new PriorityQueue<>();
    
    // DANGEROUS: infers as List<Object>
    var list = List.of();
  }

}
