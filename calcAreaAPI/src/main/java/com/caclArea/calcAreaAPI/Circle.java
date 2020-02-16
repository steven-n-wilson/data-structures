package com.caclArea.calcAreaAPI;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

public class Circle {
    int radius;

    public Circle(int radius){
        this.radius = radius;
    }

    public double getRadius(){
        return radius;
    }

    public double getArea(){
        double area = (Math.PI * (Math.pow(radius,2)));
        return area;
    }

    public static void main(String[] args){
        Circle xyz = new Circle(5);

        System.out.println("The area of the circle is: " + xyz.getArea());
    }
}
