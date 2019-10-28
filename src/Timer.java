import javafx.animation.AnimationTimer;
import model.Model;

public class Timer extends AnimationTimer {

    private Model model;
    private Graphics graphics;
    private long previousTime = -1;


    public Timer(Model model, Graphics graphics) {
        this.model = model;
        this.graphics = graphics;
    }


    @Override
    public void handle(long nowNano) {
        long nowMillis = nowNano / 1000000;

        long elapsedTime;
        if (previousTime == -1) {
            elapsedTime = 0;
        } else {
            elapsedTime = nowMillis - previousTime;
        }
        previousTime = nowMillis;
        model.update(elapsedTime);
        graphics.draw();
    }
}