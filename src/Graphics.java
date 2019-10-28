import javafx.scene.canvas.GraphicsContext;
import javafx.scene.image.Image;
import model.Model;
import model.figures.Bat;

public class Graphics {

    private Model model;
    private GraphicsContext gc;
    private Image imgHero;
    private Image imgMonster;
    private Image imgBat;
    private Image imgGameOver;


    public Graphics(Model model, GraphicsContext gc) {
        this.model = model;
        this.gc = gc;
    }


    public void draw() {

        gc.clearRect(0, 0, Model.WIDTH, Model.HEIGHT);

        imgHero = new Image(model.getHero().getImgURLhero());
        gc.drawImage(imgHero, model.getHero().getDrawPointOne(), model.getHero().getDrawPointTwo(), model.getHero().getWidthHero(), model.getHero().getHeigthHero());

        imgBat = new Image("bat.png");
        for (Bat bat : this.model.getBats()) {
            gc.drawImage(imgBat, bat.getDrawPointOne(), bat.getDrawPointTwo(), bat.getWidthBat(), bat.getHeightBat());
        }

        imgMonster = new Image(model.getMonster().getImgURLmonster());
        gc.drawImage(imgMonster, model.getMonster().getDrawPointOne(), model.getMonster().getDrawPointTwo(), model.getMonster().getWidthMonster(), model.getMonster().getHeightMonster());

        imgGameOver = new Image(model.getImgURLGameOver());
        gc.drawImage(imgGameOver, 0, 0, 1400, 700);
    }
}
