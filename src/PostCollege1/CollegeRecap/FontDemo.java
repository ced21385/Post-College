package PostCollege1.CollegeRecap;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Rectangle;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;

public class FontDemo extends Application {

   // public static void main(String[] args) {Application.launch(args);}

    @Override
    public void start(Stage primaryStage){

        Pane pane = new StackPane();

        Rectangle rectangle = new Rectangle();
        rectangle.setHeight(100);
        rectangle.setWidth(250);
        rectangle.setStroke(Color.SNOW);

        pane.getChildren().add(rectangle);

        Label label = new Label("JavaFx");
        label.setFont(Font.font("Arial Black", FontWeight.BOLD, FontPosture.REGULAR,50));

        pane.getChildren().add(label);

        Scene scene = new Scene(pane);
        primaryStage.setTitle("FontDemo");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
