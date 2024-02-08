package oop1.ex;

public class RectangleProceduralMain {
    public static void main(String[] args) {
        int width = 5;
        int height = 8;
        int area = calcuaterArea(width,height);
        System.out.println("넓이:" + area);

        int perimter = calculaterPerimter(width,height);
        System.out.println("둘레 길이:"+ perimter);

        boolean square = iSquare(width,height);
        System.out.println("정사각형 여부:" + square);

    }

    static int calcuaterArea(int width, int height){
        return  width * height;
    }

    static  int calculaterPerimter(int width, int height){
        return  2 * (width + height);
    }

    static boolean iSquare(int width, int height){
        return width == height;
    }
}
