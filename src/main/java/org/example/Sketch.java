package org.example;

import processing.core.PApplet;

public class Sketch extends PApplet {

    public void settings(){
        size(500, 500);
    }

    public void draw(){
        ellipse(mouseX, mouseY, 50, 50);
    }
}
