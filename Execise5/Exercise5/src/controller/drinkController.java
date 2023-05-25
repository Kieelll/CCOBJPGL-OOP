package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Alert.AlertType;
import model.*;

public class drinkController {

    @FXML
    Button vita, whey, water, nestea, milo;

    milo mil = new milo();
    nestea nest = new nestea();
    pocari poca = new pocari();
    vitamilk vitam = new vitamilk();
    whey whe = new whey();

    public void initialize() {

        mil.setPrice(10);
        mil.setTaste("Very Sweet");

        nest.setPrice(25);
        nest.setTaste("Sweet");

        poca.setPrice(35);
        poca.setTaste("Very Sweet");

        vitam.setPrice(20);
        vitam.setTaste("Sweet");

        whe.setPrice(2500);
        whe.setTaste("Very Sweet");



    }

    public void showInfo(ActionEvent event) {

        Button sourceButton = (Button) event.getSource();
        Alert alert = new Alert(AlertType.INFORMATION);

        if (sourceButton.equals(vita)) {
            alert.setContentText("VITAMLIK is " + vitam.getPrice() + " and " + vitam.getTaste());
        }

        if (sourceButton == water) {
            alert.setContentText("WATER is " + poca.getPrice() + " and " + poca.getTaste());
        }
        if (sourceButton == whey) {
            alert.setContentText("WHEY is " + whe.getPrice() + " and " + whe.getTaste());
        }
        if (sourceButton == nestea) {
            alert.setContentText("NESTEA is " + nest.getPrice() + " and " + nest.getTaste());
        }
        if (sourceButton == milo) {
            alert.setContentText("MILO is " + mil.getPrice() + " and " + mil.getTaste());
        }

        alert.showAndWait();

    }
}
