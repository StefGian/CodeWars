package javaapplication7;

import java.util.Random;

public class JavaApplication7 {

    public static class Ghost{
        String color;

        public String getColor() {
            return color;
        }

        public void setColor(String color) {
            this.color = color;
        }
        

        String[] lColors = {"White", "Yellow", "Purple"};
    
        public Ghost() {
            color = lColors[randInt(0, lColors.length - 1)];
        }        

        public int randInt(int min, int max) {
            Random rand = new Random();
            int randomNum = rand.nextInt((max - min) + 1) + min;
            return randomNum;
        }
    }

    public static void main(String[] args) {
        Ghost ghost = new Ghost();
        String ghostColor = ghost.getColor();
    }


}


