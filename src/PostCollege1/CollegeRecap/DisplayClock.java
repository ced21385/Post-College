package PostCollege1.CollegeRecap;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.scene.control.Label;

public class DisplayClock extends Application{

    @Override
    public void start(Stage primaryStage){

        ClockPane clock = new ClockPane();
        String time = clock.getHour() + ":" + clock.getMinute() + ":" + clock.getSecond();
        Label currentTime = new Label(time);

        BorderPane pane = new BorderPane();
        pane.setCenter(clock);
        pane.setBottom(currentTime);
        BorderPane.setAlignment(currentTime, Pos.TOP_CENTER);

        Scene scene = new Scene(pane,250,250);
        primaryStage.setTitle("Display Clock");
        primaryStage.setScene(scene);
        primaryStage.show();

    }
}
