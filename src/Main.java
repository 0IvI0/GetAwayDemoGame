import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.input.KeyEvent;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import model.Model;

public class Main extends Application {

    private Timer timer;

    @Override
    public void start(Stage primaryStage) throws Exception {

        Group root = new Group();
        Scene scene = new Scene(root);
        primaryStage.setScene(scene);
        scene.setFill(Color.web("#222222"));

        Canvas canvas = new Canvas(Model.WIDTH, Model.HEIGHT);
        root.getChildren().add(canvas);

        primaryStage.setTitle("GetAway!");
        primaryStage.setResizable(false);
        primaryStage.show();

        GraphicsContext gc = canvas.getGraphicsContext2D();

        Model model = new Model();
        Graphics graphics = new Graphics(model, gc);

        timer = new Timer(model, graphics);
        timer.start();

        InputHandler inputHandler = new InputHandler(model);
        scene.setOnKeyPressed(new EventHandler<KeyEvent>() {
            @Override
            public void handle(KeyEvent keyEvent) {
                inputHandler.onKeyPressed(keyEvent.getCode());
            }
        });
        scene.setOnKeyReleased(new EventHandler<KeyEvent>() {
            @Override
            public void handle(KeyEvent keyEvent) {
                inputHandler.onKeyReleased(keyEvent.getCode());
            }
        });
    }

        @Override
        public void stop() throws Exception {
            timer.stop();
            super.stop();
        }


    public static void main(String[] args) {
        launch(args);
    }
}
