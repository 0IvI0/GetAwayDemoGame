package model.figures;

public class Monster {

    private int x;
    private int y;
    private final int widthMonster = 250;
    private final int heightMonster = 700;
    private String imgURLmonster = "monster.png";


    public Monster(int x, int y) {
        this.x = x;
        this.y = y;
    }


    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getWidthMonster() {
        return widthMonster;
    }

    public int getHeightMonster() {
        return heightMonster;
    }

    public double getDrawPointOne() {
        return this.x - (this.widthMonster / 20);
    }

    public double getDrawPointTwo() {
        return this.y - (this.heightMonster / 70);
    }

    public String getImgURLmonster() {
        return imgURLmonster;
    }

}