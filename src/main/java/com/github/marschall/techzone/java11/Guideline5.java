package com.github.marschall.techzone.java11;

import java.util.ArrayList;
import java.util.List;

public class Guideline5 {

  public void original() {
    List<String> list = new ArrayList<>();
  }

  public void good() {
    // Inferred type of list is ArrayList<String>.
    var list = new ArrayList<String>();
  }

}
