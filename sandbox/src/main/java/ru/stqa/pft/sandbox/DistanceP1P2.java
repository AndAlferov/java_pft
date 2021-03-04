package ru.stqa.pft.sandbox;

public class DistanceP1P2 {

  public static void main(String[] args) {
    Point p1 = new Point(4,0);
    Point p2 = new Point(10,10);
    System.out.println("Расстояние между точками P1 и P2 = " +p1.distance(p2));
  }

}
