package com.thoughtworks.rectangle;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PolygonTest {

    @Test
    void shouldReturnValidAreaForRectangle() {
        Polygon rectangle1 = Polygon.rectangle(0, 0);
        Polygon rectangle2 = Polygon.rectangle(19, 0);
        Polygon rectangle3 = Polygon.rectangle(0, 17.34);
        Polygon rectangle4 = Polygon.rectangle(19.73, 17.34);

        double area1 = rectangle1.area();
        double area2 = rectangle2.area();
        double area3 = rectangle3.area();
        double area4 = rectangle4.area();

        assertEquals(0, area1, 0.0000001);
        assertEquals(0, area2, 0.0000001);
        assertEquals(0, area3, 0.0000001);
        assertEquals(19.73 * 17.34, area4, 0.0000001);
    }

    @Test
    void shouldReturnValidPerimeterForRectangle() {
        Polygon rectangle1 = Polygon.rectangle(11.2, 0);
        Polygon rectangle2 = Polygon.rectangle(11.2, 19.3);

        double perimeter1 = rectangle1.perimeter();
        double perimeter2 = rectangle2.perimeter();
        double expectedPerimeterForRectangle1 = 11.2 * 2;
        double expectedPerimeterForRectangle2 = 61;

        assertEquals(expectedPerimeterForRectangle1, perimeter1);
        assertEquals(expectedPerimeterForRectangle2, perimeter2);
    }

    @Test
    void shouldReturnValidAreaForSquares() {
        Polygon square1 = Polygon.square(0.0);
        Polygon square2 = Polygon.square(1.0);
        Polygon square3 = Polygon.square(17.34);

        double area1 = square1.area();
        double area2 = square2.area();
        double area3 = square3.area();
        double expectedAreaForSquare1 = 0;
        double expectedAreaForSquare2 = 1;
        double expectedAreaForSquare3 = 17.34 * 17.34;

        assertEquals(expectedAreaForSquare1, area1, 0.0000001);
        assertEquals(expectedAreaForSquare2, area2, 0.0000001);
        assertEquals(expectedAreaForSquare3, area3, 0.0000001);
    }

    @Test
    void shouldReturnValidPerimeterForSquares() {
        Polygon square1 = Polygon.square(0);
        Polygon square2 = Polygon.square(1);
        Polygon square3 = Polygon.square(19.3);

        double perimeter1 = square1.perimeter();
        double perimeter2 = square2.perimeter();
        double perimeter3 = square3.perimeter();
        double expectedPerimeterForSquare1 = 0;
        double expectedPerimeterForSquare2 = 4;
        double expectedPerimeterForSquare3 = 19.3 * 4;

        assertEquals(expectedPerimeterForSquare1, perimeter1);
        assertEquals(expectedPerimeterForSquare2, perimeter2);
        assertEquals(expectedPerimeterForSquare3, perimeter3);
    }

}
