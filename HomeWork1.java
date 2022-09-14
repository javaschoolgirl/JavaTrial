/**
* Java Basic. Home work #1
*
*@author Marina Bergen
*
*@version 13.09.2022
*
*/
// #1
class HomeWork1 {
    public static void main(String[] args) {
        int rectangleLength = 8;
        int rectangleWidth = 6;
        int areaOfaRectangle = rectangleLength * rectangleWidth;
        System.out.println("Area Of a Rectangle =" + areaOfaRectangle);
        int rectanglePerimeter = rectangleLength + rectangleWidth * 2;
        System.out.println("Rectangle Perimeter =" + rectanglePerimeter);
// #2
        int a = 5;
        System.out.println("a =" + a);
        int b = 3;
        System.out.println("b =" + b);
        int c = a + b;
        System.out.println("c =" + c);
        int d = a - b;
        System.out.println("d =" + d);
        int e = a * b;
        System.out.println("e =" + e);
        float x = 5 / 3f;
        System.out.println("x =" + x);
// #3
        int[] array = new int[5];
        array[0] = 4;
        System.out.println(array[0]);
        array[1] = 8;
        System.out.println(array[1]);
        array[2] = 10;
        System.out.println(array[2]);
        array[3] = 12;
        System.out.println(array[3]);
        array[4] = 14;
        System.out.println(array[4]);
    }
} 