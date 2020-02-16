package com.caclArea.calcAreaAPI;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Main {

    public static  void main(String args[]){
        Rectangle small;
        small = new Rectangle();

        int smallArea = small.calcRectangleArea(2,2);
        System.out.println("The area of the rectangle is: "+ smallArea );

        Triangle abc;
        abc = new Triangle();

        int abcArea = abc.calcTriangleArea(5,5);
        System.out.println("The area of the triangle is: "+ abcArea );


    }
}

class Rectangle{

    @GetMapping("/Rectangle")
    @ResponseBody
    int calcRectangleArea(int base, int height)
    {
        int area = (base*height);
        return area;
    }

}

class Triangle{

    int calcTriangleArea(int base, int height)
    {
        int area = (base*height)/2;
        return area;
    }

}



