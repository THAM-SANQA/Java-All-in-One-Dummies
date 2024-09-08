package book6.chap3;

import javafx.application.*;
import javafx.fxml.FXMLLoader;
import javafx.stage.*;
import javafx.scene.*;
import javafx.scene.layout.*;
import javafx.scene.control.*;
import javafx.event.*;

import java.io.IOException;

public class SceneSwitcher extends Application{

    public static void main(String[] args) {
        launch(args);
    }

    //Click Counter Scene
    int ClickCount = 0;
    Label lablClick;
    Button btnClick;
    Button btnScene2;
    Scene scene1;

    //Add Subtract Button
    int Counter = 0;
    Label lablCounter;
    Button add;
    Button subtract;
    Button btnScene1;
    Scene scene2;

    Stage stage;

    @Override
    public void start(Stage primaryStage) {
        stage = primaryStage;
        //click-counter scene
        lablClick = new Label();
        lablClick.setText("You have not clicked me yet.");

        btnClick = new Button();
        btnClick.setText("Click Me!");
        btnClick.setOnAction(e -> btnClick_Click());

        btnScene2= new Button();
        btnScene2.setText("Switch");
        btnScene2.setOnAction(e -> btnScene2_Click());

        VBox pane1 = new VBox(10);
        pane1.getChildren().addAll(lablClick, btnClick, btnScene2);

        scene1 = new Scene(pane1, 250, 150);

        //add-subtract scene
        lablCounter = new Label();
        lablCounter.setText(Integer.toString(Counter));

        add = new Button();
        add.setText("Add");
        add.setOnAction(e -> add_Click());

        subtract = new Button();
        subtract.setText("Subtract");
        subtract.setOnAction(e -> subtract_Click());

        btnScene2 = new Button();
        btnScene2.setText("Switch");
        btnScene2.setOnAction(e -> btnScene1_Click());

        HBox pane2 = new HBox(10);
        pane2.getChildren().addAll(lablCounter, add, subtract, btnScene2);

        scene2 = new Scene(pane2, 300, 75);

        primaryStage.setScene(scene1);
        primaryStage.setTitle("Scene Switcher");
        primaryStage.show();
    }

    //events for scene 1
    public void btnClick_Click() {
        ClickCount++;
        if (ClickCount == 1) {
            lablClick.setText("You have clicked once.");
        }
        else
        {
            lablClick.setText("You have clicked " + ClickCount + " times." );
        }
    }

    private void btnScene2_Click() {
        stage.setScene(scene2);
    }

    //events for scene 2
    private void add_Click()
    {
        Counter++;
        lablCounter.setText(Integer.toString(Counter));
    }
    private void subtract_Click()
    {
        Counter--;
        lablCounter.setText(Integer.toString(Counter));
    }
    private void btnScene1_Click()
    {
        stage.setScene(scene1);
    }
}


