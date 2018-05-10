package sample;

import javafx.fxml.FXML;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.Button;
import javafx.scene.paint.Color;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;


public class Controller {

    @FXML
    Canvas canvas = new Canvas();

    @FXML
    Button light = new Button();

    static GraphicsContext gc;
//    static Random rand = new Random();
//    static int rando = rand.nextInt(2);
    static int random = ThreadLocalRandom.current().nextInt(1, 3 + 1);
    static int x = 200, w = 100, h = 100;


    static void drawShape(GraphicsContext gc){
        gc.setFill(Color.WHITE);
        gc.setStroke(Color.BLACK);
        gc.setLineWidth(3);
        gc.fillRoundRect(150, 10,200, 400, 20, 20);
        gc.strokeRoundRect(150, 10,200, 400, 20, 20);

        gc.setFill(Color.LIGHTGRAY);
        for (int y = 35; y < 286; y = y + 125) {
            gc.fillOval(x, y, w, h);
            gc.strokeOval(x, y, w, h);
        }

    }


    public void color(){
        if (random == 1) {
            gc.setFill(Color.RED);
            gc.fillOval(x, 35, w, h);
            gc.strokeOval(x, 35, w, h);
        } else if (random == 2) {
            gc.setFill(Color.ORANGE);
            gc.fillOval(x, 160, w, h);
            gc.strokeOval(x, 160, w, h);
        } else if (random == 3) {
            gc.setFill(Color.GREEN);
            gc.fillOval(x, 285, w, h);
            gc.strokeOval(x, 285, w, h);
        }
    }

    public void initialize(){
        System.out.println("Hello there, General Kenobi.");
        gc = canvas.getGraphicsContext2D();
        drawShape(gc);
    }

}
