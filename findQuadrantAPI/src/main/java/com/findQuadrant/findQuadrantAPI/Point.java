package com.findQuadrant.findQuadrantAPI;

import org.springframework.web.bind.annotation.*;

public class Point {
    int x;
    int y;

    public Point(int x, int y ){
        this.x = x;
        this.y = y;
    }

    public String findQuad() {
        if (x > 0 & y > 0) {
            return "I Quadrant";
        }
        if (x < 0 & y > 0) {
            return "II Quadrant";
        }
        if (x < 0 & y < 0) {
            return "III Quadrant";
        }
        if (x > 0 & y < 0) {
            return "IV Quadrant";
        }
        return "NOT FOUND";
    }

}


@RestController
class Points{

    @GetMapping("/point")
    @ResponseBody
    public String callMethod(@RequestParam int x, @RequestParam int y){

        Point xy = new Point(x, y);

        return "The point is located in the: " + xy.findQuad();

    }


}
