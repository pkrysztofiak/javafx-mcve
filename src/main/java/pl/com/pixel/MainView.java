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
    private final Property<AuxView> auxViewProperty = new SimpleObjectProperty<>();

    public MainView() {
        getChildren().add(button);

        auxViewProperty.addListener((observable, oldValue, auxView) -> {
            if (oldValue != null) {
                oldValue.getScene().getWindow().hide();
            }
            if (auxView != null) {
                Stage stage = new Stage();
                stage.setScene(new Scene(auxView, 200, 200));
                stage.show();
            }
        });

        button.setOnAction(event -> auxViewProperty.setValue(new AuxView()));


    }
}