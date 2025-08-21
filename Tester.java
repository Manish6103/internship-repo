package com.ServiceRegistery;


class Rectangle {
    float length;
    float width;

    public double calculateArea(){
        double area= length*width;
        return Math.round(area*100.0)/100.0;
    }
    public double calculatePerimter(){
        double perimeter=2*(length+width);
        return Math.round(perimeter*100.0)/100.0;
    }
}

class Tester {

    public static void main(String args[]) {

        Rectangle rectangle=new Rectangle();
        rectangle.length=12f;
        rectangle.width=5f;
        rectangle.calculateArea();
        rectangle.calculatePerimter();

        //Display the area and perimeter using the lines given below
        System.out.println("Area of the rectangle is "+ rectangle.calculateArea());
        System.out.println("Perimeter of the rectangle is " + rectangle.calculatePerimter());
    }

}
