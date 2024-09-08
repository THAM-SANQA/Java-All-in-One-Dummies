package book6.chap3;

import javafx.application.*;
import javafx.fxml.FXMLLoader;
import javafx.stage.*;
import javafx.scene.*;
import javafx.scene.layout.*;
import javafx.scene.control.*;
import javafx.geometry.*;

import java.io.IOException;
import java.util.*;

public class ClickCounterExit extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    Stage stage;
    int ClickCount = 0;

    @Override
    public void start(Stage primaryStage) {
        stage = primaryStage;
        //Button
        Button clickBtn = new Button();
        clickBtn.setText("Click Me!");
        clickBtn.setOnAction(e -> clickBtn_Click());

        Button closeBtn = new Button();
        closeBtn.setText("Close");
        closeBtn.setOnAction(e -> closeBtn_Click());

        //Layout pane
        VBox pane = new VBox(10);
        pane.getChildren().addAll(clickBtn, closeBtn);
        pane.setAlignment(Pos.CENTER);

        //Scene
        Scene scene = new Scene(pane, 250, 150);

        //finish and show
        primaryStage.setScene(scene);
        primaryStage.setTitle("Click Counter");
        primaryStage.setOnCloseRequest(e -> {
            e.consume();
            closeBtn_Click();
        });
        primaryStage.show();
    }

    public void clickBtn_Click()
    {
        ClickCount++;
        if (ClickCount == 1)
        {
            Alert a = new Alert(Alert.AlertType.INFORMATION, "You have clicked once." );
            a.showAndWait();
        }
        else
        {
            Alert a = new Alert(Alert.AlertType.INFORMATION, "You have clicked " + ClickCount + " times.");
            a.showAndWait();
        }
    }
    public void closeBtn_Click()
    {
        Alert a = new Alert(Alert.AlertType.CONFIRMATION,
                "Are you sure you want to quit?",
                ButtonType.YES, ButtonType.NO);
        Optional<ButtonType> confirm = a.showAndWait();
        if (confirm.isPresent() && confirm.get() == ButtonType.YES)
        {
            stage.close();
        }
    }
}

