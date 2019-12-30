package PostCollege1.CollegeRecap;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.BorderPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

public class ControlCircle extends Application{
    private CirclePane circlePane = new CirclePane();
    @Override
    public void start(Stage primaryStage){
        HBox hBox = new HBox();
        hBox.setSpacing(10);
        hBox.setAlignment(Pos.CENTER);

        Button enlarge = new Button("Enlarge");
        Button shrink = new Button("Shrink");

        hBox.getChildren().add(enlarge);
        hBox.getChildren().add(shrink);

        enlarge.setOnAction(new EnlargeHandler());
        shrink.setOnAction(new ShrinkHandler());

        BorderPane border = new BorderPane();
        border.setCenter(circlePane);
        border.setBottom(hBox);
        BorderPane.setAlignment(hBox,Pos.CENTER);

        Scene scene = new Scene(border,200,150);
        primaryStage.setTitle("Control Circle");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    class EnlargeHandler implements EventHandler<ActionEvent> {
        @Override
        public void handle(ActionEvent e){
            circlePane.enlarge();
        }
    }
    class ShrinkHandler implements EventHandler<ActionEvent> {
        @Override
        public void handle(ActionEvent e){
            circlePane.shrink();
        }
    }
}
class CirclePane extends StackPane{
    private Circle circle = new Circle(50);

    public CirclePane(){
        getChildren().add(circle);
        circle.setStroke(Color.BLACK);
        circle.setFill(Color.WHITE);
    }
    public void enlarge(){
        circle.setRadius(circle.getRadius() + 2);
    }
    public void shrink(){
        circle.setRadius(circle.getRadius() > 2 ? circle.getRadius() - 2 : circle.getRadius());
    }
}
