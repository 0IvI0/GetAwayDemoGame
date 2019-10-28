package model;

import model.figures.Hero;
import model.figures.Monster;
import model.figures.Bat;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;


public class Model {

    public static final int WIDTH = 1400;
    public static final int HEIGHT = 700;

    private String imgURLGameOver = "emptyImage.png";
    private static double faktor2 = 1;
    private static int level = 1;
    private Hero hero;
    private Monster monster;
    private static List<Bat> bats = new LinkedList<Bat>();


    public Model() {
        generateBats();
        this.hero = new Hero(350, HEIGHT / 2);
        this.monster = new Monster(10, 10);
    }



    public static void generateBats() {
        Random random = new Random();

        for (int i = 0; i < 30; i++) {
            int y = random.nextInt(50) + 1;
            float speed = (float) ((random.nextFloat() / 100 * 250) + 0.1f);
            bats.add(new Bat(1400, y, speed));
         faktor2 *= 1.05;}
    }


    public Hero getHero() {
        return this.hero;
    }

    public Monster getMonster() {
        return this.monster;
    }

    public List<Bat> getBats() {
        return bats;
    }

    public static int getLevel() {
        return level;
    }

    public static void setLevel(int level) {
        Model.level = level;
    }

    public String getImgURLGameOver() {
        return imgURLGameOver;
    }



    public void update(long elapsedTime) {

        for (Bat bat : bats) {

            Collision.batCollision(bat, hero);
            Collision.borderCollision(hero);
            bat.update(elapsedTime);
        }

        Collision.monsterCollision(monster, hero);

        if (!(hero.getLife() == 0)) {
            hero.setAlive(true);
        }

        if (hero.isAlive() == true) {
        }

        if (hero.getLife() == 0){
                hero.setAlive(false);
                hero.setCanMove();
        }

        if (hero.isAlive() == false) {
            imgURLGameOver = "gameover.png";
        }

        hero.update(elapsedTime);
    }
}
