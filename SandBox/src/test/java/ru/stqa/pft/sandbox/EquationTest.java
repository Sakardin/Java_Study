package ru.stqa.pft.sandbox;

import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created by ds on 16.5.16.
 */
public class EquationTest {

    @Test
    public  void testEquation() {
        Equation c = new Equation(1, 1, 1);
        Assert.assertEquals(c.rootNumber(), 0);
    }
    @Test
    public  void testEquation1() {
        Equation c = new Equation(1, 2, 1);
        Assert.assertEquals(c.rootNumber(), 1);
    }
    @Test
    public  void testEquation2() {
        Equation c = new Equation(1, 5, 6);
        Assert.assertEquals(c.rootNumber(), 2);
    }
}
