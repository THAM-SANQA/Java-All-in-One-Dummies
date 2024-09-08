package book6.chap1;

import javafx.application.*;
import javafx.stage.*;
import javafx.scene.*;
import javafx.scene.layout.*;
import javafx.scene.control.*;

/**
 * @author thamsanqa 2024
 **/
public class ClickMe extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    Button btn;

    @Override
    public void start(Stage primaryStage) {
        //create button
        btn = new Button();
        btn.setText("Click me please!");
        btn.setOnAction(e -> buttonClick());
        //ass the button to a layout pane
        BorderPane pane = new BorderPane();
        pane.setCenter(btn);
        //add the layout pane to a scene
        Scene scene = new Scene(pane, 300, 250);
        //finalise and show the stage
        primaryStage.setScene(scene);
        primaryStage.setTitle("The click me app");
        primaryStage.show();
    }
    public void buttonClick(){
        if (btn.getText() == "Click me please!")
            btn.setText("You clicked me!");
        else
            btn.setText("Click me please!");
    }
}
