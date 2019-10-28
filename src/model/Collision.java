package model;

import model.figures.Hero;
import model.figures.Monster;
import model.figures.Bat;

public class Collision {

    public Collision() {

    }

    public static void borderCollision(Hero hero) {

        if (hero.getX() - 15 < 0) {
            hero.setX(25);
        }
        else if (hero.getX() > Model.WIDTH - 15) {
            hero.setX(Model.WIDTH - 25);
        }
        else if (hero.getY() - 15 < 0) {
            hero.setY(25);
        }
        else if (hero.getY() > Model.HEIGHT - 15) {
            hero.setY(Model.HEIGHT - 25);
        }
    }


    public static void monsterCollision(Monster monster, Hero hero) {
        if (hero.getX() <= 250) {
            hero.setAlive(false);
            hero.setLife(0);
            hero.setX(0);
            hero.setY(0);
            hero.setCanMove();
        }
    }


    public static void batCollision(Bat bat, Hero hero) {
        if (Math.abs(hero.getDrawPointTwo() - bat.getDrawPointTwo()) < 40 && Math.abs((hero.getDrawPointOne() - 10) - bat.getDrawPointOne()) < 35) {
            hero.setAlive(true);
            hero.setX(hero.getX() - 50);
        }
    }
}
