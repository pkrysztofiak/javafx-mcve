package pl.com.pixel;

import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.Region;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;

public class AuxView extends StackPane {

    public AuxView() {
        Button button = new Button("Click me!");
        Label label = new Label();
        VBox vBox = new VBox(button, label);
        vBox.setMaxSize(Region.USE_PREF_SIZE, Region.USE_PREF_SIZE);
        StackPane stackPane = new StackPane(vBox);

        button.setOnAction(event -> label.setText("Clicked"));

        getChildren().add(stackPane);
    }
}