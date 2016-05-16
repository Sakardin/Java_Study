package ru.stqa.pft.sandbox;

import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created by ds on 16.5.16.
 */
public class EquationTest {

    @Test
    public  void test() {
        Equation c = new Equation(1, 1, 1);
        Assert.assertEquals(c.rootNumber(), 0);
    }
    @Test
    public  void test1() {
        Equation c = new Equation(1, 2, 1);
        Assert.assertEquals(c.rootNumber(), 1);
    }
    @Test
    public  void test2() {
        Equation c = new Equation(1, 5, 6);
        Assert.assertEquals(c.rootNumber(), 2);
    }
    @Test
    public  void testLinear() {
        Equation c = new Equation(0, 1, 1);
        Assert.assertEquals(c.rootNumber(), 1);
    }
    @Test
    public  void testConstant() {
        Equation c = new Equation(0, 0, 6);
        Assert.assertEquals(c.rootNumber(), 0);
    }
    @Test
    public  void testZero() {
        Equation c = new Equation(0, 0, 0);
        Assert.assertEquals(c.rootNumber(), -1);
    }
}
