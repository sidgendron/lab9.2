package org.champlain.prog2.partneractivity;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class HelloController {
    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }

    @FXML
    protected void onSydneyButtonClick() {
        welcomeText.setText("Hi Keren!");
    }
}
