package com.company;

public class Main {

    public static void main(String[] args) {
        Shape[] shapes = new Shape[11];
        shapes[0] = new Rectangle("GREEN",3,6);
        shapes[1] = new Circle("ORANGE",10);
        shapes[2] = new Circle("RED",2);
        shapes[3] = new Rectangle("BLUE",10,33);
        shapes[4] = new Triangle("MAGENTA",9,6, 3);
        shapes[5] = new Rectangle("BROWN",2,7.9);
        shapes[6] = new Circle("YELLOW",6.7);
        shapes[7] = new Triangle("BLACK",3.6,11.5, 7.3);
        shapes[8] = new Triangle("VIOLET",2.1,5.67, 8.9);
        shapes[9] = new Rectangle("WHITE",33,345.6);
        shapes[10] = new Circle("PINK",8.9);

        double areaSum = 0;
        for(Shape i : shapes){
            i.draw();
            if (i.calcArea() > 0)
                areaSum += i.calcArea();
        }
        System.out.println("Summarized area = " + areaSum);
    }
}
