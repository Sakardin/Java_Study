package ru.stqa.pft.sandbox;

import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created by ds on 12.5.16.
 */
public class SquareTest {

  @Test

  public void testArea(){
    Square s = new Square(5);
    Assert.assertEquals(s.area(), 25.0);

  }
}
