package com.epsi.mycal;

public class Calculator {

  public int add(int valA, int valB) {
    return valA + valB;
  }

  public int sub(int valA, int valB) {
    return valA - valB;
  }

  public int mul(int valA, int valB) {
    return valA * valB;
  }

  public int div(int valA, int valB) {
    if (valB == 0 ) {
      System.out.println("[ERROR] - Division par 0 interdite");
      return -1;
    }
    return valA / valB;
  }
  
  public boolean checkPair(int valA) {
    int res = valA % 2;
    if (res > 0) {
      return true;
    } else {
      return false;
    }
  }
}