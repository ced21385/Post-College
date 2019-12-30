package PostCollege1.CollegeRecap;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.control.Button;
import javafx.scene.Scene;

public class GUITest2 extends Application{
    @Override
    public void start(Stage primaryStage){
        Button butt = new Button("you got it!");
        Scene scene = new Scene(butt,200,250);
        primaryStage.setTitle("GUITest2");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    public static void main(String[] args){
        Application.launch(args);
    }
}
