package com.github.marschall.techzone.java11.lvti;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;
import java.io.StringWriter;

class InputStreamTransferTo {
  
  static byte[] toByteArray(InputStream inputStream) throws IOException {
    var outputStream = new ByteArrayOutputStream();
    inputStream.transferTo(outputStream);
    return outputStream.toByteArray();
  }
  
  static String toString(Reader reader) throws IOException {
    var writer = new StringWriter();
    reader.transferTo(writer);
    return writer.toString();
  }

}
