package PostCollege1.CollegeRecap;

import java.lang.String;
import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

public class ViewImage extends Application{

    public static void main(String[] args){
        Application.launch(args);
    }

    @Override
    public void start(Stage primaryStage){

        ImageView imageView1 = new ImageView("https://www.rd.com/wp-content/uploads/2019/10/1-Hello-760x506.jpg");

        GridPane pane = new GridPane();
        pane.setHgap(5.5);
        pane.setVgap(5.5);
        pane.setAlignment(Pos.CENTER);

        pane.add(imageView1, 0,1);

        Scene scene = new Scene(pane);
        primaryStage.setTitle("Show Image");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

}
