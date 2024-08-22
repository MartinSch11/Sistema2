package com.mycompany.controlador;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javax.swing.JOptionPane;

public class LoginVentanaController implements Initializable {

    @FXML
    private Button buttonAdmin;
    
    @FXML
    private void eventButton(ActionEvent event){
        JOptionPane.showMessageDialog(null, "Hola Mundo");
    }
            
    @Override
    public void initialize(URL url, ResourceBundle rb) {

    }    
    
}
