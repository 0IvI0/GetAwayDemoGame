package model.figures;

public class Hero {

    private int x;
    private int y;
    private final int widthHero = 40;
    private final int heigthHero = 40;
    private String imgURLhero = "hero.png";
    private boolean isAlive = true;
    private int score = 0;
    private int life = 3;
    private boolean moveUp;
    private boolean moveDown;
    private boolean moveLeft;
    private boolean moveRight;
    private boolean notMoving;
    private boolean canMove = true;


    public Hero(int x, int y) {
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

    public double getDrawPointOne() {
        return this.x-(this.widthHero / 2);
    }

    public double getDrawPointTwo() {
        return this.y - (this.heigthHero / 2);
    }

    public void setMoveUp(boolean moveUp) {
        this.moveUp = moveUp;
    }

    public void setMoveDown(boolean moveDown) {
        this.moveDown = moveDown;
    }

    public void setMoveLeft(boolean moveLeft) {
        this.moveLeft = moveLeft;
    }

    public void setMoveRight(boolean moveRight) {
        this.moveRight = moveRight;
    }

    public int getWidthHero() {
        return widthHero;
    }

    public int getHeigthHero() {
        return heigthHero;
    }

    public String getImgURLhero() {
        return imgURLhero;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public boolean isAlive() {
        return isAlive;
    }

    public void setAlive(boolean isAlive) {
        this.isAlive = isAlive;
    }

    public void setCanMove() {
        this.canMove = false;
    }

    public int getLife() {
        return life;
    }

    public void setLife(int life) {
        this.life = life;
    }




    public boolean isMoveUp() {
        return moveUp;
    }

    public boolean isMoveDown() {
        return moveDown;
    }

    public boolean isMoveLeft() {
        return moveLeft;
    }

    public boolean isMoveRight() {
        return moveRight;
    }

    public boolean isNotMoving() {
        notMoving = (!this.isMoveUp() && !this.isMoveDown() && !this.isMoveLeft() && !this.isMoveRight());
        return notMoving;
    }


    public void update(long elapsedTime) {
        if (canMove) {
            float speedOFMoving = Math.round(elapsedTime / 4);
            if (moveUp && !moveDown) {
                this.y -= speedOFMoving;
            }
            if (moveDown && !moveUp) {
                this.y += speedOFMoving;
            }
            if (moveLeft && !moveRight) {
                this.x -= speedOFMoving;
            }
            if (moveRight && !moveLeft) {
                this.x += speedOFMoving;
            }
        }
    }
}