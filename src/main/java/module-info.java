module dk.haliimo.demodemogit {
    requires javafx.controls;
    requires javafx.fxml;


    opens dk.haliimo.demodemogit to javafx.fxml;
    exports dk.haliimo.demodemogit;
}