package com.epsi.mycal;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class CalculatorTest {

  @Before
  public void setUp() throws Exception {
  }

  @After
  public void tearDown() throws Exception {
  }

  @Test
  public void testAdd() {
    int a = 2;
    int b = 3;

    Calculator calc = new Calculator();
    int actual = calc.add(a, b);

    assertEquals(5, actual);
  }

  @Test
  public void testSub() {
    int a = 4;
    int b = 2;

    Calculator calc = new Calculator();
    int actual = calc.sub(a, b);

    assertEquals(2, actual);
  }

  @Test
  public void testMul() {
    int a = 4;
    int b = 3;

    Calculator calc = new Calculator();
    int actual = calc.mul(a, b);

    assertEquals(12, actual);
  }

  @Test
  public void testDiv() {
    int a = 4;
    int b = 2;
    int c = 0;

    Calculator calc = new Calculator();
    int actual = calc.div(a, b);
    int err = calc.div(a,c);
    
    assertEquals(2, actual);
    assertEquals(-1, err);
  }
  
  @Test
  public void testCheckPair() {
    int a = 4;
    int b = 3;

    Calculator calc = new Calculator();
    assertTrue(calc.checkPair(a));
    assertFalse(calc.checkPair(b));
  }

}
