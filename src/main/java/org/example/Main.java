package org.example;

import processing.core.PApplet;

public class Main {
    public static void main(String[] args) {
        String[] processingArgs = {"Sketch"};
        Sketch sketch = new Sketch();
        PApplet.runSketch(processingArgs, sketch);
    }

}