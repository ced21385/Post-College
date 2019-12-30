package PostCollege1.CollegeRecap;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;

public class GUITest extends Application {
    @Override
    public void start(Stage primaryStage){
        Button bt = new Button("Ok");
        Scene scene = new Scene(bt,250,250);
        primaryStage.setTitle("GUITest");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    public static void main(String[] args){
        Application.launch(args);
    }
}
