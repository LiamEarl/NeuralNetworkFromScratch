package Network;

import processing.core.PApplet;

public class Main extends PApplet {

    public void settings() {
        size(1000, 1000);
    }

    public void setup() {
        noStroke();
        textAlign(CORNER, CENTER);
        frameRate(100000);
    }

    public void draw() {
        background(0, 0, 0);
        fill(255, 255, 255);
        textSize(50);
        text("DISPLAY TEST", 100, 100);
    }

    public static void main(String[] args) {
        String[] appletArgs = new String[] {Main.class.getName()};
        PApplet.main(appletArgs);
    }

}
