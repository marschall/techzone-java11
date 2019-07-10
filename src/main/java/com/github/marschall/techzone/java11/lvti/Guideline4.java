package com.github.marschall.techzone.java11.lvti;

import static java.util.stream.Collectors.counting;
import static java.util.stream.Collectors.groupingBy;

import java.util.List;
import java.util.Map;
import java.util.Optional;

// Naming Optional query methods
// https://blog.joda.org/2015/09/naming-optional-query-methods.html
public class Guideline4 {

  public Optional<String> findMostFrequentOld(List<String> strings) {
    return strings.stream()
        .collect(groupingBy(s -> s, counting()))
        .entrySet()
        .stream()
        .max(Map.Entry.comparingByValue())
        .map(Map.Entry::getKey);
  }

  public Optional<String> findMostFrequentBrokenUp(List<String> strings) {
    Map<String, Long> frequencyMap = strings.stream()
                                            .collect(groupingBy(s -> s, counting()));
    Optional<Map.Entry<String, Long>> maxEntryOptional = frequencyMap.entrySet()
                                                                     .stream()
                                                                     .max(Map.Entry.comparingByValue());
    return maxEntryOptional.map(Map.Entry::getKey);
  }
  
  public Optional<String> findMostFrequentGood(List<String> strings) {
    var frequencyMap = strings.stream()
                              .collect(groupingBy(s -> s, counting()));
    var maxEntryOptional = frequencyMap.entrySet()
                                       .stream()
                                       .max(Map.Entry.comparingByValue());
    return maxEntryOptional.map(Map.Entry::getKey);
  }

}
