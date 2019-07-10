package com.github.marschall.techzone.java11;

import java.util.ArrayList;

public class Guideline2 {

  private static final Item MUST_BE_PROCESSED_LAST = new Item();

  public void good() {
    var items = new ArrayList<Item>();
    items.add(MUST_BE_PROCESSED_LAST);
    for (var item : items) {
      // 
    }
  }

  public void bad() {
    var items = new ArrayList<Item>();
    // var items = new HashSet<Item>();

    // a lot of code

    // and other things

    // and more

    // and more things

    // that fill

    // probably more

    // and a page

    // so

    // at one point

    // you lose track

    // of what

    // items is

    // so it may be hard

    // to see


    // the impact


    // of a change


    // there may

    // be  a lot

    // of lines of

    // code here

    items.add(MUST_BE_PROCESSED_LAST);
    for (var item : items) {
      // 
    }
  }

}
