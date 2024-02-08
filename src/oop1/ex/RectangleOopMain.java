package oop1.ex;

public class RectangleOopMain {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        rectangle.width = 5;
        rectangle.height = 8;

        int area = rectangle.calcuaterArea();
        System.out.println("넓이:" + area);

        int perimter = rectangle.calculaterPerimter();
        System.out.println("둘레 길이:"+ perimter);

        boolean square = rectangle.iSquare();
        System.out.println("정사각형 여부:" + square);
    }
}
