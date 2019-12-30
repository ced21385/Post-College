package PostCollege1.CollegeRecap;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;

public class ButtonInPane extends Application {
    @Override
    public void start(Stage primaryStage){

        StackPane pane = new StackPane();
        pane.getChildren().add(new Button("Ok"));
        Scene scene = new Scene(pane,200,50);
        primaryStage.setTitle("Button in a Pane");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

}
