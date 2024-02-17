module fr.projectultron.aycalculator {
    requires javafx.controls;
    requires javafx.fxml;


    opens fr.projectultron.aycalculator to javafx.fxml;
    exports fr.projectultron.aycalculator;
}