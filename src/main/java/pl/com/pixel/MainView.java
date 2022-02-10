package pl.com.pixel;

import javafx.beans.property.Property;
import javafx.beans.property.SimpleObjectProperty;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class MainView extends StackPane {

    private final Button button = new Button("New window");

    public MainView() {
        getChildren().add(button);

        button.setOnAction(event -> {
                Stage stage = new Stage();
                stage.setScene(new Scene(new AuxView(), 200, 200));
                stage.show();
        });
    }
}