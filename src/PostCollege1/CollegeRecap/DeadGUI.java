package PostCollege1.CollegeRecap;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.TextField;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.control.ToggleGroup;
import javafx.event.ActionEvent;

public class DeadGUI extends Pane {

    DeadGUI() {
    }

    private Button deadInside = new Button("Click Here");
    private TextField areYou = new TextField("Are you dead inside?");

    private Pane DeadPane;
    private GridPane pane;
    private HBox radioGroupPane = new HBox();

    {

        pane.setAlignment(Pos.TOP_CENTER);

        pane.setPadding(new Insets(10));
        pane.setHgap(5);
        pane.setVgap(5);

        pane.add(areYou, 1, 0);
        pane.add(deadInside, 3, 0);

        DeadPane = pane;

    }
}


