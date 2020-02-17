package com.findQuadrant.findQuadrantAPI;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PointTest {

    @Test
    public void testIQuad(){
        Point xy = new Point(5, 5);

        assertEquals("I Quadrant", xy.findQuad());
    }

    @Test
    public void testIIQuad(){
        Point xy = new Point(-5, 5);

        assertEquals("II Quadrant", xy.findQuad());
    }

    @Test
    public void testIIIQuad(){
        Point xy = new Point(-5, -5);

        assertEquals("III Quadrant", xy.findQuad());
    }

    @Test
    public void testIVQuad(){
        Point xy = new Point(5, -5);

        assertEquals("IV Quadrant", xy.findQuad());
    }

    @Test
    public void testNotFound(){
        Point xy = new Point(0, 0);

        assertEquals("NOT FOUND", xy.findQuad());
    }
}