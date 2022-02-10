package pl.com.pixel;

import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;

public class AuxView extends StackPane {

    public AuxView() {
        getChildren().add(new Label("Aux view"));
    }
}