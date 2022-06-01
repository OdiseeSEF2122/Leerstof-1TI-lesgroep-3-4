package be.odisee.encryptie;

import javafx.fxml.FXML;
import javafx.scene.control.*;

/**
 * implements a controller for encryptie-view
 */
public class EncryptieController {
    @FXML
    private TextField txtOrigineel, txtVersleuteld;

    @FXML
    private RadioButton btnAchterstevoren, btnEigen;

    /**
     * klik op encrypt button
     */
    @FXML
    protected void onEncryptButtonClick() {
        Encryptie onzeMethode;
        if(btnAchterstevoren.isSelected()){
            onzeMethode = new Achterstevoren();
        }else if(btnEigen.isSelected()){
            onzeMethode = new EigenMethode(5);
        } else {
            Alert alert = new Alert(Alert.AlertType.NONE, "Please select an encryption method", ButtonType.CLOSE);
            alert.show();
            return;
        }
        txtVersleuteld.setText(onzeMethode.encrypt(txtOrigineel.getText()));

    }

    /**
     * klik op decrypt button
     */
    @FXML
    protected void onDecryptButtonClick() {
        if(btnAchterstevoren.isSelected()){
            Achterstevoren achterstevoren = new Achterstevoren();
            txtOrigineel.setText(achterstevoren.decrypt(txtVersleuteld.getText()));
        }else if(btnEigen.isSelected()){
            EigenMethode eigen = new EigenMethode(5);
            txtOrigineel.setText(eigen.decrypt(txtVersleuteld.getText()));
        } else {
            Alert alert = new Alert(Alert.AlertType.NONE, "Please select an encryption method", ButtonType.CLOSE);
            alert.show();
        }
    }
}