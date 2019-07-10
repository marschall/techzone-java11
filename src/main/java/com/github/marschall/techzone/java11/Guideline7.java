package com.github.marschall.techzone.java11;

public class Guideline7 {

  void original() {
    boolean ready = true;
    char ch = '\ufffd';
    long sum = 0L;
    String label = "wombat";
  }

  void good() {
    //   note   indentation
    var ready = true;
    var ch    = '\ufffd';
    var sum   = 0L;
    var label = "wombat";
  }

  void originalInts() {
    byte flags = 0;
    short mask = 0x7fff;
    long base = 17;
  }

  void dangerousInts() {
    // DANGEROUS: all infer as int
    var flags = 0;
    var mask = 0x7fff;
    var base = 17;
  }

}
