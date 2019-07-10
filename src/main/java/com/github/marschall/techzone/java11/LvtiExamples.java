package com.github.marschall.techzone.java11;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.Socket;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class LvtiExamples {

  void removeMatchesOriginal(Map<? extends String, ? extends Number> map, int max) {
    for (Iterator<? extends Map.Entry<? extends String, ? extends Number>> iterator =
        map.entrySet().iterator(); iterator.hasNext();) {
      Map.Entry<? extends String, ? extends Number> entry = iterator.next();
      if (max > 0 && matches(entry)) {
        iterator.remove();
        max--;
      }
    }
  }

  void removeGood(Map<? extends String, ? extends Number> map, int max) {
    for (var iterator = map.entrySet().iterator(); iterator.hasNext();) {
      var entry = iterator.next();
      if (max > 0 && matches(entry)) {
        iterator.remove();
        max--;
      }
    }
  }

  String readOriginal(Socket socket, String charsetName) throws IOException {
    try (InputStream is = socket.getInputStream();
        InputStreamReader isr = new InputStreamReader(is, charsetName);
        BufferedReader buf = new BufferedReader(isr)) {
      return buf.readLine();
    }
  }
  
  String readGood(Socket socket, String charsetName) throws IOException {
    // variables renamed and indentation
    try (var inputStream = socket.getInputStream();
         var reader = new InputStreamReader(inputStream, charsetName);
         var bufReader = new BufferedReader(reader)) {
       return bufReader.readLine();
   }
  }

  private boolean matches(Entry<? extends String, ? extends Number> entry) {
    return false;
  }

}
