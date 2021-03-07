package ru.stqa.pft.sandox;

import org.testng.Assert;
import org.testng.annotations.Test;
import ru.stqa.pft.sandbox.Point;

public class PointTests {
  @Test
  public void TestArea(){

    Point p1 = new Point(4,0);
    Point p2 = new Point(10,10);
    Assert.assertEquals(p1.distance(p2),11.661903789690601);
  }
}
