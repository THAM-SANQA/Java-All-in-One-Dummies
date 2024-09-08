module book6 {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.desktop;
    requires java.sql;

    // Open chapters/packages for FXML
    opens book6.chap1 to javafx.fxml;
    opens book6.chap2 to javafx.fxml;
    opens book6.chap3 to javafx.fxml;
    opens book6.chap4 to javafx.fxml;

    // Export all chapters/packages so JavaFX and other modules can use them
    exports book6.chap1;
    exports book6.chap2;
    exports book6.chap3;
    exports book6.chap4;
}


