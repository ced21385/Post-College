package PostCollege1.CollegeRecap;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class CheckerBoard extends Application{
    @Override
    public void start(Stage primaryStage){

        GridPane pane = new GridPane();
        Boolean black = false;

        for(int i = 0;i < 8;i++){
            for(int j = 0; j < 8;j++){
               Rectangle rectangle = new Rectangle(50,50,(black) ? Color.BLACK : Color.WHITE);
               pane.add(rectangle,j,i);
               black = !black;
            }
            black = !black;
        }
        Scene scene = new Scene(pane,400,400);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Checkerboard");
        primaryStage.show();

    }
}
