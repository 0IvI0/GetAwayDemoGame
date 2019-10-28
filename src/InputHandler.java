import javafx.scene.input.KeyCode;
import model.Model;

public class InputHandler {

    private Model model;


    public InputHandler(Model model) {
        this.model = model;
    }


    public void onKeyPressed(KeyCode key) {

        switch (key) {
            case UP:
                model.getHero().setMoveUp(true);
                break;
            case DOWN:
                model.getHero().setMoveDown(true);
                break;
            case LEFT:
                model.getHero().setMoveLeft(true);
                break;
            case RIGHT:
                model.getHero().setMoveRight(true);
                break;
            default:
                break;
        }
    }


    public void onKeyReleased(KeyCode key) {

        switch (key) {
            case UP:
                model.getHero().setMoveUp(false);
                break;
            case DOWN:
                model.getHero().setMoveDown(false);
                break;
            case LEFT:
                model.getHero().setMoveLeft(false);
                break;
            case RIGHT:
                model.getHero().setMoveRight(false);
                break;
            default:
                break;
        }
    }
}