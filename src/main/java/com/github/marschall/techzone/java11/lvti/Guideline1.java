package com.github.marschall.techzone.java11.lvti;

import java.util.List;

import com.github.marschall.techzone.java11.lvti.stubs.Customer;
import com.github.marschall.techzone.java11.lvti.stubs.DbConnection;

public class Guideline1 {
  
  private DbConnection dbConnection;

  public List<Customer> original(String query) {
    List<Customer> x = dbConnection.executeQuery(query);
    
    return x;
  }
  
  public List<Customer> good(String query) {
    // variable renamed to a better name
    var customerList = dbConnection.executeQuery(query);
    
    return customerList;
  }
  
  public List<Customer> mayAlsoBeOk(String query) {
    var customers = dbConnection.executeQuery(query);
    
    return customers;
  }

}
