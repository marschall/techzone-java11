package com.github.marschall.techzone.java11.lvti;

import java.io.BufferedReader;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class Guideline3 {
  
  public void original() throws IOException {
    ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
    
    BufferedReader reader = Files.newBufferedReader(Paths.get("/"));
    
    List<String> stringList = List.of("a", "b", "c");
  }
  
  public void good() throws IOException {
    var outputStream = new ByteArrayOutputStream();
    
    var reader = Files.newBufferedReader(Paths.get("/"));

    var stringList = List.of("a", "b", "c");
  }

}
