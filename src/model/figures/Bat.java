package model.figures;

import java.util.Random;

public class Bat {

    private int x;
    private int y;
    private final int widthBat = 80;
    private final int heightBat = 80;
    private float speedX;
    private String imgURLbat = "bat.png";


    public Bat(int x, int y, float speedX) {
        this.x = x;
        this.y = y;
        this.speedX = speedX;
    }


    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getWidthBat() {
        return widthBat;
    }

    public int getHeightBat() {
        return heightBat;
    }

    public double getDrawPointOne() {
        return this.x + 1400;
    }

    public double getDrawPointTwo() {
        Random rand = new Random();
        this.y = rand.nextInt(500);
        return this.y;
    }

    public String getImgURLbat() {
        return imgURLbat;
    }

    public void setImgURLbat(String imgURLstone) {
        this.imgURLbat = imgURLstone;
    }


    public void setSpeedX(float speedX) {
        this.speedX = speedX;
    }


    public void update(long elapsedTime) {
        this.x = Math.round(this.x - elapsedTime * speedX);
    }

}