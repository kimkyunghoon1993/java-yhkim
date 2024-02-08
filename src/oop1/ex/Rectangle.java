package oop1.ex;

public class Rectangle {
    int width;
    int height;

    int calcuaterArea(){
        return  width * height;
    }

    int calculaterPerimter(){
        return  2 * (width + height);
    }

    boolean iSquare(){
        return width == height;
    }

}