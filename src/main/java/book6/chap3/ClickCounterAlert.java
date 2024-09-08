package book6.chap3;

import javafx.application.*;
import javafx.fxml.FXMLLoader;
import javafx.stage.*;
import javafx.scene.*;
import javafx.scene.layout.*;
import javafx.scene.control.*;

import java.io.IOException;

public class ClickCounterAlert extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    Button btn;
    Label labl;
    int ClickCount;

    @Override
    public void start(Stage primaryStage) {
        //Creating button
        btn = new Button();
        btn.setText("Click Me!");
        btn.setOnAction(e -> btn_Click());

        //Button layout
        BorderPane pane = new BorderPane();
        pane.setCenter(btn);

        //Scene
        Scene scene = new Scene(pane, 250, 150);

        //Add stage
        primaryStage.setScene(scene);
        primaryStage.setTitle("Click Counter");
        primaryStage.show();
    }

    public void btn_Click() {
        ClickCount++;
        if(ClickCount == 1) {
            Alert a = new Alert(Alert.AlertType.INFORMATION, "You've clicked once.");
            a.showAndWait();
        }else {
            Alert a = new Alert(Alert.AlertType.INFORMATION, "You've clicked " + ClickCount + " times.");
            a.showAndWait();
        }
    }
}
